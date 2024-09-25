package com.example.antoproject.data

import android.app.ProgressDialog
import android.content.Context
import android.net.Uri
import android.widget.Toast
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.navigation.NavController
import com.example.antoproject.models.Donation
import com.example.antoproject.models.Product
import com.example.antoproject.navigation.ADD_DONATION_URL
import com.example.antoproject.navigation.ADD_PRODUCTS_URL
import com.example.antoproject.navigation.ROUT_LOGIN
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.storage.FirebaseStorage

class DonationViewModel(var navController: NavController, var context: Context) {
    var authViewModel:AuthViewModel
    var progress: ProgressDialog
    init {
        authViewModel = AuthViewModel(navController, context)
        if (!authViewModel.isLoggedIn()){
            navController.navigate(ROUT_LOGIN)
        }
        progress = ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("Please wait...")
    }

    fun uploadDonation(name:String, age:String, weight:String, date:String, phone: String, state: String, druguse: String, filePath: Uri){
        val donationId = System.currentTimeMillis().toString()
        val storageRef = FirebaseStorage.getInstance().getReference()
            .child("Donations/$donationId")
        progress.show()
        storageRef.putFile(filePath).addOnCompleteListener{
            progress.dismiss()
            if (it.isSuccessful){
                // Save data to db
                storageRef.downloadUrl.addOnSuccessListener {
                    var imageUrl = it.toString()
                    var donation = Donation(name,age,weight,date,phone,state,druguse,imageUrl,donationId)
                    var databaseRef = FirebaseDatabase.getInstance().getReference()
                        .child("Donations/$donationId")
                    databaseRef.setValue(donation).addOnCompleteListener {
                        if (it.isSuccessful){
                            Toast.makeText(this.context, "Thankyou for registering", Toast.LENGTH_SHORT).show()
                        }else{
                            Toast.makeText(this.context, "Error", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }else{
                Toast.makeText(this.context, "Upload error", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun allDonations(
        donation: MutableState<Donation>,
        donations: SnapshotStateList<Donation>
    ): SnapshotStateList<Donation> {
        progress.show()
        var ref = FirebaseDatabase.getInstance().getReference()
            .child("Donations")
        ref.addValueEventListener(object: ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                donations.clear()
                for (snap in snapshot.children){
                    var retrievedDonation = snap.getValue(Donation::class.java)
                    donation.value = retrievedDonation!!
                    donations.add(retrievedDonation)
                }
                progress.dismiss()
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(context, "DB locked", Toast.LENGTH_SHORT).show()
            }
        })
        return donations
    }

    fun updateDonation(donationId:String){
        var ref = FirebaseDatabase.getInstance().getReference()
            .child("Donations/$donationId")
        ref.removeValue()
        navController.navigate(ADD_DONATION_URL)
    }


    fun deleteDonation(donationId:String){
        var ref = FirebaseDatabase.getInstance().getReference()
            .child("Donations/$donationId")
        ref.removeValue()
        Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
    }
}
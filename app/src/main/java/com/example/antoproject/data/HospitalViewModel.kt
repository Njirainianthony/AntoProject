package com.example.antoproject.data

import android.app.ProgressDialog
import android.content.Context
import android.net.Uri
import android.widget.Toast
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.navigation.NavController
import com.example.antoproject.models.Hospital
import com.example.antoproject.models.Product
import com.example.antoproject.navigation.ADD_PRODUCTS_URL
import com.example.antoproject.navigation.ROUT_LOGIN
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.storage.FirebaseStorage

class HospitalViewModel(var navController: NavController, var context: Context) {
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

    fun uploadHospital(name:String,filePath: Uri){
        val hospitalId = System.currentTimeMillis().toString()
        val storageRef = FirebaseStorage.getInstance().getReference()
            .child("Hospitals/$hospitalId")
        progress.show()
        storageRef.putFile(filePath).addOnCompleteListener{
            progress.dismiss()
            if (it.isSuccessful){
                // Save data to db
                storageRef.downloadUrl.addOnSuccessListener {
                    var imageUrl = it.toString()
                    var hospital = Hospital(name,imageUrl,hospitalId)
                    var databaseRef = FirebaseDatabase.getInstance().getReference()
                        .child("Hospitals/$hospitalId")
                    databaseRef.setValue(hospital).addOnCompleteListener {
                        if (it.isSuccessful){
                            Toast.makeText(this.context, "Success", Toast.LENGTH_SHORT).show()
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

    fun allHospitals(
        hospital: MutableState<Hospital>,
        hospitals: SnapshotStateList<Hospital>
    ): SnapshotStateList<Hospital> {
        progress.show()
        var ref = FirebaseDatabase.getInstance().getReference()
            .child("Hospitals")
        ref.addValueEventListener(object: ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                hospitals.clear()
                for (snap in snapshot.children){
                    var retrievedHospital = snap.getValue(Hospital::class.java)
                    hospital.value = retrievedHospital!!
                    hospitals.add(retrievedHospital)
                }
                progress.dismiss()
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(context, "DB locked", Toast.LENGTH_SHORT).show()
            }
        })
        return hospitals
    }

    fun updateHospital(hospitalId:String){
        var ref = FirebaseDatabase.getInstance().getReference()
            .child("Hospitals/$hospitalId")
        ref.removeValue()
        navController.navigate(ADD_PRODUCTS_URL)
    }


    fun deleteHospital(hospitalId:String){
        var ref = FirebaseDatabase.getInstance().getReference()
            .child("Hospitals/$hospitalId")
        ref.removeValue()
        Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
    }
}
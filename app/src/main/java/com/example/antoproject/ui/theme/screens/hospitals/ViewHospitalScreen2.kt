package com.example.antoproject.ui.theme.screens.hospitals

import android.annotation.SuppressLint
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.example.antoproject.R
import com.example.antoproject.data.HospitalViewModel
import com.example.antoproject.data.ProductViewModel
import com.example.antoproject.models.Hospital
import com.example.antoproject.models.Product
import com.example.antoproject.ui.theme.Bluey

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ViewHospital2Screen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize()) {

        var context = LocalContext.current
        var hospitalRepository = HospitalViewModel(navController, context)


        val emptyHospitalState = remember { mutableStateOf(Hospital("","","")) }
        var emptyHospitalListState = remember { mutableStateListOf<Hospital>() }

        var hospitals = hospitalRepository.allHospitals(emptyHospitalState, emptyHospitalListState)


        var selected by remember { mutableIntStateOf(0) }
        Scaffold(
            topBar = {
                TopAppBar(
                    modifier = Modifier.padding(bottom = 40.dp),
                    colors = TopAppBarDefaults.topAppBarColors(Color.Black),
                    title = {
                        Row {

                            Image(painter = painterResource(id = R.drawable.wardicon),
                                contentDescription = "home",
                                modifier = Modifier.size(20.dp),
                                colorFilter = ColorFilter.tint(Color.White)
                            )

                            Text(
                                text = "Hospital Sections",
                                modifier = Modifier
                                    .fillMaxWidth(),
                                textAlign = TextAlign.Center,
                                fontSize = 20.sp,
                                fontFamily = FontFamily.Serif,
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            )

                        }
                    }
                )

            },

            //Content Section
            content = @Composable {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Bluey),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "All Sections",
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.Red)

                    Spacer(modifier = Modifier.height(50.dp))

                    LazyColumn(){
                        items(hospitals){
                            HospitalItem2(
                                name = it.name,
                                id = it.id,
                                navController = navController,
                                hospitalRepository = hospitalRepository,
                                hospitalImage = it.imageUrl
                            )
                        }
                    }
                }

            }

        )
    }
}







@Composable
fun HospitalItem2(name:String, id:String,
                navController: NavController,
                hospitalRepository: HospitalViewModel, hospitalImage:String) {

    //1 item
    Column(modifier = Modifier
        .fillMaxWidth(),
        verticalArrangement = Arrangement.Center
    ) {
        Card (modifier = Modifier
            .height(300.dp)
            .padding(bottom = 20.dp, top = 20.dp)
            .fillMaxWidth()
        ) {
            Box (modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center) {
                Image(
                    painter = rememberAsyncImagePainter(hospitalImage),
                    contentDescription = "null",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )


                Row (modifier = Modifier.align(Alignment.BottomStart)) {
                    Column (modifier = Modifier
                        .background(
                            brush = Brush.verticalGradient(
                                colors = listOf(
                                    Color.Transparent,
                                    Color.Black
                                )
                            )
                        )
                        .fillMaxWidth()
                    ) {
                        //details

                        Text(text = "Name : $name",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.ExtraBold,
                            fontFamily = FontFamily.Serif,
                            color = Color.White
                        )

                    }
                }

            }
        }
        //end 1 item

    }
}



@Composable
@Preview(showBackground = true)
fun ViewHospital2ScreenPreview(){

    ViewHospital2Screen(navController = rememberNavController())

}
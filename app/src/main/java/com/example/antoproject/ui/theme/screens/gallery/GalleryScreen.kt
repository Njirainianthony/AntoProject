package com.example.antoproject.ui.theme.screens.gallery

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.antoproject.R
import com.example.antoproject.navigation.ROUT_HOME
import com.example.antoproject.navigation.VIEW_DOCTORS2_URL
import com.example.antoproject.navigation.VIEW_DOCTORS_URL
import com.example.antoproject.navigation.VIEW_HOSPITAL2_URL
import com.example.antoproject.navigation.VIEW_NURSES2_URL
import com.example.antoproject.navigation.VIEW_NURSES_URL
import com.example.antoproject.navigation.VIEW_PRODUCTS2_URL
import com.example.antoproject.navigation.VIEW_PRODUCTS_URL
import com.example.antoproject.ui.theme.Bluey
import com.example.antoproject.ui.theme.screens.doctors.DoctorItem2

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable

fun GalleryScreen(navController: NavController){

    Column(modifier = Modifier.fillMaxSize()) {

        var selected by remember { mutableIntStateOf(0) }
        Scaffold(

            topBar = {
                TopAppBar(
                    modifier = Modifier.padding(bottom = 40.dp),
                    colors = TopAppBarDefaults.topAppBarColors(Color.Black),
                    title = {
                        Row {

                            Image(painter = painterResource(id = R.drawable.galleryicon),
                                contentDescription = "home",
                                modifier = Modifier.size(20.dp),
                                colorFilter = ColorFilter.tint(Color.White)
                            )

                            Text(text = "GALLERY",
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

                Card(colors = CardDefaults.cardColors(Bluey),
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 20.dp, top = 90.dp, end = 20.dp, bottom = 20.dp)
                        .verticalScroll(rememberScrollState()),
                    shape = RoundedCornerShape(20.dp)
                ) {
                    //ROW 1

                    Row (modifier = Modifier.fillMaxWidth()){
                        //CARD 1
                        Card (modifier = Modifier
                            .fillMaxWidth()
                            .height(230.dp)
                            .padding(20.dp)
                            .clickable { navController.navigate(VIEW_DOCTORS2_URL) },
                            elevation = CardDefaults.cardElevation(30.dp)
                        ){

                            Column() {

                                Spacer(modifier = Modifier.height(20.dp))


                                Box (modifier = Modifier.fillMaxWidth(),
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(painter = painterResource(id = R.drawable.doctoricon),
                                        contentDescription = "home",
                                        modifier = Modifier.size(70.dp)
                                    )

                                }

                                Spacer(modifier = Modifier.height(15.dp))

                                Text(
                                    text = "View Doctors",
                                    fontSize = 18.sp,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold
                                )

                                Spacer(modifier = Modifier.height(10.dp))

                            }


                        }
                        //END OF CARD 1

                    }

                    //END OF ROW 1

                    Spacer(modifier = Modifier.height(20.dp))

                    //ROW 2

                    Row (modifier = Modifier.fillMaxWidth()){
                        //CARD 1
                        Card (modifier = Modifier
                            .fillMaxWidth()
                            .height(230.dp)
                            .padding(20.dp)
                            .clickable { navController.navigate(VIEW_NURSES2_URL) },
                            elevation = CardDefaults.cardElevation(30.dp)
                        ){

                            Column() {

                                Spacer(modifier = Modifier.height(20.dp))


                                Box (modifier = Modifier.fillMaxWidth(),
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(painter = painterResource(id = R.drawable.nurseicon),
                                        contentDescription = "home",
                                        modifier = Modifier.size(70.dp)
                                    )

                                }

                                Spacer(modifier = Modifier.height(15.dp))

                                Text(
                                    text = "View Nurses",
                                    fontSize = 18.sp,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold
                                )

                                Spacer(modifier = Modifier.height(10.dp))

                            }


                        }
                        //END OF CARD 1

                    }

                    //END OF ROW 2

                    Spacer(modifier = Modifier.height(20.dp))

                    //ROW 3

                    Row (modifier = Modifier.fillMaxWidth()){
                        //CARD 1
                        Card (modifier = Modifier
                            .fillMaxWidth()
                            .height(230.dp)
                            .padding(20.dp)
                            .clickable { navController.navigate(VIEW_HOSPITAL2_URL) },
                            elevation = CardDefaults.cardElevation(30.dp)
                        ){

                            Column() {

                                Spacer(modifier = Modifier.height(20.dp))


                                Box (modifier = Modifier.fillMaxWidth(),
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(painter = painterResource(id = R.drawable.wardicon),
                                        contentDescription = "home",
                                        modifier = Modifier.size(70.dp)
                                    )

                                }

                                Spacer(modifier = Modifier.height(15.dp))

                                Text(
                                    text = "View Hospital",
                                    fontSize = 18.sp,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold
                                )

                                Spacer(modifier = Modifier.height(10.dp))

                            }


                        }
                        //END OF CARD 1

                    }

                    //END OF ROW 4

                }


            }

        )



    }

}




@Composable
@Preview(showBackground = true)
fun GalleryScreenPreview(){
    GalleryScreen(rememberNavController())


}
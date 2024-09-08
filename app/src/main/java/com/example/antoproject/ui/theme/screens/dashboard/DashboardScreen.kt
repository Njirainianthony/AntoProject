package com.example.antoproject.ui.theme.screens.dashboard

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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.antoproject.R
import com.example.antoproject.navigation.ADD_BOOKING_URL
import com.example.antoproject.navigation.ROUT_ABOUT
import com.example.antoproject.navigation.ROUT_ADMIN
import com.example.antoproject.navigation.ROUT_GALLERY
import com.example.antoproject.navigation.ROUT_HOME
import com.example.antoproject.navigation.VIEW_DOCTORS_URL
import com.example.antoproject.navigation.VIEW_PRODUCTS2_URL
import com.example.antoproject.navigation.VIEW_PRODUCTS_URL
import com.example.antoproject.ui.theme.Bluey
import com.example.antoproject.ui.theme.screens.doctors.DoctorItem2

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable

fun DashboardScreen(navController: NavController){

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var selected by remember { mutableIntStateOf(0) }
        Scaffold(

            topBar = {
                TopAppBar(
                    modifier = Modifier.padding(bottom = 200.dp),
                    colors = TopAppBarDefaults.topAppBarColors(Color.Black),
                    title = {
                        Row {
                            Image(painter = painterResource(id = R.drawable.hospitalicon),
                                contentDescription = "home",
                                modifier = Modifier.size(20.dp),
                                colorFilter = ColorFilter.tint(Color.White)
                            )


                            Text(text = "DASHBOARD",
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

                Text(
                    text = "Welcome to the dashboard",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.Black,
                    fontWeight = FontWeight.ExtraBold

                )

                Spacer(modifier = Modifier.height(20.dp))





                //START OF MAIN CARD
                Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(850.dp)
                        .padding(top = 100.dp)
                        .verticalScroll(rememberScrollState()),

                    colors = CardDefaults.cardColors(Bluey)

                ){

                    Spacer(modifier = Modifier.height(30.dp))

                    //ROW 1

                    Row (modifier = Modifier.padding(20.dp)){
                        //CARD 1
                        Card (modifier = Modifier
                            .width(170.dp)
                            .height(180.dp)
                            .clickable { navController.navigate(ROUT_HOME) },
                            elevation = CardDefaults.cardElevation(30.dp)
                        ){

                            Column() {

                                Spacer(modifier = Modifier.height(20.dp))


                                Box (modifier = Modifier.fillMaxWidth(),
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(painter = painterResource(id = R.drawable.homeicon),
                                        contentDescription = "home",
                                        modifier = Modifier.size(70.dp)
                                    )

                                }

                                Spacer(modifier = Modifier.height(15.dp))

                                Text(
                                    text = "Home",
                                    fontSize = 18.sp,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold
                                )

                            }


                        }
                        //END OF CARD 1

                        Spacer(modifier = Modifier.width(35.dp))

                        //CARD 2
                        Card (modifier = Modifier
                            .width(170.dp)
                            .height(180.dp)
                            .clickable { navController.navigate(ROUT_ABOUT) },
                            elevation = CardDefaults.cardElevation(30.dp)
                        ){

                            Column() {

                                Spacer(modifier = Modifier.height(20.dp))


                                Box (modifier = Modifier.fillMaxWidth(),
                                    contentAlignment = Alignment.Center
                                ){

                                    Image(painter = painterResource(id = R.drawable.abouticon),
                                        contentDescription = "home",
                                        modifier = Modifier.size(70.dp)
                                    )


                                }

                                Spacer(modifier = Modifier.height(15.dp))

                                Text(
                                    text = "About Us",
                                    fontSize = 18.sp,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold
                                )

                            }


                        }
                        //END OF CARD 2


                    }
                    //END OF ROW 1



                    //ROW 2

                    Row (modifier = Modifier.padding(20.dp)){
                        //CARD 1
                        Card (modifier = Modifier
                            .width(170.dp)
                            .height(180.dp)
                            .clickable { navController.navigate(ADD_BOOKING_URL) },
                            elevation = CardDefaults.cardElevation(30.dp)
                        ){

                            Column() {

                                Spacer(modifier = Modifier.height(20.dp))


                                Box (modifier = Modifier.fillMaxWidth(),
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(painter = painterResource(id = R.drawable.bookingicon),
                                        contentDescription = "home",
                                        modifier = Modifier.size(70.dp)
                                    )

                                }

                                Spacer(modifier = Modifier.height(15.dp))

                                Text(
                                    text = "Book Appointment",
                                    fontSize = 18.sp,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold
                                )

                            }


                        }
                        //END OF CARD 1

                        Spacer(modifier = Modifier.width(35.dp))

                        //CARD 2
                        Card (modifier = Modifier
                            .width(170.dp)
                            .height(180.dp)
                            .clickable { navController.navigate(VIEW_PRODUCTS2_URL) },
                            elevation = CardDefaults.cardElevation(30.dp)
                        ){

                            Column() {

                                Spacer(modifier = Modifier.height(20.dp))


                                Box (modifier = Modifier.fillMaxWidth(),
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(painter = painterResource(id = R.drawable.pharmacyicon),
                                        contentDescription = "home",
                                        modifier = Modifier.size(70.dp)
                                    )

                                }

                                Spacer(modifier = Modifier.height(15.dp))

                                Text(
                                    text = "Pharmacy",
                                    fontSize = 18.sp,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold
                                )

                            }


                        }
                        //END OF CARD 2


                    }
                    //END OF ROW 2


                    //ROW 3

                    Row (modifier = Modifier.padding(20.dp)){
                        //CARD 1
                        Card (modifier = Modifier
                            .width(170.dp)
                            .height(180.dp)
                            .clickable { navController.navigate(ROUT_ADMIN) },
                            elevation = CardDefaults.cardElevation(30.dp)
                        ){

                            Column() {

                                Spacer(modifier = Modifier.height(20.dp))


                                Box (modifier = Modifier.fillMaxWidth(),
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(painter = painterResource(id = R.drawable.adminicon),
                                        contentDescription = "home",
                                        modifier = Modifier.size(70.dp)
                                    )

                                }

                                Spacer(modifier = Modifier.height(15.dp))

                                Text(
                                    text = "Admin Section",
                                    fontSize = 18.sp,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold
                                )

                            }


                        }
                        //END OF CARD 1

                        Spacer(modifier = Modifier.width(35.dp))

                        //CARD 2
                        Card (modifier = Modifier
                            .width(170.dp)
                            .height(180.dp)
                            .clickable { navController.navigate(ROUT_GALLERY) },
                            elevation = CardDefaults.cardElevation(30.dp)
                        ){

                            Column() {

                                Spacer(modifier = Modifier.height(20.dp))


                                Box (modifier = Modifier.fillMaxWidth(),
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(painter = painterResource(id = R.drawable.galleryicon),
                                        contentDescription = "home",
                                        modifier = Modifier.size(70.dp)
                                    )

                                }

                                Spacer(modifier = Modifier.height(15.dp))

                                Text(
                                    text = "Gallery Section",
                                    fontSize = 18.sp,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold
                                )

                            }


                        }
                        //END OF CARD 2


                    }
                    //END OF ROW 3





                }

                //END OF MAIN CARD


            }

        )

        Spacer(modifier = Modifier.height(40.dp))








    }

}




@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())


}
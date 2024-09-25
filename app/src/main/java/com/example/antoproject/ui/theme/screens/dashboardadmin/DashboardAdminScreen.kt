package com.example.antoproject.ui.theme.screens.dashboardadmin

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.antoproject.R
import com.example.antoproject.navigation.ADD_DOCTORS_URL
import com.example.antoproject.navigation.ADD_HOSPITAL_URL
import com.example.antoproject.navigation.ADD_NURSES_URL
import com.example.antoproject.navigation.ADD_PRODUCTS_URL
import com.example.antoproject.navigation.ROUT_ABOUT
import com.example.antoproject.navigation.ROUT_ADMIN
import com.example.antoproject.navigation.ROUT_GALLERY
import com.example.antoproject.navigation.ROUT_HOME
import com.example.antoproject.navigation.VIEW_BOOKING_URL
import com.example.antoproject.navigation.VIEW_DOCTORS_URL
import com.example.antoproject.navigation.VIEW_DONATION_URL
import com.example.antoproject.navigation.VIEW_HOSPITAL_URL
import com.example.antoproject.navigation.VIEW_NURSES_URL
import com.example.antoproject.navigation.VIEW_PRODUCTS_URL
import com.example.antoproject.ui.theme.Bluey

@Composable

fun DashboardAdminScreen(navController: NavController){


    Column(modifier = Modifier
        .fillMaxSize()
        ) {

        Card(colors = CardDefaults.cardColors(Bluey),
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 30.dp, bottom = 20.dp)
                .verticalScroll(rememberScrollState())
        ) {

            //ROW 1

            Row (modifier = Modifier.padding(20.dp)){
                //CARD 1
                Card (modifier = Modifier
                    .width(163.dp)
                    .height(180.dp)
                    .clickable { navController.navigate(ADD_DOCTORS_URL) },
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
                            text = "Add Doctors",
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
                    .clickable { navController.navigate(VIEW_DOCTORS_URL) },
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

                    }


                }
                //END OF CARD 2


            }
            //END OF ROW 1



            //ROW 2

            Row (modifier = Modifier.padding(20.dp)){
                //CARD 1
                Card (modifier = Modifier
                    .width(163.dp)
                    .height(180.dp)
                    .clickable { navController.navigate(ADD_NURSES_URL) },
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
                            text = "Add Nurses",
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
                    .width(163.dp)
                    .height(180.dp)
                    .clickable { navController.navigate(VIEW_NURSES_URL) },
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

                    }


                }
                //END OF CARD 2


            }
            //END OF ROW 2



            //ROW 3

            Row (modifier = Modifier.padding(20.dp)){
                //CARD 1
                Card (modifier = Modifier
                    .width(163.dp)
                    .height(180.dp)
                    .clickable { navController.navigate(ADD_HOSPITAL_URL) },
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
                            text = "Add Hospital",
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
                    .clickable { navController.navigate(VIEW_HOSPITAL_URL) },
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
                            text = "View Hospitals",
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

            //ROW 4

            Row (modifier = Modifier.padding(20.dp)){
                //CARD 1
                Card (modifier = Modifier
                    .width(163.dp)
                    .height(180.dp)
                    .clickable { navController.navigate(ADD_PRODUCTS_URL) },
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
                            text = "Add Products",
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
                    .clickable { navController.navigate(VIEW_PRODUCTS_URL) },
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
                            text = "View Products",
                            fontSize = 18.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold
                        )

                    }


                }
                //END OF CARD 2


            }
            //END OF ROW 4

            //ROW 5

            Row (modifier = Modifier.padding(20.dp)){
                //CARD 1
                Card (modifier = Modifier
                    .width(163.dp)
                    .height(180.dp)
                    .clickable { navController.navigate(ADD_PRODUCTS_URL) },
                    elevation = CardDefaults.cardElevation(30.dp)
                ){

                    Column() {

                        Spacer(modifier = Modifier.height(20.dp))


                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ){
                            Image(painter = painterResource(id = R.drawable.noticeicon),
                                contentDescription = "home",
                                modifier = Modifier.size(70.dp)
                            )

                        }

                        Spacer(modifier = Modifier.height(15.dp))

                        Text(
                            text = "Add Notice",
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
                    .clickable { navController.navigate(VIEW_PRODUCTS_URL) },
                    elevation = CardDefaults.cardElevation(30.dp)
                ){

                    Column() {

                        Spacer(modifier = Modifier.height(20.dp))


                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ){
                            Image(painter = painterResource(id = R.drawable.noticeicon),
                                contentDescription = "home",
                                modifier = Modifier.size(70.dp)
                            )

                        }

                        Spacer(modifier = Modifier.height(15.dp))

                        Text(
                            text = "View Notice",
                            fontSize = 18.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold
                        )

                    }


                }
                //END OF CARD 2


            }
            //END OF ROW 5

            //ROW 6

            Row (modifier = Modifier.fillMaxWidth()){
                //CARD 1
                Card (modifier = Modifier
                    .fillMaxWidth()
                    .height(230.dp)
                    .padding(20.dp)
                    .clickable { navController.navigate(VIEW_BOOKING_URL) },
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
                            text = "View Appointments",
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

            //END OF ROW 6

            //ROW 7

            Row (modifier = Modifier.fillMaxWidth()){
                //CARD 1
                Card (modifier = Modifier
                    .fillMaxWidth()
                    .height(230.dp)
                    .padding(20.dp)
                    .clickable { navController.navigate(VIEW_DONATION_URL) },
                    elevation = CardDefaults.cardElevation(30.dp)
                ){

                    Column() {

                        Spacer(modifier = Modifier.height(20.dp))


                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ){
                            Image(painter = painterResource(id = R.drawable.blooddonations),
                                contentDescription = "home",
                                modifier = Modifier.size(70.dp)
                            )

                        }

                        Spacer(modifier = Modifier.height(15.dp))

                        Text(
                            text = "View Donations",
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

            //END OF ROW 7
        }


    }



}




@Composable
@Preview(showBackground = true)
fun DashboardAdminScreenPreview(){
    DashboardAdminScreen(rememberNavController())


}
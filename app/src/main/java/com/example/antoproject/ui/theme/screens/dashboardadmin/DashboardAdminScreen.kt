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
import com.example.antoproject.navigation.ADD_PRODUCTS_URL
import com.example.antoproject.navigation.ROUT_HOME
import com.example.antoproject.ui.theme.Bluey

@Composable

fun DashboardAdminScreen(navController: NavController){


    Column(modifier = Modifier.fillMaxSize()) {

        Card(colors = CardDefaults.cardColors(Bluey),
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 20.dp, top = 20.dp, end = 20.dp, bottom = 40.dp)
        ) {
            //ROW 1

            Row (modifier = Modifier.fillMaxWidth()){
                //CARD 1
                Card (modifier = Modifier
                    .fillMaxWidth()
                    .height(230.dp)
                    .padding(20.dp)
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
                    .clickable { navController.navigate(ROUT_HOME) },
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
                    .clickable { navController.navigate(ADD_PRODUCTS_URL) },
                    elevation = CardDefaults.cardElevation(30.dp)
                ){

                    Column() {

                        Spacer(modifier = Modifier.height(20.dp))


                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ){
                            Image(painter = painterResource(id = R.drawable.canteenicon),
                                contentDescription = "home",
                                modifier = Modifier.size(70.dp)
                            )

                        }

                        Spacer(modifier = Modifier.height(15.dp))

                        Text(
                            text = "Add Products in Canteen",
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

            //END OF ROW 3

        }

    }



}




@Composable
@Preview(showBackground = true)
fun DashboardAdminScreenPreview(){
    DashboardAdminScreen(rememberNavController())


}
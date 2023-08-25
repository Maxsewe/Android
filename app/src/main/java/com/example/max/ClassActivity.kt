package com.example.max

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.max.ui.theme.MaxTheme

class ClassActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Max()

        }
    }
}



@Preview
@Composable
fun Max() {

    LazyColumn(
        modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxSize()


    ){
        item{
            Column() {

                Text(
                    "Category",
                    fontSize = (30.sp),
                    color = Color.White
                )

                Spacer(modifier = Modifier.height(40.dp))

                LazyRow() {
                    item {
                        Card(
                            shape = CutCornerShape(10),
                            elevation = CardDefaults.cardElevation(10.dp),
                            colors = CardDefaults.cardColors(Color.Red)

                        ) {

                            Text(
                                 "Fruits",
                                fontSize = 25.sp,
                                color = Color.Black
                            )

                            Image(
                                painter = painterResource(R.drawable.frut),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(150.dp)
                            )

                        }

                        Spacer(modifier = Modifier.width(30.dp))

                        Card(
                            shape = CutCornerShape(10),
                            elevation = CardDefaults.cardElevation(10.dp),
                            colors = CardDefaults.cardColors(Color.LightGray)

                        ) {

                            Text(
                                 "Vegetables",
                                fontSize = 25.sp,
                                color = Color.Black
                            )

                            Image(
                                painter = painterResource( R.drawable.frut),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(150.dp)
                            )

                        }

                        Spacer(modifier = Modifier.width(30.dp))

                        Card(
                            shape = CutCornerShape(10),
                            elevation = CardDefaults.cardElevation(10.dp),
                            colors = CardDefaults.cardColors(Color.LightGray)

                        ) {

                            Text(
                                 "Spices",
                                fontSize = 25.sp,
                                color = Color.Black
                            )

                            Image(
                                painter = painterResource(id = R.drawable.frut),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(150.dp)


                            )

                        }


                    }
                }


                Spacer(modifier = Modifier.height(40.dp))

                Text( "Popular",
                    fontSize = 30.sp,
                    color = Color.White)

                Spacer(modifier = Modifier.height(20.dp))


                Card (
                    modifier = Modifier
                        .fillMaxWidth(),

                    shape = CutCornerShape(10),
                    elevation = CardDefaults.cardElevation(10.dp),
                    colors = CardDefaults.cardColors(Color.Gray)

                    ){
                    Text( "Pomegranate",
                        fontSize = 30.sp,
                        color = Color.Black)

                    Image(
                        painter = painterResource( R.drawable.frut),
                        contentDescription = null,
                        modifier = Modifier
                            .size(250.dp)
                            .width(50.dp)
                            .height(40.dp)
                            .align(Alignment.CenterHorizontally)
                    )
                }

                Spacer(modifier = Modifier.height(40.dp))

                Text(
                     "Top Item",
                    fontSize = 30.sp,
                    color = Color.White

                )

                Spacer(modifier = Modifier.height(20.dp))


                LazyRow() {
                    item {
                        Card(
                            shape = CutCornerShape(10),
                            elevation = CardDefaults.cardElevation(10.dp),
                            colors = CardDefaults.cardColors(Color.Gray)

                        ) {

                            Image(
                                painter = painterResource(R.drawable.frut),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(200.dp)
                                    .height(40.dp)
                            )

                            Text(
                                 "Fresh Orange",
                                fontSize = 30.sp,
                                color = Color.Black
                            )

                        }

                        Spacer(modifier = Modifier.width(20.dp))

                        Card(
                            shape = CutCornerShape(10),
                            elevation = CardDefaults.cardElevation(10.dp),
                            colors = CardDefaults.cardColors(Color.LightGray)

                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.frut),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(200.dp)
                                    .height(40.dp)
                            )

                            Text(
                                 "Strawberry",
                                fontSize = 30.sp,
                                color = Color.Black
                            )

                        }
                        Spacer(modifier = Modifier.width(20.dp))

                        Card(
                            shape = CutCornerShape(10),
                            elevation = CardDefaults.cardElevation(10.dp),
                            colors = CardDefaults.cardColors(Color.Gray)

                        ) {

                            Image(
                                painter = painterResource(R.drawable.frut),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(200.dp)
                                    .height(40.dp)
                            )

                            Text(
                                 "Fresh Orange",
                                fontSize = 30.sp,
                                color = Color.Black
                            )

                        }

                        Spacer(modifier = Modifier.width(20.dp))

                        Card(
                            shape = CutCornerShape(10),
                            elevation = CardDefaults.cardElevation(10.dp),
                            colors = CardDefaults.cardColors(Color.LightGray)

                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.frut),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(200.dp)
                                    .height(40.dp)
                            )

                            Text(
                                 "Strawberry",
                                fontSize = 30.sp,
                                color = Color.Black
                            )

                        }


                    }

                }

            }

        }

    }

}
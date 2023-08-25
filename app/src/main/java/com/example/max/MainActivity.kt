package com.example.max

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.max.ui.theme.MaxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Mit()


        }
    }
}

@Composable
fun Mit() {

    Column(
        modifier = Modifier
//            .fillMaxHeight()
//            .fillMaxWidth()
            .background(Color.Yellow)
            .fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally,

        verticalArrangement = Arrangement.Center
    ) {

        Text("Home Screen", color = Color.Cyan, fontSize = 40.sp)

        Text("My App", color = Color.Cyan, fontSize = 40.sp)

        val Login = LocalContext.current
        Button(onClick = {
            Login.startActivity(Intent(Login, LoginActivity::class.java))

        }) {

            Text("Login Here")

        }


        val Image = LocalContext.current
        Button(onClick = {
            Image.startActivity(Intent(Image, ImageActivity::class.java))

        }) {

            Text("Images")


        }


        val card = LocalContext.current
        Button(onClick = {
            card.startActivity(Intent(card, CardActivity::class.java))

        }) {

            Text("Card")


        }

        val scroll = LocalContext.current
        Button(onClick = {
            scroll.startActivity(Intent(scroll, ScrollActivity::class.java))

        }) {

            Text("Scroll")


        }

        val Column = LocalContext.current
        Button(onClick = {
            Column.startActivity(Intent(Column, ColumnRowActivity::class.java))

        }) {

            Text("C&R")


        }
        val Apple = LocalContext.current
        Button(onClick = {
            Apple.startActivity(Intent(Apple, ClassActivity::class.java))

        }) {

            Text("Apple")
        }
    }
}

@Preview
@Composable
fun GreetingPreview() {
Mit()
}




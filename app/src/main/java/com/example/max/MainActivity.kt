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
fun Mit(){
    
    Column(
        modifier = Modifier
//            .fillMaxHeight()
//            .fillMaxWidth()
            .background(Color.Yellow)
            .fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally,

        verticalArrangement = Arrangement.Center
    ) {

        Text( "Home Screen", color = Color.Blue, fontSize = 40.sp)

        Text( "My App", color = Color.Cyan, fontSize = 40.sp)

        val context = LocalContext.current
        Button(onClick = {
            context.startActivity(Intent(context,LoginActivity::class.java))

        }) {

            Text( "Login Here")

        }

    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Mit()

}
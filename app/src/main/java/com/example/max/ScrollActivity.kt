package com.example.max

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.max.ui.theme.MaxTheme

class ScrollActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scroll()

        }
    }
}
// Lazy columns are scrollable columns

@Preview
@Composable
fun Scroll(){

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        modifier = Modifier
            .fillMaxSize()

    ) {
        LazyColumn(){
            item { 
                Column {

                    Text(text = "Item")
                    Image(painter = painterResource(id = R.drawable.bmw), contentDescription = null)

                    Text(text = "Item")
                    Image(painter = painterResource(id = R.drawable.bmw), contentDescription = null)

                    Text(text = "Item")
                    Image(painter = painterResource(id = R.drawable.bmw), contentDescription = null)

                    Text(text = "Item")
                    Image(painter = painterResource(id = R.drawable.bmw), contentDescription = null)

                    Text(text = "Item")
                    Image(painter = painterResource(id = R.drawable.bmw), contentDescription = null)

                }
            }
            

            }

            
        }

    }


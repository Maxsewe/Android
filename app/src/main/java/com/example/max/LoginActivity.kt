package com.example.max

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.max.ui.theme.MaxTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreen()

        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun LoginScreen(){

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


        ,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow)



    ) {

        Text("Login Here",
            color = Color.Gray,
            fontSize = 30.sp)


        var usernamee by remember { mutableStateOf(TextFieldValue("")) }
        var password by remember { mutableStateOf(TextFieldValue("")) }

        OutlinedTextField(
            value = usernamee,
            label = { Text( "usernamee")},

            leadingIcon = { Icon(imageVector = Icons.Default.Email,
                contentDescription = "emailIcon") },

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            onValueChange = {
                usernamee = it

            } )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = password,
            label = {Text( "password")},

            leadingIcon = { Icon(imageVector = Icons.Default.Lock,
                contentDescription = "emailIcon") },

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            onValueChange = {
                password = it

            } )

        Spacer(modifier = Modifier.height(10.dp))
        
        Button(
            onClick = { /*TODO*/ },
  //          colors = ButtonDefaults.buttonColors(Color.Blue)
        )
        {
            Text( "Login")
            
        }


    }

}


// wrap content .. height taken by the content number
// In columns it's horizontal alignment
// In rows it's horizontal arrangement






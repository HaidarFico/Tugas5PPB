package com.example.tugas5ppb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tugas5ppb.ui.theme.Tugas5PPBTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tugas5PPBTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginScreen()
                }
            }
        }
    }
}

@Composable
fun LoginScreen() {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
        Image(painter = painterResource(id = R.drawable.phone_icon) , contentDescription = "Login image", modifier = Modifier.size(200.dp))
        Text(text = "Welcome back")
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = "Login to your account")
        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Email Address")
        })
        Spacer(modifier = Modifier.height(4.dp))
        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Password")
        })
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Forgot Password", modifier = Modifier.clickable {  })
        Spacer(modifier = Modifier.height(32.dp))
        Text(text = "Or sign in with")
        Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
            Image(painter = painterResource(id = R.drawable.google), contentDescription = "Google Logo", modifier = Modifier.size(60.dp).clickable {  })
            Image(painter = painterResource(id = R.drawable.facebook), contentDescription = "Facebook Logo", modifier = Modifier.size(60.dp).clickable {  })
            Image(painter = painterResource(id = R.drawable.twitter), contentDescription = "Twitter Logo", modifier = Modifier.size(60.dp).clickable {  })

        }
    }
}
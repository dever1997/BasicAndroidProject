package com.example.myandroidapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myandroidapp.ui.theme.MyAndroidAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAndroidAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    BirthdayGreetingWithText(message = "Happy Birthday Joe", from = "Samantha")
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingWithText(message :String, from :String){
    Column() {
        Text(text = message)
        Text(text= from)
    }

}

@Preview(showBackground = true)
@Composable
fun BirthdayGreetingWithTextPreview() {
    MyAndroidAppTheme {
        BirthdayGreetingWithText(message = "Happy Birthday Joe!!", from = "Deverly")
    }
}
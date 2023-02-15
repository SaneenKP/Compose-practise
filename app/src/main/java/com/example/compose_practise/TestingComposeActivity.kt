package com.example.compose_practise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter

class TestingComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text("Hello compose")
        }
    }

    @Composable
    fun ShowMessage(message : String){
        Text(text = message)
    }

    @Preview
    @Composable
    fun PreviewShowMessage(){
        ShowMessage(message = "Hello Compose")
    }

}
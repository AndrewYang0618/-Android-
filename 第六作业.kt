package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RGBDemo()
                }
            }
        }
    }
}

@Composable
fun Hello(modifier: Modifier = Modifier) {
    Text(
        text = "2207020624+杨博锐",
        modifier = modifier
    )
}
@Composable
fun RGBDemo(modifier: Modifier = Modifier) {
    Row {
        Box (
            modifier = modifier.width(133.dp).fillMaxHeight().background(Color.Red),
            contentAlignment = Alignment.Center
        ){
            Text(text = "红色");
        }
        Box (
            modifier = modifier.width(133.dp).fillMaxHeight().background(Color.Green),
            contentAlignment = Alignment.Center
        ){
            Text(text = "绿色");
        }
        Box (
            modifier = modifier.width(133.dp).fillMaxHeight().background(Color.Blue),
            contentAlignment = Alignment.Center
        ){
            Text(text = "蓝色");
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        RGBDemo()
    }
}
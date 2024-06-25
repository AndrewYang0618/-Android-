package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    val list = remember { mutableListOf<String>("张三", "李四", "王五", "赵六", "宋七") }
    var show by remember { mutableStateOf(false) }
    var index by remember { mutableStateOf<Int?>(null) }
    Column {
        for (i in list.indices){
            Box ( modifier.fillMaxWidth().border(0.5.dp, Color.Gray).clickable { show = true; index = i; } ) { Text(list[i]) }
        }
        if (show) {
            AlertDialog(
                    onDismissRequest = { show = false },
                    title = { Text("确认删除") },
                    text = { Text("你确定要删除吗？") },
                    confirmButton = {
                        Button( onClick = { show = false; index?.let { list.removeAt(it) }; index = null } ) { Text("删除") }
                    }
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting()
    }
}
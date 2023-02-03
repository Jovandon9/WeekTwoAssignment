package com.example.weektwoassignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.weektwoassignment.ui.theme.WeekTwoAssignmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeekTwoAssignmentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    var roll by remember { mutableStateOf(1) }
    Column() {
        when(roll){
            1 -> Image(painter = painterResource(id = R.drawable.d1), contentDescription = stringResource(id = R.string.d1))
            2 -> Image(painter = painterResource(id = R.drawable.d2), contentDescription = stringResource(id = R.string.d2))
            3 -> Image(painter = painterResource(id = R.drawable.d3), contentDescription = stringResource(id = R.string.d3))
            4 -> Image(painter = painterResource(id = R.drawable.d4), contentDescription = stringResource(id = R.string.d4))
            5 -> Image(painter = painterResource(id = R.drawable.d5), contentDescription = stringResource(id = R.string.d5))
            6 -> Image(painter = painterResource(id = R.drawable.d6), contentDescription = stringResource(id = R.string.d6))
        }
        Text(text = "Roll")
        Button(onClick = { (1..6).random() }) {
            Text(text = "Roll")

    }
        
}

//------------
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WeekTwoAssignmentTheme {
        Greeting("Android")
    }
}}
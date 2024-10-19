package com.example.pduabasic_compose

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pduabasic_compose.ui.theme.Pduabasic_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pduabasic_composeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicColumn(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier){
    Text(
        text = "Hello $name",
        modifier = modifier
    )
}

@Composable
fun BasicColumn(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 10.dp)
    ){
        Text("Login",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.padding(5.dp))
        Text("Ini adalah halaman login",
            fontSize = 25.sp,
            fontStyle = FontStyle.Italic)

        Spacer(modifier = Modifier.padding(10.dp))
        Text(
            text = "Jetpack Compose",
            fontSize = 50.sp,
            fontStyle = FontStyle.Italic

        )
        Spacer(modifier = Modifier.padding(20.dp))
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier
                .clip(CircleShape)
                .size(300.dp)
        )

        Spacer(modifier = Modifier.padding(10.dp))
        Text(
            text = "Nama",
            fontSize = 50.sp,
            fontStyle = FontStyle.Italic

        )

        Spacer(modifier = Modifier.padding(10.dp))
        Text(
            text = "Dimas Chandra Winata",
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic

        )

        Spacer(modifier = Modifier.padding(10.dp))
        Text(
            text = "20220140163",
            fontSize = 60.sp,
            fontStyle = FontStyle.Italic

        )

        Spacer(modifier = Modifier.padding(20.dp))
        Image(
            painter = painterResource(id = R.drawable.dimas),
            contentDescription = "Logo",
            modifier = Modifier
                .clip(CircleShape)
                .size(300.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Pduabasic_composeTheme {
        Greeting("Android")
    }
}
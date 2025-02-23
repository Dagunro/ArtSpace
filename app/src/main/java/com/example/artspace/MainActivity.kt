package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column (modifier = Modifier.padding(innerPadding)){
                        ArtSpace()

                    }


                }
            }
        }
    }
}

@Composable
fun ArtSpace() {
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Spacer(modifier = Modifier.height(100.dp))
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .background(Color.White)
                .size(350.dp,500.dp)
                .shadow(elevation = 2.dp)
        ){
            Image(
                painter = painterResource(R.drawable.whispers_of_the_soul_damola_ayegbayo_2024),
                contentDescription = "A painting titled Human by Damola Ayegbayo",
                modifier = Modifier.size(400.dp)
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Box(modifier = Modifier
            .background(Color.LightGray)
            .size(300.dp, 100.dp)
            ,
            contentAlignment = Alignment.Center

        ){
            Column (){
                Text(
                    text = "Whispers of the Soul",
                    fontSize = 26.sp
                )
                Text(
                    text = "Damola Ayegbayo(2024)",
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )

            }
        }
        Spacer(modifier = Modifier.height(40.dp))
        Row (horizontalArrangement = Arrangement.SpaceBetween){
            Button(onClick = {}, modifier = Modifier.size(150.dp, 40.dp)) {
                Text(text = "Previous")
            }
            Spacer(modifier = Modifier.width(20.dp))
            Button(onClick = {}, modifier = Modifier.size(150.dp, 40.dp)) {
                Text(text = "Next")
            }

        }
    }


}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun ArtSpacePreview() {
    ArtSpaceTheme {
        ArtSpace()
    }
}



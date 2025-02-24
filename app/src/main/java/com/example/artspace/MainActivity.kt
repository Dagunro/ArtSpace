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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
fun ArtSpace(){

    var result by remember { mutableStateOf(1) }

    when(result){
        1 -> {
            ArtSpaceEditor(
                imageResource = R.drawable.whispers_of_the_soul_damola_ayegbayo_2024,
                artDescription = R.string.whispers_of_the_soul_dam_24,
                artistInformation = R.string.Damola_Ayegbayo_24,
                onPreviousButtonClick = {
                    result = 0
                },
                onNextButtonClick = {
                    result++
                }
            )
        }

        2 -> {
            ArtSpaceEditor(
                imageResource = R.drawable.wanna_be_rogers_akamike_2023,
                artDescription = R.string.wanna_be_RA_24,
                artistInformation = R.string.Rogers_Akamike_24,
                onPreviousButtonClick = {
                    result--
                },
                onNextButtonClick = {
                    result++
                }
            )
        }

        3 -> {
            ArtSpaceEditor(
                imageResource = R.drawable.eniyan_human__damola_ayegbayo_2024,
                artDescription = R.string.eniyan_dam_24,
                artistInformation = R.string.Damola_Ayegbayo_24,
                onPreviousButtonClick = {
                    result--
                },
                onNextButtonClick = {
                    result++
                }
            )
        }

        4 -> {
            ArtSpaceEditor(
                imageResource = R.drawable.against_all_odds_damola_ayegbayo_2024,
                artDescription = R.string.against_all_odds_dam_24,
                artistInformation = R.string.Damola_Ayegbayo_24,
                onPreviousButtonClick = {
                    result--
                },
                onNextButtonClick = {
                    result++
                }
            )
        }

        5 -> {
            ArtSpaceEditor(
                imageResource = R.drawable.finding_balance_paul_ogunlesi_2024,
                artDescription = R.string.finding_balance_PO_24,
                artistInformation = R.string.Paul_Ogunlesi_24,
                onPreviousButtonClick = {
                    result--
                },
                onNextButtonClick = {
                    result++
                }
            )
        }

        6 -> {
            ArtSpaceEditor(
                imageResource = R.drawable.state_of_mind_damola_ayegbayo_2024,
                artDescription = R.string.state_of_mind_dam_24,
                artistInformation = R.string.Damola_Ayegbayo_24,
                onPreviousButtonClick = {
                    result--
                },
                onNextButtonClick = {
                    result++
                }
            )
        }

        7 -> {
            ArtSpaceEditor(
                imageResource = R.drawable.painting_on_the_ceiling_of_versailes_micheal_angelo,
                artDescription = R.string.ceiling_of_versailes_MA,
                artistInformation = R.string.Michael_Angelo,
                onPreviousButtonClick = {
                    result--
                },
                onNextButtonClick = {
                    result++
                }
            )
        }

        8 -> {
            ArtSpaceEditor(
                imageResource = R.drawable.time_paul_ogunlesi_2020,
                artDescription = R.string.time_PO_24,
                artistInformation = R.string.Paul_Ogunlesi_20,
                onPreviousButtonClick = {
                    result--
                },
                onNextButtonClick = {
                    result++
                }
            )
        }

        9 -> {
            ArtSpaceEditor(
                imageResource = R.drawable.womans_journey_obiora_ekeanozie_2024,
                artDescription = R.string.womans_journey,
                artistInformation = R.string.Obiora_Ekeanozie_24,
                onPreviousButtonClick = {
                    result--
                },
                onNextButtonClick = {
                    result++
                }
            )
        }

        10 -> {
            ArtSpaceEditor(
                imageResource = R.drawable.wooded_landscape_rijkmuseum_1640,
                artDescription = R.string.wooded_landscape,
                artistInformation = R.string.Rijk_museum,
                onPreviousButtonClick = {
                    result--
                },
                onNextButtonClick = {
                    result = 1
                }
            )
        }
    }
}

@Composable
fun ArtSpaceEditor(
    imageResource: Int,
    artDescription: Int,
    artistInformation: Int,
    onPreviousButtonClick: () -> Unit,
    onNextButtonClick: () -> Unit

) {
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
                painter = painterResource(imageResource),
                contentDescription = stringResource(artDescription),
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
                    text = stringResource(artDescription),
                    fontSize = 26.sp
                )
                Text(
                    text = stringResource(artistInformation),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )

            }
        }
        Spacer(modifier = Modifier.height(40.dp))
        Row (horizontalArrangement = Arrangement.SpaceBetween){
            Button(onClick = onPreviousButtonClick, modifier = Modifier.size(150.dp, 40.dp)) {
                Text(text = "Previous")
            }
            Spacer(modifier = Modifier.width(20.dp))
            Button(onClick = onNextButtonClick, modifier = Modifier.size(150.dp, 40.dp)) {
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



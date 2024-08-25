package com.harunkor.androidjetpackcomposeshimmereffect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.harunkor.androidjetpackcomposeshimmereffect.ui.theme.AndroidJetpackComposeShimmerEffectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidJetpackComposeShimmerEffectTheme {

                Row {
                    ShimmerEffectBox(
                        modifier = Modifier
                            .height(100.dp)
                            .padding(4.dp)
                            .weight(0.3f)
                            .clip(RoundedCornerShape(4.dp)),
                        isShow = true
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.ic_launcher_background),
                            contentDescription = "ShimmerEffectImage"
                        )
                    }
                    ShimmerEffectBox(
                        modifier = Modifier
                            .height(100.dp)
                            .padding(4.dp)
                            .weight(0.7f)
                            .clip(RoundedCornerShape(4.dp)),
                        isShow = true
                    ) {

                        Text(
                            text = "Content to display after content has loaded"
                        )
                    }
                }


            }
        }
    }
}







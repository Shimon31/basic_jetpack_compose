package com.example.basicjetpackcompose

import android.R
import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basicjetpackcompose.ui.theme.BasicJetpackComposeTheme
import com.example.basicjetpackcompose.ui.theme.CustomTypography
import com.example.basicjetpackcompose.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BasicJetpackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier.fillMaxSize().padding(innerPadding)
                    ){
                        Text(
                            text = "Hello Jetpack Compose",
                            style = CustomTypography.header,

                        )
                        Text(
                            text = "Text Title small",
                            style = CustomTypography.titleSmall,


                        )
                        Text(
                            text = "Text Title Medium",
                            style = CustomTypography.titleMedium,

                            )


                        Text(
                            text = "Text Title Large",
                            style = CustomTypography.titleLarge,
                            )
                        Text(
                            text = "Text Title Italic",
                            style = CustomTypography.titleItalic,
                        )
                        Spacer(modifier = Modifier.height(46.dp))
                        Text(
                            text = "I Love \nJetpack Compose",
                            style = CustomTypography.titleDecoration,
                        )

                        Text(
                            text = "Jetpack Compose",
                            style = CustomTypography.titleShadow,
                        )
                        Text(
                            text = "Jetpack Compose",
                            style = CustomTypography.titleUnderLine,
                        )
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BasicJetpackComposeTheme {

    }
}
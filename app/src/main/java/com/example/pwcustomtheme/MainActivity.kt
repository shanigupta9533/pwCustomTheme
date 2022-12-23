package com.example.pwcustomtheme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pwcustomtheme.ui.theme.PwAppTheme
import com.example.pwcustomtheme.ui.theme.PwTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PwAppTheme(isDarkMode = true) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = PwTheme.colors.primaryColor
                ) {
                    Content()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    PwAppTheme(isDarkMode = true) {
        Surface(
            modifier = Modifier
                .fillMaxSize(),
            color = PwTheme.colors.primaryColor
            ) {

            Content()

        }
    }
}

@Composable
private fun Content(){
    Column(modifier = Modifier.fillMaxSize()) {
        PwPrimaryButton(
            modifier = Modifier,
            onClick = {

            }
        ) {
            Text(text = "Pw Buttons", color = PwTheme.colors.primaryColor)
        }
    }
}
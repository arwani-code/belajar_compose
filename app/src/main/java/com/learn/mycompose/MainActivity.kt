package com.learn.mycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.learn.mycompose.ui.theme.MyComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting()

                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = stringResource(id = R.string.app_name),
            modifier = Modifier
                .background(MaterialTheme.colors.primary)
                .width(200.dp)
                .padding(16.dp),
            color = Color.White,
            fontSize = MaterialTheme.typography.h6.fontSize,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center
        )
        Text(buildAnnotatedString {
            withStyle(style = ParagraphStyle(textAlign = TextAlign.Center)){
                withStyle(style = SpanStyle(
                    color = Color.Green,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
                ){
                    append("A")
                }
                append("B")
                append("C")
                append("D")
            }
        }, modifier = Modifier.width(200.dp))
        SelectionContainer {
            Column() {
                Text(text = "Hello Abc")
                DisableSelection {
                    Text(text = "Hello Disabled")
                }
                Text(text = "Hello Abc")
            }
        }
        CustomeText(text1 = "Hello", text2 = "World")
    }
}

@Composable
fun CustomeText(
    text1: String,
    text2: String
){
    Text(buildAnnotatedString {
        withStyle(style = SpanStyle(fontSize = MaterialTheme.typography.subtitle1.fontSize)){
            append(text1)
        }
        withStyle(style = SpanStyle(fontSize = MaterialTheme.typography.subtitle2.fontSize, fontWeight = FontWeight.Bold, baselineShift = BaselineShift.Superscript)){
            append(text2)
        }
    })
}
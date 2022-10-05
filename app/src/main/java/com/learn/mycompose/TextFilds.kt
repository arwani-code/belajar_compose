package com.learn.mycompose

import android.util.Log
import android.util.Log.INFO
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import java.util.logging.Level.INFO

@Composable
fun createTextFilds() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var text by remember {
            mutableStateOf("Type here...")
        }
        OutlinedTextField(value = text, onValueChange = { newText -> text = newText }, label = {
            Text(text = "Title")
        }, leadingIcon = {
            IconButton(onClick = { Log.i("Email_Button", "Clicked") }) {
                Icon(imageVector = Icons.Filled.Email, contentDescription = "Email Button")
            }
        }, trailingIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Check, contentDescription = "Check Button")
            }
        },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Search
            ),
            keyboardActions = KeyboardActions(
                onSearch = {
                    Log.i("Action_Keybord", "Clicked")
                }
            )
        )
    }
}
package com.learn.mycompose

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import coil.request.ImageRequest

@Composable
fun CoilImage(context: Context){
    Box(modifier = Modifier
        .height(150.dp)
        .width(150.dp), contentAlignment = Alignment.Center) {
        val painter = ImageRequest.Builder(context).data("https://picsum.photos/seed/picsum/200/300").build()
    }
}

//https://picsum.photos/seed/picsum/200/300
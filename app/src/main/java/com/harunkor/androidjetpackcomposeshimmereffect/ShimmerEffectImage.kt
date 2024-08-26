package com.harunkor.androidjetpackcomposeshimmereffect

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import coil.compose.AsyncImagePainter
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest

@Composable
fun ShimmerEffectImage(modifier: Modifier, data:String){

    val model = ImageRequest.Builder(LocalContext.current)
        .data(data)
        .size(coil.size.Size.ORIGINAL)
        .build()

    val painter = rememberAsyncImagePainter(model = model)

    val isLoading = painter.state is AsyncImagePainter.State.Loading

    ShimmerEffectBox(
        modifier = modifier,
        isShow = isLoading
    ) {
        Image(
            painter = painter,
            contentDescription = "image",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }
}
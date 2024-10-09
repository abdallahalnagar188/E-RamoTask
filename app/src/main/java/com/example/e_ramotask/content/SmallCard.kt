package com.example.e_ramotask.content

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.e_ramotask.R

@Composable
fun SmallCard() {
    Box(modifier = Modifier.size(width = 110.dp, height = 100.dp)){
        Card(
            modifier = Modifier.clickable{}
                .size(width = 120.dp, height = 110.dp)
                .padding(0.dp),
            shape = RoundedCornerShape(
                topStart = 10.dp,
                topEnd = 20.dp,
                bottomEnd = 10.dp,
                bottomStart = 20.dp
            )
        ) {
            Image(
                painter = painterResource(id = R.drawable.card_image),
                contentDescription = "Card Image",
                modifier = Modifier
                    .fillMaxSize(), contentScale = ContentScale.Crop
            )
        }
    }

}

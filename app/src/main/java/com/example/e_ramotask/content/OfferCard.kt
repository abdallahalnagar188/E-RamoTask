package com.example.e_ramotask.content

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e_ramotask.R

@Composable
fun OfferCard() {
    Card(modifier = Modifier.padding(12.dp)) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .paint(
                    painterResource(id = R.drawable.bg_card),
                    contentScale = ContentScale.FillBounds
                )
        ) {
            Text(
                "90% Off",
                modifier = Modifier.align(Alignment.TopCenter),
                color = colorResource(id = R.color.white),
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .align(Alignment.Center)
                    .fillMaxWidth(0.4f)
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.yellow),
                    contentColor = colorResource(id = R.color.black),
                )
            ) {
                Text(text = "Get Deal Now")

            }
        }
    }


}
package com.example.e_ramotask.content

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e_ramotask.R

@Composable
fun MedCard() {
    Card(
        modifier = Modifier
            .border(color = Color.LightGray, width = 1.dp, shape = RoundedCornerShape(10.dp))
            .clickable {}
            .size(width = 160.dp, height = 180.dp)
            .padding(0.dp),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)

    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_share),
                    contentDescription = null,
                    modifier = Modifier
                )


            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_favorite),
                    contentDescription = null,
                    modifier = Modifier
                )

            }
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            Image(
                painter = painterResource(id = R.drawable.adidas),
                contentDescription = "med",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .size(height = 40.dp, width = 70.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Up to 50% offer",
                modifier = Modifier,
                fontSize = 16.sp,
                color = androidx.compose.ui.graphics.Color.Black, fontWeight = FontWeight.Bold
            )
            Image(
                painter = painterResource(id = R.drawable.ic_code),
                contentDescription = null,
                modifier = Modifier
            )
        }


    }

}

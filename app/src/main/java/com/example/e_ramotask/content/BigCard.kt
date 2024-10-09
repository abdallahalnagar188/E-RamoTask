package com.example.e_ramotask.content

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e_ramotask.R

@Composable
fun BigCard() {
    Card(
        modifier = Modifier.border(color = Color.LightGray, width = 1.dp,shape = RoundedCornerShape(10.dp))
            .clickable {}
            .width(390.dp)
            .padding(horizontal = 10.dp, vertical = 10.dp),
        shape = RoundedCornerShape(10.dp),
        colors = androidx.compose.material3.CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                ,
        ) {
            Image(
                painter = painterResource(id = R.drawable.carrefour_image),
                contentDescription = "",
                modifier = Modifier.size(150.dp), contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column(modifier = Modifier.fillMaxHeight()) {
                Text(text = "Up to 50% from Saudi", fontSize = 18.sp)
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "50% from Saudi Market when you used coupon", maxLines = 2)
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.fillMaxWidth(.9f)
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.yellow),
                        contentColor = colorResource(id = R.color.black),
                    ),shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "Get Deal Now",fontSize = 18.sp)

                }
            }
        }
    }
}

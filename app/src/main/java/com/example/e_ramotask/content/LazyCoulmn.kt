package com.example.e_ramotask.content

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AppLazyColumn() {
    Row() {
        Text(text = "Top Stores in Egypt", fontSize = 24.sp, modifier = Modifier.padding(6.dp))
    }
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
    ) {
        items(20) { item ->
            SmallCard()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SecondAppLazyColumn() {
    Row() {
        Text(text = "Best Coupons in Egypt", fontSize = 24.sp, modifier = Modifier.padding(6.dp))
    }
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
    ) {
        items(20) { item ->
            MedCard()
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ThirdAppLazyColumn() {
    Row() {
        Text(text = "Featured Deals", fontSize = 24.sp, modifier = Modifier.padding(6.dp))
    }
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
    ) {
        items(20) { item ->
           BigCard()
        }
    }
}


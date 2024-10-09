package com.example.e_ramotask.category

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.displayCutoutPadding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun CategoryScreen(modifier: Modifier = Modifier) {
    Column( modifier = modifier.displayCutoutPadding(),
        verticalArrangement = Arrangement.Center) {
        Text(text = "Category Screen")
    }
}

@Composable
fun SettingsScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.displayCutoutPadding(),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "settings Screen")
    }
}

@Composable
fun BrandsScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.displayCutoutPadding(),
        verticalArrangement = Arrangement.Center) {
        Text(text = "settings Screen")
    }
}

@Composable
fun CouponsScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.displayCutoutPadding(),
        verticalArrangement = Arrangement.Center) {
        Text(text = "settings Screen")
    }
}
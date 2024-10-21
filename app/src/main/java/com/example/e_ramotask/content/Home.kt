package com.example.e_ramotask.content

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.displayCutoutPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.e_ramotask.R

@Composable
fun HomeScreen(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize()) {

        Column(modifier = Modifier.displayCutoutPadding()) {
            AppBar()
            LazyColumn(modifier = Modifier.padding(bottom = 100.dp).displayCutoutPadding()) {
                item { AppLazyColumn() }
                item { OfferCard() }
                item { ChickRow() }
                item { SecondAppLazyColumn() }
                item { SecondAppLazyColumn() }
                item { OfferCard() }
                item { SecondAppLazyColumn() }
                item { ThirdAppLazyColumn() }
            }
        }
        FloatingActionButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.align(Alignment.BottomEnd).displayCutoutPadding()
                .padding(bottom = 120.dp, end = 30.dp)
            ,
            backgroundColor = colorResource(id = R.color.yellow),
            contentColor = colorResource(id = R.color.white)

        ) {
            Icon(
                painter = painterResource(id = R.drawable.icon_add),
                contentDescription = "", modifier = Modifier.size(50.dp)
            )
        }
    }
}
package com.example.e_ramotask.content

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.e_ramotask.R

@Composable
fun ChickRow(modifier: Modifier = Modifier) {
    Row(modifier = modifier.padding(horizontal = 8.dp), verticalAlignment = Alignment.CenterVertically) {
        Icon(
            painter = painterResource(id = R.drawable.icon_person),
            contentDescription = null,
            modifier = Modifier.size(30.dp)
        )
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "Login")

        }
        Text(text = "or")
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "Register")}
    }
}
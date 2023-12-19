package com.example.test.compose.first

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun FirstScreen() {
    LazyColumn{
        items(200, key = {it}){
            Box(
                modifier = Modifier
                    .padding(24.dp)
                    .fillMaxWidth()
                    .background(
                        Color.White,
                        RoundedCornerShape(12.dp)
                    )
                    .border(
                        BorderStroke(
                            2.dp,
                            Color.Gray
                        ),
                        RoundedCornerShape(12.dp)
                    )
                    .padding(50.dp),
                contentAlignment = Alignment.Center
            ){
                Text(it.toString())
            }
        }
    }
}
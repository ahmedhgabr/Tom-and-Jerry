package com.example.testdeclarative.composable.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testdeclarative.R
import com.example.testdeclarative.composable.component.AddToCart
import com.example.testdeclarative.composable.component.Info
import com.example.testdeclarative.composable.component.KitchenBanner
import com.example.testdeclarative.composable.component.KitchenDetails
import com.example.testdeclarative.composable.component.ProfileInfo
import com.example.testdeclarative.composable.component.StepsSection
import com.example.testdeclarative.ui.theme.IBM
import com.example.testdeclarative.ui.theme.bg_Account

@Composable
fun TomKitchen() {
    Column(
        modifier = Modifier
            .background(bg_Account)
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        KitchenBanner()
        Box() {
            Box(
                modifier = Modifier
                    .background(color = Color(0xFF6194B2))
                    .clip(shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color(0xFFEEF4F6))
                        .padding(horizontal = 16.dp, vertical = 24.dp)
                ) {

                    Info()
                    KitchenDetails()
                    Spacer(modifier = Modifier.padding(vertical = 8.dp))
                    StepsSection()
                }

            }
            Image(
                painter = painterResource(id = R.drawable.spaghti),
                contentDescription = null,
                modifier = Modifier
                    .align(alignment = Alignment.TopEnd)
                    .offset(x = (-20).dp, y = (-180).dp)
                    .requiredWidth(width = 230.dp)
                    .requiredHeight(height = 210.dp),
            )
        }
        Spacer(modifier = Modifier.padding(vertical = 8.dp))
        AddToCart()
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewTomKitchen() {
    TomKitchen()
}
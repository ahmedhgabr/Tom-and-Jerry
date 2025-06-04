package com.example.testdeclarative.composable.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.InputChip
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testdeclarative.R
import com.example.testdeclarative.ui.theme.IBM

@Composable
fun ProductCard(
    imageId: Int,
    name: String,
    description: String,
    price: String,
    modifier: Modifier = Modifier
) {
    Box() {
        Box(
            modifier = modifier
                .requiredWidth(width = 160.dp)
                .requiredHeight(height = 219.dp)
                .clip(shape = RoundedCornerShape(16.dp))
                .background(color = Color(0xfff8f9fa))
                .border(0.dp, color = Color.White, shape = RoundedCornerShape(16.dp))
        ) {

            Column(
                verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(
                        x = 0.dp,
                        y = 92.dp
                    )
                    .requiredWidth(width = 144.dp)
                    .requiredHeight(height = 127.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        text = name,
                        color = Color(0xff1f1f1e),
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.SemiBold,
                            fontFamily = IBM
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                    Text(
                        text = description,
                        color = Color(0xff969799),
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            fontFamily = IBM
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .height(height = 30.dp)
                        .padding(horizontal = 8.dp)
                ) {
                    PriceInfo(price)
                    Spacer(modifier = Modifier.width(10.dp))
                    CartButton()
                }
            }
        }

        Image(
            painter = painterResource(id = imageId),
            contentDescription = "product image",
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(
                    y = (-16).dp
                )
                .requiredWidth(width = 93.dp)
                .requiredHeight(height = 100.dp)
        )
    }
}

@Composable
fun PriceInfo(price: String, modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .clip(shape = RoundedCornerShape(8.dp))
            .background(color = Color(0xffe6f2f7))
            .padding(all = 8.dp)
            .width(width = 85.dp)
            .height(height = 20.dp)

    ) {
        Image(
            painter = painterResource(id = R.drawable.money),
            contentDescription = "money-bag-01",
            colorFilter = ColorFilter.tint(Color(0xff03578a)),
            modifier = Modifier
                .requiredSize(size = 16.dp)
        )
        Text(
            text = price,
            color = Color(0xff03578a),
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            )
        )


    }
}

@Composable
fun CartButton(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(30.dp)
            .requiredHeight(30.dp)
            .border(
                width = 1.dp,
                color = Color(0xff03578a),
                shape = RoundedCornerShape(8.dp)
            )
    ) {
        Icon(
            painter = painterResource(id = R.drawable.cart),
            contentDescription = "filter-horizontal",
            tint = Color(0xff03578a),
            modifier = Modifier
                .size(width = 16.dp, height = 16.dp)
                .align(alignment = Alignment.Center)
        )
    }
}

@Preview(widthDp = 160, heightDp = 219)
@Composable
private fun ProductCardPreview() {
    ProductCard(
        imageId = R.drawable.sport_tom,
        name = "Sport Tom",
        description = "He blows himself up before Jerry can catch him.",
        price = "5 3 cheeses",
        modifier = Modifier.padding(8.dp)
    )
}
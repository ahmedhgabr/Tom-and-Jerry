package com.example.testdeclarative.composable.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testdeclarative.R
import com.example.testdeclarative.ui.theme.IBM

@Composable
fun PromotionBanner(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 328.dp)
            .requiredHeight(height = 92.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(
                brush = Brush.linearGradient(
                    listOf(Color(0xff03446a), Color(0xff0685d0))
                )
            )
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 12.dp,
                    y = 12.dp
                )
                .requiredWidth(width = 208.dp)
        ) {
            Text(
                text = "Buy 1 Tom and get 2 for free",
                color = Color.White,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = IBM,
                    fontWeight = FontWeight.SemiBold,
                ),
                modifier = Modifier
                    .fillMaxWidth()
            )
            Text(
                text = "Adopt Tom! (Free Fail-Free Guarantee)",
                color = Color.White.copy(alpha = 0.8f),
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = IBM,
                    fontWeight = FontWeight.Normal,
                ),
                modifier = Modifier
                    .requiredWidth(width = 177.dp)
            )
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 210.14.dp,
                    y = (-28.05).dp
                )
                .requiredWidth(width = 139.dp)
                .requiredHeight(height = 114.dp)
                .rotate(degrees = 62.87f)
                .background(color = Color.White.copy(alpha = 0.04f))
        )
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 218.27.dp,
                    y = (-22.19).dp
                )
                .requiredWidth(width = 132.dp)
                .requiredHeight(height = 111.dp)
                .rotate(degrees = 62.87f)
                .background(color = Color.White.copy(alpha = 0.04f))
        )
        Image(
            painter = painterResource(id = R.drawable.tom_banner),
            contentDescription = "bde1505a9c43109cfd3296dc1a0b5d82 1",
            modifier = Modifier
                .align(alignment = Alignment.BottomEnd)
                .offset(
                    x = 0.dp,
                    y = 0.dp
                )
                .requiredWidth(width = 115.dp)
                .requiredHeight(height = 108.dp)
                .clip(shape = RoundedCornerShape(bottomEnd = 16.dp))
        )
    }
}

@Preview(widthDp = 328, heightDp = 92)
@Composable
private fun PromotionBannerPreview() {
    PromotionBanner(Modifier)
}
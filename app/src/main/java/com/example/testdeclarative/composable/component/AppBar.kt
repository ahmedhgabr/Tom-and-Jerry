package com.example.testdeclarative.composable.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testdeclarative.R
import com.example.testdeclarative.ui.theme.IBM

@Composable
fun AppBar(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.requiredWidth(width = 328.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.profileimage),
                contentDescription = "Profile Image 2",
                modifier = Modifier
                    .requiredSize(size = 48.dp)
                    .clip(shape = RoundedCornerShape(12.dp))
                    .border(border = BorderStroke(0.5.dp, Color(0xff1f1f1e).copy(alpha = 0.15f)),
                        shape = RoundedCornerShape(12.dp)))
            Column(
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Hi, Jerry 👋🏻",
                    color = Color(0xff1f1f1e),
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium,
                        lineHeight = 20.sp,
                        fontFamily = IBM
                        )
                )

                Text(
                    text = "Which Tom do you want to buy?",
                    color = Color(0xffa5a6a4),
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        lineHeight = 16.sp,
                    )

                )
            }
        }
        Box(
            modifier = Modifier
                .border(border = BorderStroke(0.5.dp, Color(0xff1f1f1e).copy(alpha = 0.15f)),
                    shape = RoundedCornerShape(12.dp))
        ){
            Box(
                modifier = Modifier
                    .requiredSize(size = 40.dp)
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .requiredSize(size = 40.dp)
                        .padding(all = 2.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.notification),
                        contentDescription = "notification-01",
                        colorFilter = ColorFilter.tint(Color(0xff1f1f1e)),
                        modifier = Modifier
                            .requiredSize(size = 24.dp))
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 27.dp,
                            y = (-4).dp)
                        .requiredSize(size = 14.dp)
                        .clip(shape = RoundedCornerShape(100.dp))
                        .background(color = Color(0xff03578a))
                ) {
                    Text(
                        text = "3",
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Medium),
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AppBarPreview() {
    AppBar(Modifier)
}
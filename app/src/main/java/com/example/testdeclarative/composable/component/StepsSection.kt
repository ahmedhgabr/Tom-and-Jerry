package com.example.testdeclarative.composable.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testdeclarative.ui.theme.IBM


@Composable
fun StepsSection(modifier: Modifier = Modifier) {

    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
        modifier = modifier.padding(start = 18.dp)
    ) {
        Text(
            text = "Preparation method",
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = IBM,
                color = Color(0xFF1F1F1E).copy(alpha = 0.87f)
            ),
            modifier = Modifier.align(Alignment.Start),
        )
        Spacer(modifier = Modifier.requiredHeight(height = 4.dp))
        Step("1", "         Put the pasta in a toaster.")
        Step("2", "         Pour battery juice over it.")
        Step("3", "         Wait for the spark to ignite.")
        Step("4", "         Serve with an insulating glove.")
    }
}


@Composable
fun Step(num: String, text: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 328.dp)
            .requiredHeight(height = 37.dp)
            .background(color = Color(0xFFF2F8FB)),

        ) {
        Row(
            modifier = modifier
                .requiredWidth(width = 328.dp)
                .requiredHeight(height = 37.dp)
                .background(
                    color = Color(0xFFFFFFFF),
                    shape = RoundedCornerShape(topEnd = 12.dp, bottomEnd = 12.dp)
                ),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {


            Text(
                text = text,
                color = Color(0xff121212).copy(alpha = 0.6f),
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontFamily = IBM,
                    fontWeight = FontWeight.Normal,
                    letterSpacing = 0.5.sp
                ),
            )
        }

        Box(
            modifier = Modifier
                .size(37.dp)
                .offset(x = (-20).dp, y = (0).dp)
                .background(color = Color(0xFFFFFFFF), shape = CircleShape)
                .border(color = Color(0xFFD0E5F0), width = 1.dp, shape = CircleShape)
                .align(alignment = Alignment.TopStart),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = num,
                color = Color(0xFF035587),
                style = TextStyle(
                    fontSize = 14.sp,
                )
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun StepsSectionPreview() {
    StepsSection()
}
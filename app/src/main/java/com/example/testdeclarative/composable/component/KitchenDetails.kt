package com.example.testdeclarative.composable.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testdeclarative.R
import com.example.testdeclarative.ui.theme.IBM




@Composable
fun KitchenDetails(){
    Column {
        Text(
            text = "Details",
            color = Color(0xFF1F1F1E).copy(alpha = 0.87f),
            style = TextStyle(
                fontSize = 18.sp,
                fontFamily = IBM,
                fontWeight = FontWeight.Medium
            ),
            modifier = Modifier
                .padding(start = 16.dp, top = 16.dp)
        )
        Row (
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            DetailContainer(R.drawable.temp, "1000 V", "Temperature ", Modifier)

            DetailContainer(R.drawable.speed, "3 Sparks", "Time ", Modifier)

            DetailContainer(R.drawable.evil_kitchen, "1M 12K", "No. of deaths", Modifier)
        }
    }

}



@Composable
fun DetailContainer(icon: Int, title: String, subtitle: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
        modifier = modifier
            .requiredWidth(width = 104.dp)
            .clip(shape = RoundedCornerShape(12.dp))
            .background(color = Color(0xffd0e5f0))
            .padding(all = 12.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = icon),
                contentDescription = "temperature",
                colorFilter = ColorFilter.tint(Color(0xff035587)),
                modifier = Modifier
                    .requiredSize(size = 32.dp)
            )
            Column(
                verticalArrangement = Arrangement.spacedBy(2.dp, Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = title,
                    color = Color(0xff121212).copy(alpha = 0.6f),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = IBM,
                        fontWeight = FontWeight.Medium,
                        letterSpacing = 0.5.sp
                    )
                )
                Text(
                    text = subtitle,
                    color = Color(0xff121212).copy(alpha = 0.37f),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = IBM,
                        fontWeight = FontWeight.Medium,
                    )

                )
            }
        }
    }
}

@Preview(widthDp = 398, heightDp = 248  , showBackground = true)
@Composable
private fun DetailsPreview() {
    KitchenDetails()
}
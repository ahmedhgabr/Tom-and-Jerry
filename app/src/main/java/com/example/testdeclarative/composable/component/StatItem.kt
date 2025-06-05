package com.example.testdeclarative.composable.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
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
fun StatItem(
    color: Color,
    icon: Int,
    count: String,
    description: String,
    modifier: Modifier = Modifier
) {
    Row(
        horizontalArrangement = Arrangement.Start,
        modifier = modifier
            .clip(shape = RoundedCornerShape(12.dp))
            .background(color = color)
            .padding(
                horizontal = 12.dp,
                vertical = 8.dp
            )
    ) {

        Icon(
            painter = painterResource(id = icon),
            contentDescription = "Icon",
            tint = Color.Unspecified,
            modifier = Modifier
                .requiredSize(size = 40.dp)
        )

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .requiredHeight(height = 42.dp)
                .defaultMinSize(88.dp)
                .padding(start = 8.dp, end = 8.dp, top = 2.dp, bottom = 2.dp)
        ) {
            Text(
                text = count,
                color = Color(0xFF121212).copy(alpha = 0.6f),
                style = TextStyle(
                    fontFamily = IBM,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )
            )
            Text(
                text = description,
                color = Color(0xFF121212).copy(alpha = 0.37f),
                style = TextStyle(
                    fontFamily = IBM,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium
                )
            )
        }
    }
}

@Preview(widthDp = 260, heightDp = 58)
@Composable
private fun StatItemPreview() {
    StatItem(Color(0xffd0e5f0) , R.drawable.evil, "2M 12K", "No. of quarrels", Modifier)
}
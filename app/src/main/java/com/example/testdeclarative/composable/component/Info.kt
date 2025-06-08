package com.example.testdeclarative.composable.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.InputChip
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.testdeclarative.R

@Composable
fun Info(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
        modifier = modifier
            .requiredWidth(width = 328.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(108.dp, Alignment.Start),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top),
                modifier = Modifier
                    .requiredWidth(width = 196.dp)
            ) {
                Text(
                    text = "Electric Tom pasta",
                    color = Color(0xff1f1f1e).copy(alpha = 0.87f),
                    lineHeight = 1.6.em,
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier
                        .requiredWidth(width = 178.dp))
                InputChip(
                    label = {
                        Text(
                            text = "5 cheeses",
                            color = Color(0xff03578a),
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Medium))
                    },
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.money),
                            contentDescription = "money-bag-01",
                            colorFilter = ColorFilter.tint(Color(0xff03578a)),
                            modifier = Modifier
                                .requiredSize(size = 16.dp))
                    },
                    shape = RoundedCornerShape(8.dp),
                    colors = FilterChipDefaults.filterChipColors(
                        containerColor = Color(0xffd0e5f0)
                    ),
                    selected = false,
                    onClick = { })
            }
            Icon(
                painter = painterResource(id = R.drawable.like),
                contentDescription = "Favorite icon",
                tint = Color.Unspecified,
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(5.dp)))
        }
        Text(
            text = "Pasta cooked with a charger cable and sprinkled with questionable cheese. Make sure to unplug it before eating (or not, you decide).",
            color = Color(0xff121212).copy(alpha = 0.6f),
            lineHeight = 1.43.em,
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                letterSpacing = 0.5.sp),
            modifier = Modifier
                .fillMaxWidth())
    }
}

@Preview(widthDp = 328, heightDp = 142, showBackground = true)
@Composable
private fun InfoPreview() {
    Info(Modifier)
}
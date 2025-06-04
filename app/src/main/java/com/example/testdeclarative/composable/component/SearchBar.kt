package com.example.testdeclarative.composable.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.em
import androidx.compose.material3.Icon
import com.example.testdeclarative.R

@Composable
fun SearchBarContainer(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .padding(horizontal = 16.dp)
    ) {
        InputField(
            modifier = Modifier
                .weight(weight = 1f),
            title = "Search about tom... "
        )
        FilterButton()
    }
}

@Composable
fun InputField(
    modifier: Modifier = Modifier,
    title: String
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
        horizontalAlignment = Alignment.End,
        modifier = modifier
            .fillMaxWidth()
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .requiredHeight(height = 48.dp)
                .clip(shape = RoundedCornerShape(12.dp))
                .background(color = Color.White)
                .border(
                    border = BorderStroke(1.dp, Color(0xffa5a6a4).copy(alpha = 0.08f)),
                    shape = RoundedCornerShape(12.dp)
                )
                .padding(all = 12.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .weight(weight = 1f)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.search_normal),
                        contentDescription = "search icon",
                        modifier = Modifier
                            .size(width = 24.dp, height = 24.dp),
                    )
                    Text(
                        text = title,
                        color = Color(0xff969799),
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }
            }
        }
    }
}


@Composable
fun FilterButton(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredSize(size = 48.dp)
            .clip(shape = RoundedCornerShape(12.dp))
            .background(color = Color(0xff03578a))
            .padding(horizontal = 12.dp, vertical = 12.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.filter_horizontal),
            contentDescription = "filter-horizontal",
            tint = Color.White,
            modifier = Modifier
                .size(width = 24.dp, height = 24.dp)
        )
    }
}


@Preview
@Composable
private fun SearchBarContainerPreview() {
    SearchBarContainer(Modifier)
}
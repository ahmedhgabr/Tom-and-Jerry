package com.example.testdeclarative.composable.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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

@Composable
fun SettingsSection(
    title: String,
    icon1: Int,
    text1: String,
    icon2: Int,
    text2: String,
    icon3: Int,
    text3: String,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
        modifier = modifier
            .requiredWidth(width = 360.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.Start),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = title,
                color = Color(0xff1f1f1e).copy(alpha = 0.87f),
                textAlign = TextAlign.End,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            )
        }
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top),
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                SmallFloatingActionButton(
                    onClick = { },
                    containerColor = Color.White
                ) {
                    Box(
                        modifier = Modifier
                            .requiredSize(size = 40.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = icon1),
                            contentDescription = "bed-single-02",
                            tint = Color(0xff1f1f1e),
                            modifier = Modifier
                                .align(alignment = Alignment.Center)
                                .offset(
                                    x = 0.dp,
                                    y = 0.dp
                                )
                        )
                    }
                }
                Text(
                    text = text1,
                    color = Color(0xff1f1f1e).copy(alpha = 0.87f),
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    )
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                SmallFloatingActionButton(
                    onClick = { },
                    containerColor = Color.White
                ) {
                    Box(
                        modifier = Modifier
                            .requiredSize(size = 40.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = icon2),
                            contentDescription = "Outline / Essentional, UI / Cat",
                            tint = Color(0xff1f1f1e),
                            modifier = Modifier
                                .align(alignment = Alignment.Center)
                                .offset(
                                    x = 0.dp,
                                    y = 0.dp
                                )
                        )
                    }
                }
                Text(
                    text = text2,
                    color = Color(0xff1f1f1e).copy(alpha = 0.87f),
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    )
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                SmallFloatingActionButton(
                    onClick = { },
                    containerColor = Color.White
                ) {
                    Box(
                        modifier = Modifier
                            .requiredSize(size = 40.dp)
                    ) {
                        Image(
                            painter = painterResource(id = icon3),
                            contentDescription = "fridge",
                            colorFilter = ColorFilter.tint(Color(0xff1f1f1e)),
                            modifier = Modifier
                                .align(alignment = Alignment.Center)
                                .offset(
                                    x = 0.dp,
                                    y = 0.dp
                                )
                                .requiredSize(size = 24.dp)
                        )
                    }
                }
                Text(
                    text = text3,
                    color = Color(0xff1f1f1e).copy(alpha = 0.87f),
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    )
                )
            }
        }
    }
}

@Preview(widthDp = 360, heightDp = 182, showBackground = true)
@Composable
private fun SettingsSectionPreview() {
    SettingsSection("Tom settings" , R.drawable.bed,"Change sleeping place", R.drawable.cat,"Meow settings",R.drawable.fridge,"Password to open the fridge", Modifier)
}
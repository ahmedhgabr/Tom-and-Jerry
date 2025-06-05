package com.example.testdeclarative.composable.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testdeclarative.R
import com.example.testdeclarative.composable.component.ProfileInfo
import com.example.testdeclarative.composable.component.StatItem
import com.example.testdeclarative.ui.theme.IBM
import com.example.testdeclarative.ui.theme.bg_Account
import com.example.testdeclarative.ui.theme.fontColor_White
import com.example.testdeclarative.ui.theme.profile_info

@Composable
fun TomAccount() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(bg_Account)
    ) {
        ProfileInfo(R.drawable.tom_profile, "Tom", "specializes in failure!")

        Box(
            modifier = Modifier
                .background(color = Color(0xFF226993))
                .clip(shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color(0xFFEEF4F6))
                    .padding(horizontal = 16.dp, vertical = 24.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    StatItem(Color(0xffd0e5f0), R.drawable.evil, "2M 12K", "No. of quarrels", Modifier)
                    StatItem(Color(0xFFDEEECD), R.drawable.evil, "2M 12K", "No. of quarrels", Modifier)
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    StatItem(Color(0xFFF2D9E7), R.drawable.evil, "2M 12K", "No. of quarrels", Modifier)
                    StatItem(Color(0xFFFAEDCF), R.drawable.evil, "2M 12K", "No. of quarrels", Modifier)
                }


            }
        }
    }
}


@Preview
@Composable
fun PreviewTomAccount() {
    TomAccount()
}


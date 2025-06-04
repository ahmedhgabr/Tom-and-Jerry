package com.example.testdeclarative.composable.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
                .background(color = Color(0xFFEEF4F6))
                .clip(shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
        ){

        }
    }
}


@Preview
@Composable
fun PreviewTomAccount() {
    TomAccount()
}


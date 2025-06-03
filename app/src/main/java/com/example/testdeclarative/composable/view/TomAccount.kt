package com.example.testdeclarative.composable.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testdeclarative.R
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
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewTomAccount() {
    TomAccount()
}


@Composable
fun ProfileInfo(imageId: Int, name: String, bio: String, modifier: Modifier = Modifier) {
    Box {
        Box(
            modifier = Modifier
                .clip(shape = RectangleShape)
                .rotate(45f)
                .background(Color.White)
                .height(100.dp)
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .fillMaxWidth()
                .background(profile_info)
                .padding(top = 16.dp, bottom = 10.dp)
        ) {
            Image(
                painter = painterResource(id = imageId),
                contentDescription = "profile picture",
                modifier = Modifier
                    .size(width = 64.dp, height = 64.dp)
                    .clip(shape = RoundedCornerShape(12.dp))
            )
            Text(
                text = name,
                fontSize = 18.sp,
                fontWeight = FontWeight(500),
                color = fontColor_White,
                modifier = Modifier
                    .padding(top = 6.dp)
                    .size(width = 36.dp, height = 27.dp)
            )
            Text(
                text = bio,
                fontSize = 12.sp,
                fontWeight = FontWeight(400),
                fontFamily = IBM,
                color = fontColor_White,
                modifier = Modifier.size(width = 113.dp, height = 18.dp)
            )
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White.copy(alpha = 0.12f)
                ),
                modifier = Modifier
                    .size(width = 97.dp, height = 25.dp)
            ) {
                Text(
                    text = "Edit foolishness",
                    fontSize = 4.sp,
                    fontWeight = FontWeight(500),
                    color = fontColor_White
                )
            }
        }
    }

}
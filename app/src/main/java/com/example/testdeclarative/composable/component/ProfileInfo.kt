package com.example.testdeclarative.composable.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testdeclarative.R
import com.example.testdeclarative.composable.view.TomAccount
import com.example.testdeclarative.ui.theme.IBM
import com.example.testdeclarative.ui.theme.fontColor_White
import com.example.testdeclarative.ui.theme.profile_info


@Composable
fun ProfileInfo(imageId: Int, name: String, bio: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(180.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile_background),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .fillMaxWidth()
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
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.White,
                    fontFamily = IBM
                ),
                color = fontColor_White,
                modifier = Modifier
                    .padding(top = 6.dp)
                    .size(width = 36.dp, height = 27.dp)
            )
            Text(
                text = bio,
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.White.copy(alpha = 0.8f),
                    fontFamily = IBM
                ),
                color = fontColor_White,
                modifier = Modifier.size(width = 113.dp, height = 18.dp)
            )
            Box(
                modifier = Modifier
                    .size(width = 111.dp, height = 40.dp)
                    .padding(horizontal = 12.dp, vertical = 6.dp)
                    .clip(shape = RoundedCornerShape(18.dp))
                    .background(color = Color.White.copy(alpha = 0.12f))
            ) {
                Text(
                    text = "Edit foolishness",
                    style = TextStyle(
                        fontSize = 10.sp,
                        color = Color.White,
                        fontFamily = IBM,
                        fontWeight = FontWeight.Medium,
                    ),
                    modifier = Modifier
                        .align(Alignment.Center)
                )
            }
        }
//        BackgroundContainer()
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewProfileInfo() {
    ProfileInfo(R.drawable.tom_profile, "Tom", "specializes in failure!")
}

@Composable
fun BackgroundContainer(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 242.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .rotate(degrees = -32.2f)
                .background(
                    brush = Brush.linearGradient(
                        0f to Color.White,
                        0.41f to Color.White,
                        start = Offset(401.15f, 487.05f),
                        end = Offset(201.64f, -355.26f)
                    )
                )
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .rotate(degrees = 15.92f)
                .background(
                    brush = Brush.linearGradient(
                        0f to Color.White,
                        0.41f to Color.White,
                        start = Offset(323.85f, 365.13f),
                        end = Offset(162.78f, -266.33f)
                    )
                )
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xff226993))
        )
    }
}
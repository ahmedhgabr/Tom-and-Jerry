package com.example.testdeclarative.composable.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testdeclarative.R
import com.example.testdeclarative.composable.component.ProfileInfo
import com.example.testdeclarative.composable.component.SettingsSection
import com.example.testdeclarative.composable.component.StatItem
import com.example.testdeclarative.ui.theme.IBM
import com.example.testdeclarative.ui.theme.bg_Account
import com.example.testdeclarative.ui.theme.fontColor_White
import com.example.testdeclarative.ui.theme.profile_info

@Composable
fun TomAccount() {
    Column(
        modifier = Modifier
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
                Column(
                    verticalArrangement = Arrangement.SpaceAround,
                ) {
                    Row(
                        modifier = Modifier
                            .requiredWidth(328.dp)
                            .padding(bottom = 16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        StatItem(
                            Color(0xffd0e5f0),
                            R.drawable.evil,
                            "2M 12K",
                            "No. of quarrels"
                        )
                        StatItem(
                            Color(0xFFDEEECD),
                            R.drawable.run,
                            "2M 12K",
                            "No. of quarrels"
                        )
                    }
                    Row(
                        modifier = Modifier
                            .requiredWidth(328.dp)
                            .padding(bottom = 16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        StatItem(
                            Color(0xFFF2D9E7),
                            R.drawable.sad,
                            "2M 12K",
                            "No. of quarrels"
                        )
                        StatItem(
                            Color(0xFFFAEDCF),
                            R.drawable.heart,
                            "2M 12K",
                            "No. of quarrels"
                        )
                    }
                }
                SettingsSection(
                    "Tom settings",
                    R.drawable.bed,
                    "Change sleeping place",
                    R.drawable.cat,
                    "Meow settings",
                    R.drawable.fridge,
                    "Password to open the fridge",
                    Modifier
                )

                HorizontalDivider(

                    modifier = Modifier
                        .padding(vertical = 16.dp)
                        .border(width = 1.dp, color = Color(0xFFD9D9D9)
                        )
                )
                SettingsSection(
                    "His favorite foods",
                    R.drawable.mouses,
                    "Mouses",
                    R.drawable.food,
                    "Last stolen meal",
                    R.drawable.sleep,
                    "Change sleep mood",
                    Modifier
                )

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ){
                    Text(
                        text = "v.TomBeta",
                        style = TextStyle(
                            fontFamily = IBM,
                            color = Color(0xFF121212).copy(alpha = 0.6f),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal
                        ),
                        modifier = Modifier
                            .align(Alignment.BottomCenter)
                    )
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


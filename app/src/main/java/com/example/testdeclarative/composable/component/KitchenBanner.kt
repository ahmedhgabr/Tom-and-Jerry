package com.example.testdeclarative.composable.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.example.testdeclarative.ui.theme.IBM
import com.example.testdeclarative.ui.theme.fontColor_White


@Composable
fun KitchenBanner( modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(color = Color(0xFF79A4BD))
            .height(180.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ellipse),
            contentDescription = null,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (-75).dp, y = (60).dp)
                .requiredWidth(width = 348.dp)
                .requiredHeight(height = 414.dp),
        )
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = modifier
                .fillMaxWidth()
                .padding(top = 36.dp, start = 10.dp)
        ) {
            MyText("High tension", R.drawable.tension)
            Spacer(modifier = Modifier.requiredHeight(height = 8.dp))
            MyText("Shocking foods", R.drawable.chef_hat)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewKitchenBanner() {
    KitchenBanner()
}



@Composable
fun MyText(
    text: String,
    icon: Int
) {

    Row {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = null,
            modifier = Modifier
                .requiredSize(size = 24.dp)
                .clip(shape = RoundedCornerShape(18.dp))
                .padding(2.dp),
            tint = Color.Unspecified
        )
        Spacer(modifier = Modifier.requiredWidth(width = 8.dp))
        Text(
            text = text,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color.White,
                fontFamily = IBM
            ),
            color = fontColor_White,
            modifier = Modifier
        )
    }
}

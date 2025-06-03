package com.example.testdeclarative.composable.component

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyButton() {
    var num = 5
    Button(
        onClick = {
            num++
        },
    ) {
        Text(text = "hello $num")
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewMyButton() {
    MyButton()
}

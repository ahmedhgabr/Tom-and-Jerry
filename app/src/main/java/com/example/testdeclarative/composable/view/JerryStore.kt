package com.example.testdeclarative.composable.view

import SectionHeader
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testdeclarative.R
import com.example.testdeclarative.composable.component.AppBar
import com.example.testdeclarative.composable.component.ProductCard
import com.example.testdeclarative.composable.component.PromotionBanner
import com.example.testdeclarative.composable.component.SearchBarContainer

@Composable
fun JerryStore() {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 8.dp)
            .background(color = Color(0xFFEEF4F6))
            .verticalScroll(rememberScrollState())
    ){

        AppBar()
        SearchBarContainer()
        Spacer(modifier = Modifier.height(3.dp))
        PromotionBanner()
        Spacer(modifier = Modifier.height(3.dp))
        SectionHeader()
        Spacer(modifier = Modifier.height(3.dp))
        Column (
            modifier = Modifier
                .padding(start = 16.dp, top = 8.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(1.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp)

            ) {
                ProductCard(
                    imageId = R.drawable.sport_tom,
                    name = "Sport Tom",
                    description = "He runs 1 meter... trips over his boot.",
                    price = "5̶ 3 cheeses",
                    modifier = Modifier.padding(8.dp)
                )
                ProductCard(
                    imageId = R.drawable.tom_lover,
                    name = "Tom the lover",
                    description = "He loves one-sidedly... and is beaten by the other side.",
                    price = "5  cheeses",
                    modifier = Modifier.padding(8.dp)
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                horizontalArrangement = Arrangement.spacedBy(1.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp)

            ) {
                ProductCard(
                    imageId = R.drawable.tom_bomb,
                    name = "Tom the bomb",
                    description = "He blows himself up before Jerry can catch him.",
                    price = "10 cheeses",
                    modifier = Modifier.padding(8.dp)
                )
                ProductCard(
                    imageId = R.drawable.spy_tom,
                    name = "Spy Tom",
                    description = "Disguises itself as a table.",
                    price = "12 cheeses",
                    modifier = Modifier.padding(8.dp)
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                horizontalArrangement = Arrangement.spacedBy(1.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp)

            ) {
                ProductCard(
                    imageId = R.drawable.frozen_tom,
                    name = "Frozen Tom",
                    description = "He was chasing Jerry, he froze after the first look",
                    price = "10 cheeses",
                    modifier = Modifier.padding(8.dp)
                )
                ProductCard(
                    imageId = R.drawable.sleeping_tom,
                    name = "Sleeping Tom",
                    description = "He doesn't chase anyone, he just snores in stereo.",
                    price = "10 cheeses",
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewJerryStore() {
    JerryStore()
}
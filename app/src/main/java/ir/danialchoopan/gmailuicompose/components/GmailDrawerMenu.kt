package ir.danialchoopan.gmailuicompose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ir.danialchoopan.gmailuicompose.models.DrawerMenuData

@Composable
fun GmailDrawerMenu(scrollState: ScrollState) {

    val menuList = listOf(
        DrawerMenuData.ItemOne11,
        DrawerMenuData.ItemOne12,
        DrawerMenuData.ItemOne13,
        DrawerMenuData.ItemOne14,
        DrawerMenuData.ItemOne11,
        DrawerMenuData.ItemOne12,
        DrawerMenuData.ItemOne13,
    )
    Column(modifier = Modifier.verticalScroll(scrollState)) {
        Text("hello gmail", color = Color.Red, modifier = Modifier.padding(10.dp), fontSize = 20.sp)
        Divider(modifier = Modifier.padding(bottom = 20.dp, top = 20.dp))
        menuList.forEach { item ->
            MainDrawerItem(item = item)
        }
    }
}

@Composable
fun MainDrawerItem(item: DrawerMenuData) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(top = 16.dp)
    ) {
        Image(
            imageVector = item.icon!!,
            contentDescription = item.title!!,
            modifier = Modifier.weight(0.5f)
        )
        Text(text = item.title, modifier = Modifier.weight(2.0f))
    }
}
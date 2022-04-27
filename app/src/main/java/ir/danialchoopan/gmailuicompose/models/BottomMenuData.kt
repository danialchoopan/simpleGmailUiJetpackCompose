package ir.danialchoopan.gmailuicompose.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomMenuData(
    val icon: ImageVector,
    val title: String
) {
    object Mail : BottomMenuData(icon = Icons.Default.AccountBox, "mails")
    object Meet : BottomMenuData(icon = Icons.Default.Person, "meet")
}
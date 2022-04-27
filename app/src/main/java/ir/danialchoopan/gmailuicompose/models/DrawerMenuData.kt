package ir.danialchoopan.gmailuicompose.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DrawerMenuData(
    val icon: ImageVector? = null,
    val title: String? = null,
    val isDivider: Boolean = false,
    val isHeader: Boolean = false,
) {
    object ItemOne11 : DrawerMenuData(
        icon = Icons.Default.Add,
        title = "item1"
    )


    object ItemOne12 : DrawerMenuData(
        icon = Icons.Default.Add,
        title = "item2"
    )

    object ItemOne13 : DrawerMenuData(
        icon = Icons.Default.Add,
        title = "item3"
    )

    object ItemOne14 : DrawerMenuData(
        icon = Icons.Default.Add,
        title = "item4"
    )

}

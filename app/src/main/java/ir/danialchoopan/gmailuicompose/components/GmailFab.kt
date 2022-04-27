package ir.danialchoopan.gmailuicompose.components

import androidx.compose.foundation.ScrollState
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable

@Composable
fun GmailFB(scrollState: ScrollState) {
    if (scrollState.value > 50) {
        ExtendedFloatingActionButton(
            text = { Text(text = "compose") },
            onClick = { /*TODO*/ },
            icon = {
                Icon(imageVector = Icons.Default.Edit, contentDescription = "")
            },
            backgroundColor = MaterialTheme.colors.surface
        )
    } else {
        FloatingActionButton(
            onClick = { /*TODO*/ },
            backgroundColor = MaterialTheme.colors.surface
        ) {
            Icon(imageVector = Icons.Default.Edit, contentDescription = "")
        }
    }
}
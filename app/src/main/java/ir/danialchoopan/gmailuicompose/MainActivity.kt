package ir.danialchoopan.gmailuicompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ir.danialchoopan.gmailuicompose.components.*
import ir.danialchoopan.gmailuicompose.ui.theme.GmailUiComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GmailUiComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GmailApp()
                }
            }
        }
    }
}

@Composable
fun GmailApp() {

    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    val scrollState = rememberScrollState()
    val openDialog = remember {
        mutableStateOf(false)
    }


    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { HomeAppBar(scaffoldState, coroutineScope, openDialog) },
        drawerContent = {
            GmailDrawerMenu(scrollState)
        },
        bottomBar = {
            HomeButtonMenu()
        },
        floatingActionButton = { GmailFB(scrollState) }
    ) {

//        test the lazy column
//        LazyColumn {
//            items(500) { index ->
//                Text(text = "text $index", modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(15.dp))
//                Divider()
//            }
//        }
        MailList(paddingValues = it, scrollState)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GmailUiComposeTheme {
        GmailApp()
    }
}
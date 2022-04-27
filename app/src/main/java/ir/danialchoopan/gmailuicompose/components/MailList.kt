package ir.danialchoopan.gmailuicompose.components

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ir.danialchoopan.gmailuicompose.models.MailData

@Composable
fun MailList(paddingValues: PaddingValues, scrollState: ScrollState) {
    val mailsList = listOf(
        MailData(
            mailId = 1,
            userName = "dani",
            subject = "work",
            body = "this is a body",
            timeStamp = "22:22"
        ),
        MailData(
            mailId = 1,
            userName = "dani",
            subject = "work",
            body = "this is a body",
            timeStamp = "22:22"
        ),MailData(
            mailId = 1,
            userName = "dani",
            subject = "work",
            body = "this is a body",
            timeStamp = "22:22"
        ),
        MailData(
            mailId = 1,
            userName = "dani",
            subject = "work",
            body = "this is a body",
            timeStamp = "22:22"
        ),MailData(
            mailId = 1,
            userName = "dani",
            subject = "work",
            body = "this is a body",
            timeStamp = "22:22"
        ),
        MailData(
            mailId = 1,
            userName = "dani",
            subject = "work",
            body = "this is a body",
            timeStamp = "22:22"
        ),MailData(
            mailId = 1,
            userName = "dani",
            subject = "work",
            body = "this is a body",
            timeStamp = "22:22"
        ),
        MailData(
            mailId = 1,
            userName = "dani",
            subject = "work",
            body = "this is a body",
            timeStamp = "22:22"
        ),MailData(
            mailId = 1,
            userName = "dani",
            subject = "work",
            body = "this is a body",
            timeStamp = "22:22"
        ),
        MailData(
            mailId = 1,
            userName = "dani",
            subject = "work",
            body = "this is a body",
            timeStamp = "22:22"
        ),
        MailData(
            mailId = 1,
            userName = "dani1",
            subject = "work2",
            body = "this is a 1body",
            timeStamp = "22:12"
        ),
        MailData(
            mailId = 1,
            userName = "dani1",
            subject = "work2",
            body = "this is a 1body",
            timeStamp = "22:12"
        ),
        MailData(
            mailId = 1,
            userName = "dani1",
            subject = "work2",
            body = "this is a 1body",
            timeStamp = "22:12"
        ),
        MailData(
            mailId = 1,
            userName = "dani1",
            subject = "work2",
            body = "this is a 1body",
            timeStamp = "22:12"
        ),
        MailData(
            mailId = 1,
            userName = "dani1",
            subject = "work2",
            body = "this is a 1body",
            timeStamp = "22:12"
        ),
        MailData(
            mailId = 1,
            userName = "dani1",
            subject = "work2",
            body = "this is a 1body",
            timeStamp = "22:12"
        ),
        MailData(
            mailId = 1,
            userName = "dani1",
            subject = "work2",
            body = "this is a 1body",
            timeStamp = "22:12"
        ),
        MailData(
            mailId = 1,
            userName = "dani1",
            subject = "work2",
            body = "this is a 1body",
            timeStamp = "22:12"
        ),
        MailData(
            mailId = 1,
            userName = "dani1",
            subject = "work2",
            body = "this is a 1body",
            timeStamp = "22:12"
        ),
    )

    Box(modifier = Modifier.padding(paddingValues)) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .scrollable(scrollState, Orientation.Vertical)
        ) {
            items(mailsList) { mailItem ->
                MailItem(mailData = mailItem)
                Spacer(Modifier.height(10.dp))
            }
        }
    }
}


@Composable
fun MailItem(mailData: MailData, modifier: Modifier = Modifier) {
    Row(
        Modifier.fillMaxWidth()
    ) {

        Card(
            modifier = Modifier
                .padding(end = 8.dp)
                .size(40.dp)
                .clip(CircleShape),
            backgroundColor = Color.Gray
        ) {
            Text(
                text = mailData.userName[0].toString(),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(8.dp)
            )
        }

        Column(modifier = Modifier.weight(2.0f)) {
            Text(
                text = mailData.userName,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = mailData.subject,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = mailData.body,
                fontSize = 14.sp,
            )

        }

        Column() {
            Text(
                text = mailData.timeStamp
            )
            IconButton(
                onClick = { /*TODO*/ },
                Modifier
                    .size(50.dp)
                    .padding(16.dp)
            ) {
                Icon(imageVector = Icons.Outlined.Star, contentDescription = "star")
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun MailItemPreview() {
    MailItem(
        mailData =
        MailData(
            mailId = 1,
            userName = "dani",
            subject = "work",
            body = "this is a body",
            timeStamp = "22:22"
        )
    )
}
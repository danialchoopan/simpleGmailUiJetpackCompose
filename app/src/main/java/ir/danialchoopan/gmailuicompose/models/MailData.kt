package ir.danialchoopan.gmailuicompose.models

import javax.security.auth.Subject

data class MailData(
    val mailId: Int,
    val userName: String,
    val subject: String,
    val body: String,
    val timeStamp: String = ""
)
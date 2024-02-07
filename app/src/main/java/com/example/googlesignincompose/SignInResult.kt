package com.example.googlesignincompose


data class SignInResult(
    val data: UserData?,
    val message: String?
)

data class UserData(
    val userId: String,
    val username: String?,
    val profilePictureUrl: String?,
)
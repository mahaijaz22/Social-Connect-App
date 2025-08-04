package com.example.socialconnect.model

data class Post(
    val id: String = "",
    val content: String = "",
    val authorId: String = "",
    val timestamp: Long = 0,
    val likes: List<String> = listOf(),
    val isLiked: Boolean = false
)
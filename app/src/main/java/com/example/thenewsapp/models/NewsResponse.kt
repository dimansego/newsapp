package com.example.thenewsapp.models

import com.example.thenewsapp.db.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)
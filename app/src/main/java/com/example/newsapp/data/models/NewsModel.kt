package com.example.newsapp.data.models

import androidx.room.Entity


data class Article(
    val articleId: String,
    val title: String,
    val link: String,
    val keywords: List<String>,
    val creator: List<String>,
    val videoUrl: String?,
    val description: String,
    val content: String,
    val pubDate: String,
    val imageUrl: String,
    val sourceId: String,
    val sourcePriority: Long,
    val sourceUrl: String,
    val sourceIcon: String,
    val language: String,
    val country: List<String>,
    val category: List<String>,
    val aiTag: List<String>,
    val aiRegion: List<String>,
    val sentiment: String,
    val sentimentStats: SentimentStats
)

data class SentimentStats(
    val positive: Double,
    val neutral: Double,
    val negative: Double
)

/*@Entity(tableName = "news")*/
data class NewsModel(
    val status: String,
    val totalResults: Int,
    val results: List<Article>,
    val nextPage: String
)
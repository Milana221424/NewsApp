package com.example.newsapp.domain.repositories

import androidx.lifecycle.LiveData
import com.example.newsapp.data.utils.Resource
import com.example.newsapp.data.models.NewsModel

interface NewsRepository {
    suspend fun getNews(): LiveData<Resource<NewsModel>>
}
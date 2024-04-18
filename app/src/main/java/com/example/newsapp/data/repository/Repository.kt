package com.example.newsapp.data.repository

import androidx.lifecycle.LiveData
import com.example.newsapp.data.utils.Resource
import com.example.newsapp.base.BaseRepository
import com.example.newsapp.data.models.NewsModel
import com.example.newsapp.data.remote.NewsApiService
import com.example.newsapp.domain.repositories.NewsRepository
import javax.inject.Inject

class Repository @Inject constructor(private val apiService: NewsApiService): BaseRepository(), NewsRepository {

    override suspend fun getNews():LiveData<Resource<NewsModel>> = performRequest {
        apiService.getNews().body()!!
    }
}
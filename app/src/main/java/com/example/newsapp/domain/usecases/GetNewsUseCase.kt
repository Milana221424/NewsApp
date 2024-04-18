package com.example.newsapp.domain.usecases

import androidx.lifecycle.LiveData
import com.example.newsapp.data.utils.Resource
import com.example.newsapp.data.models.NewsModel
import com.example.newsapp.domain.repositories.NewsRepository
import javax.inject.Inject

class GetNewsUseCase @Inject constructor(private val newsRepository: NewsRepository) {
    suspend fun getNews(): LiveData<Resource<NewsModel>> = newsRepository.getNews()
}
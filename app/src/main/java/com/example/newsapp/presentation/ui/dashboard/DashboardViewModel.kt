package com.example.newsapp.presentation.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.newsapp.data.utils.Resource
import com.example.newsapp.data.models.NewsModel
import com.example.newsapp.domain.usecases.GetNewsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DashboardViewModel @Inject constructor(private val useCase: GetNewsUseCase)  : ViewModel() {

    suspend fun getNews(): LiveData<Resource<NewsModel>> =  useCase.getNews()
}
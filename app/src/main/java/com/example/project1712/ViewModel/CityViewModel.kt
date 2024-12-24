package com.example.project1712.ViewModel

import androidx.lifecycle.ViewModel
import com.example.project1712.Repository.CityRepository
import com.example.project1712.Server.ApiClient
import com.example.project1712.Server.ApiServices
import retrofit2.create

class CityViewModel(val repository: CityRepository) : ViewModel() {
    constructor() : this(CityRepository(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCity(q: String, limit: Int) =
        repository.getCities(q, limit)
}
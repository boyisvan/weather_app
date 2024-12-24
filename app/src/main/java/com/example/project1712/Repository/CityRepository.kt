package com.example.project1712.Repository

import com.example.project1712.Server.ApiServices

class CityRepository(val api: ApiServices) {
    fun getCities(q: String, limit: Int) =
        api.getCitiesList(q, limit, "0773ade61d7e97ff9b2d9a906d7670bf")
}
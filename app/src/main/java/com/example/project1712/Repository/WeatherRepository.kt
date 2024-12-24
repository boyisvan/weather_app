package com.example.project1712.Repository

import com.example.project1712.Server.ApiServices

class WeatherRepository(val api:ApiServices) {

    fun getCurrentWeather(lat: Double,lng:Double,unit:String)=
        api.getCurrentWeather(lat,lng,unit,"0773ade61d7e97ff9b2d9a906d7670bf")

    fun getForecastWeather(lat: Double,lng:Double,unit:String)=
        api.getForecastWeather(lat,lng,unit,"0773ade61d7e97ff9b2d9a906d7670bf")
}
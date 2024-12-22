package kaz.asif.weather.data.repository

import kaz.asif.weather.model.Weather
import kaz.asif.weather.utils.Result
import kotlinx.coroutines.flow.Flow

interface WeatherRepository {
    fun getWeatherForecast(city: String): Flow<Result<Weather>>
}
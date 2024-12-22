package kaz.asif.weather.model

import kaz.asif.weather.data.model.ForecastResponse.Current.Condition
import kaz.asif.weather.model.Forecast

data class Weather(
    val temperature: Int,
    val date: String,
    val wind: Int,
    val humidity: Int,
    val feelsLike: Int,
    val condition: Condition,
    val uv: Int,
    val name: String,
    val forecasts: List<Forecast>
)

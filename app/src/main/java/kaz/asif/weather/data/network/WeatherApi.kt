package kaz.asif.weather.data.network


import kaz.asif.weather.BuildConfig
import kaz.asif.weather.utils.DEFAULT_WEATHER_DESTINATION
import kaz.asif.weather.utils.NUMBER_OF_DAYS
import retrofit2.http.GET
import retrofit2.http.Query
import kaz.asif.weather.data.model.ForecastResponse

interface WeatherApi {
    @GET("forecast.json")
    suspend fun getWeatherForecast(
        @Query("key") key: String = BuildConfig.API_KEY,
        @Query("q") city: String = DEFAULT_WEATHER_DESTINATION,
        @Query("days") days: Int = NUMBER_OF_DAYS,
    ): ForecastResponse
}
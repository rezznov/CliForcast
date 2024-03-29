package com.example.cliforcast.network;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetWeatherService {
    @GET("/data/2.5/weather?APPID=276e7cbc702e178eb512aec1a2610679")
    Call<Weather> getWeather(@Query("id") int cityId);

    @GET("/data/2.5/forecast?APPID=276e7cbc702e178eb512aec1a2610679")
    Call<WeatherList> getFiveDayWeather(@Query("id") int cityId);

    @GET("/data/2.5/weather?APPID=276e7cbc702e178eb512aec1a2610679")
    Call<Weather> getWeather(@Query("lat") double lat,@Query("lon") double lon);

    @GET("/data/2.5/forecast?APPID=276e7cbc702e178eb512aec1a2610679")
    Call<WeatherList> getFiveDayWeather(@Query("lat") double lat,@Query("lon") double lon);


    @GET("/data/2.5/group?APPID=276e7cbc702e178eb512aec1a2610679")
    Call<WeatherList> getWeatherList(@Query("id") int... cities);
}

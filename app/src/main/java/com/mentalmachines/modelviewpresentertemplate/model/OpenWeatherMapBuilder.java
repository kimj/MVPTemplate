package com.mentalmachines.modelviewpresentertemplate.model;

import com.squareup.moshi.Moshi;

import retrofit2.MoshiConverterFactory;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by CaptofOuterSpace on 8/22/2016.
 */
public class OpenWeatherMapBuilder {
    String API = "http://api.openweathermap.org/data/2.5/";
    String API_KEY = "e85d4199f4ca399a2dce7c98fc1f0648";

    public static interface OpenWeatherMapService {
        @GET("/data/2.5/weather")
        CurrentWeather getCurrentWeather(@Query("lat") float lat, @Query("lon") float lon, @Query("units") String units);
    }
    // http://api.openweathermap.org/data/2.5/weather?q=Boston,US&appid=e85d4199f4ca399a2dce7c98fc1f0648


    public static OpenWeatherMapService build(){
        Moshi moshi = new Moshi.Builder().build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .build();

        return retrofit.create(OpenWeatherMapService.class);
    }
}
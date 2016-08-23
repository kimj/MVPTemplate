package com.mentalmachines.modelviewpresentertemplate.model;

import com.squareup.moshi.Moshi;

import retrofit2.MoshiConverterFactory;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by CaptofOuterSpace on 8/22/2016.
 */
public class OpenWeatherMapBuilder {

    String API_KEY = "e85d4199f4ca399a2dce7c98fc1f0648";

    OpenWeatherMapApi mOpenWeatherMapApi;

    public static interface OpenWeatherMapApi{
        @GET("/data/2.5/weather")
        public Observable<CurrentWeather> getCurrentWeather(@Query("lat") float lat, @Query("lon") float lon, @Query("units") String units);
    }
    // http://api.openweathermap.org/data/2.5/weather?q=Boston,US&appid=e85d4199f4ca399a2dce7c98fc1f0648

    public OpenWeatherMapApi getOpenWeatherMapApi(){
        return mOpenWeatherMapApi;
    }

    public static OpenWeatherMapApi build(){
        String API = "http://api.openweathermap.org/data/2.5/";
        Moshi moshi = new Moshi.Builder().build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API)
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .build();

        return retrofit.create(OpenWeatherMapApi.class);
    }
}
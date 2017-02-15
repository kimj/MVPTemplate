package com.mentalmachines.modelviewpresentertemplate.services;

import com.squareup.moshi.Moshi;

import retrofit2.MoshiConverterFactory;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by CaptofOuterSpace on 8/22/2016.
 */
public class OpenWeatherMapService {
    static String API = "http://api.openweathermap.org/data/2.5/";
    static String API_KEY = "e85d4199f4ca399a2dce7c98fc1f0648";

    OpenWeatherMapApi mOpenWeatherMapApi;

    public interface OpenWeatherMapApi{
        @GET("weather/appid=e85d4199f4ca399a2dce7c98fc1f0648")
        Observable<CurrentWeather> getCurrentWeather(@Query("q") String q,
                                                     @Query("units") String units);
    }
}
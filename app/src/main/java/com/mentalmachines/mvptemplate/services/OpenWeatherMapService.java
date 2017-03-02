package com.mentalmachines.mvptemplate.services;

import com.mentalmachines.mvptemplate.model.Model;

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
        Observable<Model> getCurrentWeather(@Query("q") String q,
                                            @Query("units") String units);
    }
}
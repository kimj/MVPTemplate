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
    static String API = "http://api.openweathermap.org/data/2.5/";
    static String API_KEY = "e85d4199f4ca399a2dce7c98fc1f0648";
    // http://api.openweathermap.org/data/2.5/weather?q=Boston,US&appid=e85d4199f4ca399a2dce7c98fc1f0648
    // lon=-71.06,lat=42.36

    OpenWeatherMapApi mOpenWeatherMapApi;

    public interface OpenWeatherMapApi{
/*        @GET("weather/appid=e85d4199f4ca399a2dce7c98fc1f0648")
        Observable<CurrentWeather> getCurrentWeather(@Query("lat") float lat,
                                                     @Query("lon") float lon,
                                                     @Query("units") String units);*/

        @GET("weather/appid=e85d4199f4ca399a2dce7c98fc1f0648")
        Observable<CurrentWeather> getCurrentWeather(@Query("q") String q,
                                                     @Query("units") String units);
    }

    public OpenWeatherMapApi getOpenWeatherMapApi(){
        return mOpenWeatherMapApi;
    }

    public static OpenWeatherMapApi build(){

        Moshi moshi = new Moshi.Builder().build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API)
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .build();

        return retrofit.create(OpenWeatherMapApi.class);
    }
}
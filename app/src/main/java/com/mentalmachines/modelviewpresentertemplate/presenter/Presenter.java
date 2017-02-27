package com.mentalmachines.modelviewpresentertemplate.presenter;

import android.location.Location;
import android.util.Log;

import com.mentalmachines.modelviewpresentertemplate.views.WeatherFragment;
import com.mentalmachines.modelviewpresentertemplate.services.OpenWeatherMapService;

import retrofit2.adapter.rxjava.HttpException;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by CaptofOuterSpace on 8/22/2016.
 */
public class Presenter implements PresenterInterface {
    WeatherFragment mView;
    OpenWeatherMapService mOpenWeatherMapService;

    public Presenter(WeatherFragment weatherFragment) {
        mView = weatherFragment;
        mOpenWeatherMapService = new OpenWeatherMapService();
    }

    public void getCurrentWeather(Location location){
        mOpenWeatherMapService.getOpenWeatherMapApi()
                .getCurrentWeather("Boston,US", "imperial")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(currentWeather -> mView.updateCurrentWeatherViews(currentWeather)});
        }



}

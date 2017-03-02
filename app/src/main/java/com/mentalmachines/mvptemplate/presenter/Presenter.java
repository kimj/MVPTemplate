package com.mentalmachines.mvptemplate.presenter;

import android.location.Location;

import com.mentalmachines.mvptemplate.views.WeatherFragment;
import com.mentalmachines.mvptemplate.services.OpenWeatherMapService;

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

    /*public void getCurrentWeather(Location location){
        mOpenWeatherMapService.getCurrentWeather("Boston,US", "imperial")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(currentWeather -> mView.updateCurrentWeatherViews(currentWeather)});
        }*/
}

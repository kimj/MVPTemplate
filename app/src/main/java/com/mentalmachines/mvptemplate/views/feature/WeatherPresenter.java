package com.mentalmachines.mvptemplate.views.feature;

import android.location.Location;

import com.mentalmachines.mvptemplate.views.base.BasePresenter;
import com.mentalmachines.mvptemplate.services.OpenWeatherMapService;

/**
 * Created by CaptofOuterSpace on 8/22/2016.
 */
public class WeatherPresenter extends BasePresenter implements WeatherContract.Presenter {
    WeatherFragment mView;
    OpenWeatherMapService mOpenWeatherMapService;

    public WeatherPresenter(WeatherFragment weatherFragment) {
        mView = weatherFragment;
        mOpenWeatherMapService = new OpenWeatherMapService();
    }

    public void getCurrentWeather(Location location){
        /*mOpenWeatherMapService.getOpenWeatherMapApi()
                .getCurrentWeather("Boston,US", "imperial")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(currentWeather -> mView.updateCurrentWeatherViews(currentWeather)});*/
        }
}

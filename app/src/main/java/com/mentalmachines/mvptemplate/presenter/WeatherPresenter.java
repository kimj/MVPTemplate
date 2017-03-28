package com.mentalmachines.mvptemplate.presenter;

import android.location.Location;

import com.mentalmachines.mvptemplate.presenter.interfaces.BasePresenterInterface;
import com.mentalmachines.mvptemplate.views.WeatherFragment;
import com.mentalmachines.mvptemplate.services.OpenWeatherMapService;

/**
 * Created by CaptofOuterSpace on 8/22/2016.
 */
public class WeatherPresenter extends BasePresenter implements BasePresenterInterface {
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

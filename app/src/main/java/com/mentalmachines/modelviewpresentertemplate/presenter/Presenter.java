package com.mentalmachines.modelviewpresentertemplate.presenter;

import com.mentalmachines.modelviewpresentertemplate.PresenterInterface;
import com.mentalmachines.modelviewpresentertemplate.views.WeatherFragment;
import com.mentalmachines.modelviewpresentertemplate.model.CurrentWeather;
import com.mentalmachines.modelviewpresentertemplate.OpenWeatherMapBuilder;

import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by CaptofOuterSpace on 8/22/2016.
 */
public class Presenter implements PresenterInterface {
    CurrentWeather mCurrentWeather;
    WeatherFragment mView;
    OpenWeatherMapBuilder mOpenWeatherMapService;

    public Presenter(WeatherFragment weatherFragment, OpenWeatherMapBuilder openWeatherMapBuilder) {
        mView = weatherFragment;
        mOpenWeatherMapService = openWeatherMapBuilder;
    }

    public void getCurrentWeather(){
        mOpenWeatherMapService.getOpenWeatherMapApi()
                .getCurrentWeather("Boston,US", "imperial")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<CurrentWeather>() {
                    @Override
                    public void onCompleted() {}

                    @Override
                    public void onError(Throwable e) {}

                    @Override
                    public void onNext(CurrentWeather currentWeather) {
                        mView.updateCurrentWeatherViews(currentWeather);
                    }
                });
        }


    public interface View {
        void updateCurrentWeatherViews(CurrentWeather currentWeather);
    }
}

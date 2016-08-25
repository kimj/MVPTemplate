package com.mentalmachines.modelviewpresentertemplate.presenter;

import android.view.View;

import com.mentalmachines.modelviewpresentertemplate.WeatherFragment;
import com.mentalmachines.modelviewpresentertemplate.model.CurrentWeather;
import com.mentalmachines.modelviewpresentertemplate.model.OpenWeatherMapBuilder;

import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by CaptofOuterSpace on 8/22/2016.
 */
public class Presenter {
    CurrentWeather mCurrentWeather;
    WeatherFragment mView;
    OpenWeatherMapBuilder mOpenWeatherMapService;

    public Presenter(WeatherFragment weatherFragment, OpenWeatherMapBuilder openWeatherMapBuilder) {
        mView = weatherFragment;
        mOpenWeatherMapService = openWeatherMapBuilder;
    }

    public void getCurrentWeather(){
        Observable<CurrentWeather> call = mOpenWeatherMapService.getOpenWeatherMapApi()
                .getCurrentWeather("Boston,US", "imperial");
        Subscription subscription = call
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
            /*mOpenWeatherMapService.getOpenWeatherMapApi()
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
                    });*/
        }


    public interface View {
        void updateCurrentWeatherViews(CurrentWeather currentWeather);
    }
}

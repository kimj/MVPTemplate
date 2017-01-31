package com.mentalmachines.modelviewpresentertemplate.presenter;

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

    public void getCurrentWeather(Location){
        mOpenWeatherMapService.getOpenWeatherMapApi()
                .getCurrentWeather("Boston,US", "imperial")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<CurrentWeather>() {
                    @Override
                    public void onCompleted() {}

                    @Override
                    public void onError(Throwable e) {
                        if (e instanceof HttpException) {
                            HttpException response = (HttpException)e;
                            int code = response.code();
                        } else {
                            Log.i("MVPTemplate", e.toString());
                        }
                    }

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

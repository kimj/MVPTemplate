package com.mentalmachines.modelviewpresentertemplate;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mentalmachines.modelviewpresentertemplate.model.CurrentWeather;
import com.mentalmachines.modelviewpresentertemplate.model.OpenWeatherMapBuilder;
import com.mentalmachines.modelviewpresentertemplate.presenter.Presenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Response;

/**
 * Created by CaptofOuterSpace on 8/22/2016.
 */
public class WeatherFragment extends Fragment implements Presenter.View{
    public static String TAG = "WeatherFragment";
    Presenter mPresenter;
    OpenWeatherMapBuilder.OpenWeatherMapService mOpenWeatherMapService;

    @BindView(R.id.title) TextView title;
    @BindView(R.id.subtitle) TextView subtitle;
    @BindView(R.id.footer) TextView footer;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mOpenWeatherMapService = OpenWeatherMapBuilder.build();
        mOpenWeatherMapService.getCurrentWeather(38.8808f, -94.8031f, CurrentWeather.Main.UNITS_IMPERIAL, new Callback<Forecast>() {
            @Override
            public void success(CurrentWeather currentWeather, Response response) {

                mTextView.setText(response.getUrl() + "\n" + new Gson().toJson(forecast, Forecast.class));
            }

            @Override
            public void failure(RetrofitError error) {
                StringBuilder e = new StringBuilder(error.getMessage());
                e.append("\n");
                for (StackTraceElement st : error.getStackTrace()) {
                    e.append(st.toString());
                    e.append("\n");
                }
                mTextView.setText(e.toString());
            }
        });

        mPresenter = new Presenter();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.weather_fragment, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
    }
}

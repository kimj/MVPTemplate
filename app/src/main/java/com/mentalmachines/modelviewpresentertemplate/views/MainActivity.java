package com.mentalmachines.modelviewpresentertemplate.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mentalmachines.modelviewpresentertemplate.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().
                    add(R.id.container, new WeatherFragment(), WeatherFragment.TAG).
                    commit();
        }
    }
}
package com.mentalmachines.mvptemplate.views.feature;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mentalmachines.mvptemplate.di.component.FragmentComponent;
import com.mentalmachines.mvptemplate.views.base.BaseFragment;

/**
 * Created by jkim11 on 4/3/17.
 */

public class WeatherFragment extends BaseFragment implements WeatherContract.View {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public int getLayout() {
        return 0;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public FragmentComponent fragmentComponent() {
        return super.fragmentComponent();
    }
}

package com.mentalmachines.mvptemplate.di.component;


import com.mentalmachines.mvptemplate.di.module.ActivityModule;
import com.mentalmachines.mvptemplate.views.MainActivity;
import com.mentalmachines.mvptemplate.views.base.BaseActivity;
import com.mentalmachines.mvptemplate.views.detail.DetailActivity;

import dagger.Subcomponent;

/**
 * Created by jkim11 on 2/24/17.
 */

@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(BaseActivity baseActivity);

    void inject(MainActivity mainActivity);

    void inject(DetailActivity detailActivity);
}
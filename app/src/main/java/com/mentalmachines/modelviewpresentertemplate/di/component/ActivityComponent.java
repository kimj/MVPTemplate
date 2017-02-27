package com.mentalmachines.modelviewpresentertemplate.di.component;

import com.mentalmachines.modelviewpresentertemplate.di.module.ActivityModule;
import com.mentalmachines.modelviewpresentertemplate.views.MainActivity;
import com.mentalmachines.modelviewpresentertemplate.views.base.BaseActivity;

import dagger.Subcomponent;

/**
 * Created by jkim11 on 2/24/17.
 */

public class ActivityComponent {
    @PerActivity
    @Subcomponent(modules = ActivityModule.class)
    public interface ActivityComponent {
        void inject(BaseActivity baseActivity);

        void inject(MainActivity mainActivity);

        void inject(DetailActivity detailActivity);
    }
}

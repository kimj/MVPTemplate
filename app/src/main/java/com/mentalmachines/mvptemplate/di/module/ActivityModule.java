package com.mentalmachines.mvptemplate.di.module;

import android.app.Activity;
import android.content.Context;

import com.mentalmachines.mvptemplate.di.ActivityContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jkim11 on 2/24/17.
 */

@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    Activity provideActivity() {
        return mActivity;
    }

    @Provides
    Context providesContext() {
        return mActivity;
    }
}


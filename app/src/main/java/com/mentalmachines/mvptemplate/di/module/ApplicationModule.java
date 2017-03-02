package com.mentalmachines.mvptemplate.di.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Provides;

/**
 * Created by jkim11 on 2/24/17.
 */

public class ApplicationModule {
    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    Context provideContext() {
        return mApplication;
    }

    /*@Provides
    @Singleton
    static MvpService provideMvpStarterService() {
        return MvpStarterServiceFactory.makeStarterService();
    }*/
}

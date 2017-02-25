package com.mentalmachines.modelviewpresentertemplate.di;

import android.app.Application;
import android.content.Context;

import com.mentalmachines.modelviewpresentertemplate.services.MvpServiceFactory;

import javax.inject.Singleton;

import dagger.Provides;

/**
 * Created by jkim11 on 1/31/17.
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
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    @Singleton
    static MvpServiceFactory provideMvpStarterService() {
        return MvpServiceFactory.makeMvpStarterService();
    }
}

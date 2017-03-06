package com.mentalmachines.mvptemplate.di;

import android.app.Application;
import android.content.Context;

import com.mentalmachines.mvptemplate.services.MvpServiceFactory;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jkim11 on 1/31/17.
 */
@Module
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

    @Provides
    @Singleton
    static MvpServiceFactory provideMvpStarterService() {
        return MvpServiceFactory.makeMvpStarterService();
    }
}

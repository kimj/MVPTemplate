package com.mentalmachines.mvptemplate.di.component;

import android.app.Application;
import android.content.Context;

import com.mentalmachines.mvptemplate.PreferencesHelper;
import com.mentalmachines.mvptemplate.di.ApplicationContext;
import com.mentalmachines.mvptemplate.di.module.ApplicationModule;
import com.mentalmachines.mvptemplate.model.DataManager;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jkim11 on 2/24/17.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    @ApplicationContext
    Context context();

    Application application();

    PreferencesHelper preferencesHelper();

    DataManager dataManager();
}



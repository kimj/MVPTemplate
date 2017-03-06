package com.mentalmachines.mvptemplate;

import android.app.Application;
import android.content.Context;

import com.facebook.stetho.Stetho;
import com.mentalmachines.mvptemplate.di.component.ApplicationComponent;
import com.mentalmachines.mvptemplate.di.module.ApplicationModule;
import com.squareup.leakcanary.LeakCanary;

import timber.log.Timber;

/**
 * Created by jkim11 on 2/24/17.
 */

public class MVPTemplateApplication extends Application{
    ApplicationComponent mApplicationComponent;

    public static MVPTemplateApplication get(Context context) {
        return (MVPTemplateApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
            Stetho.initializeWithDefaults(this);
            LeakCanary.install(this);
        }
    }

    public ApplicationComponent getComponent() {
        if (mApplicationComponent == null) {
            mApplicationComponent = DaggerApplicationComponent.builder()
                    .applicationModule(new ApplicationModule(this))
                    .build();
        }
        return mApplicationComponent;
    }

    // Needed to replace the component with a test specific one
    public void setComponent(ApplicationComponent applicationComponent) {
        mApplicationComponent = applicationComponent;
    }
}

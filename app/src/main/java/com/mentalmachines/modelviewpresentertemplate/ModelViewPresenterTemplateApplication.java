package com.mentalmachines.modelviewpresentertemplate;

import android.app.Application;
import android.content.Context;

import com.facebook.stetho.Stetho;
import com.mentalmachines.modelviewpresentertemplate.di.ApplicationModule;
import com.mentalmachines.modelviewpresentertemplate.di.component.ApplicationComponent;

import timber.log.Timber;

/**
 * Created by jkim11 on 2/24/17.
 */

public class ModelViewPresenterTemplateApplication extends Application{
    ApplicationComponent mApplicationComponent;

    public static ModelViewPresenterTemplateApplication get(Context context) {
        return (ModelViewPresenterTemplateApplication) context.getApplicationContext();
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

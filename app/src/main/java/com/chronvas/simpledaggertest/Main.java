package com.chronvas.simpledaggertest;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import timber.log.Timber;

/**
 * Created by vasileios.chroniadis on 30/07/2017..
 */
public class Main extends DaggerApplication {
    private static void initTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }

    private static void initLeakCanary(Application application) {
        if (LeakCanary.isInAnalyzerProcess(application)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(application);
    }

    @Inject
    void logInjection() {
        Timber.d("MainApplication, Injecting " + Main.class.getSimpleName());
    }

    @Override
    public void onCreate() {
        initTimber(); //before super, to be available at injection time
        super.onCreate();
        initLeakCanary(this);
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerMainComponent.builder().create(this);
    }
}

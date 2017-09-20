package com.chronvas.simpledaggertest;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by vasileios.chroniadis on 30/07/2017..
 */
@Module
abstract class MainModule {

    @Provides
    static Context provideContext(Main main) {
        return main.getApplicationContext();
    }

    @Binds
    abstract Application application(Main main);
}

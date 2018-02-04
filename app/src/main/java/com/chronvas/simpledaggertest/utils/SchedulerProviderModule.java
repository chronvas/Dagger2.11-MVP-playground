package com.chronvas.simpledaggertest.utils;

import dagger.Binds;
import dagger.Module;

/**
 * Created by vasileios.chroniadis on 30/07/2017..
 */
@Module
public abstract class SchedulerProviderModule {

    @Binds
//    @Singleton
    abstract ISchedulerProvider provideSchedulerProvider(SchedulerProvider schedulerProvider);
}

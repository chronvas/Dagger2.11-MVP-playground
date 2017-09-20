package com.chronvas.simpledaggertest;

import com.chronvas.simpledaggertest.activity.SimpleActivityPresenterModule;
import com.chronvas.simpledaggertest.repo.RepositoryModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by vasileios.chroniadis on 30/07/2017..
 */
@Component(
        modules = {
                AndroidSupportInjectionModule.class, //mandatory
                MainModule.class,
                SimpleActivityPresenterModule.class,
                RepositoryModule.class
        }
)
@Singleton
public interface MainComponent extends AndroidInjector<Main> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<Main> {
    }
}

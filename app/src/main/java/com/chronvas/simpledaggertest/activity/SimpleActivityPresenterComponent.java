package com.chronvas.simpledaggertest.activity;

import com.chronvas.simpledaggertest.injection.ActivityScoped;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by vasileios.chroniadis on 30/07/2017..
 */
@ActivityScoped
@Subcomponent
public interface SimpleActivityPresenterComponent extends AndroidInjector<SimpleActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SimpleActivity> {}
}
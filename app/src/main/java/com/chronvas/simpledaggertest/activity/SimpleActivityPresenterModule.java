package com.chronvas.simpledaggertest.activity;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by vasileios.chroniadis on 30/07/2017..
 */
@Module(subcomponents = SimpleActivityPresenterComponent.class)
public abstract class SimpleActivityPresenterModule {

    @Binds
    @IntoMap
    @ActivityKey(SimpleActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bind(SimpleActivityPresenterComponent.Builder builder);

    @Binds
    abstract ISimpleActivityContract.Presenter simplePresenter(SimpleActivityPresenter presenter);

    @Binds
    abstract ISimpleActivityContract.View simpleView(SimpleActivity view);
}

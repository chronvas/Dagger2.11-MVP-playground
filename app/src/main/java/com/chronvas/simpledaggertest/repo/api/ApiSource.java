package com.chronvas.simpledaggertest.repo.api;

import android.content.Context;

import javax.inject.Inject;

import timber.log.Timber;

/**
 * Created by vasileios.chroniadis on 30/07/2017..
 */

public class ApiSource implements IApiSource {

    private final Context context;

    @Inject
    public ApiSource(Context context) {
        Timber.e("constructor: ");
        if (context == null) {
            //todo: throw
            Timber.e("context: null");
        } else {
            Timber.e("has context: ");
        }
        this.context = context;
    }

    @Override
    public void callServer() {
        if (context == null)
            Timber.e("context == null");


    }
}

package com.chronvas.simpledaggertest.repo;

import android.content.Context;

import com.chronvas.simpledaggertest.repo.api.IApiSource;

import javax.inject.Inject;

import timber.log.Timber;

/**
 * Created by vasileios.chroniadis on 30/07/2017..
 */

public class Repository implements IRepository {

    private final IApiSource apiSource;

    @Inject
    Context context;

    @Inject
    public Repository(IApiSource apiSource) {
        Timber.d("Repository constructor");
        this.apiSource = apiSource;
        if (apiSource == null) {
            Timber.e("apiSource : null");
        } else {
            Timber.e("has apisource: ");
        }
    }

    @Override
    public String getUser() {
        if (context == null)
            Timber.e("context == null");
        if (apiSource == null) {
            Timber.e("apiSource == null");
            return "Repo check, apisource == null";
        } else {
            apiSource.callServer();
            return "User";
        }
    }
}

package com.chronvas.simpledaggertest.activity;


import com.chronvas.simpledaggertest.repo.IRepository;
import com.chronvas.simpledaggertest.injection.ActivityScoped;

import javax.inject.Inject;

import timber.log.Timber;

/**
 * Created by vasileios.chroniadis on 30/07/2017..
 */
@ActivityScoped
public class SimpleActivityPresenter implements ISimpleActivityContract.Presenter {

    ISimpleActivityContract.View view;

    @Inject
    IRepository repository;

    @Inject
    public SimpleActivityPresenter(ISimpleActivityContract.View view) {
        Timber.d("Constructor");
        this.view = view;
        if (repository == null)
            Timber.e("repo: null");
    }

    @Override
    public void check() {
        view.showToast(hashCode());
    }
}

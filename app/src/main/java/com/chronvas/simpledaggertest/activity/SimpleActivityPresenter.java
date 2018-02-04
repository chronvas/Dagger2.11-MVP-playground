package com.chronvas.simpledaggertest.activity;


import com.chronvas.simpledaggertest.injection.ActivityScoped;
import com.chronvas.simpledaggertest.repo.IRepository;

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
    public SimpleActivityPresenter(ISimpleActivityContract.View view, IRepository repository) {
        this.repository = repository;
        Timber.d("Constructor");
        this.view = view;
        if (view == null)
            Timber.e("view: null");
    }

    @Override
    public void check() {
        repository.getUser();
        view.showToast(hashCode());
    }
}

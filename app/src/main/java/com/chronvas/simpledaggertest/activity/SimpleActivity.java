package com.chronvas.simpledaggertest.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.chronvas.simpledaggertest.R;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import timber.log.Timber;

public class SimpleActivity extends AppCompatActivity implements ISimpleActivityContract.View {

    @Inject
    ISimpleActivityContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        presenter.check();
    }

    //called from presenter
    @Override
    public void showToast(int hashCode) {
        System.out.println();
        Timber.e("the presenter's hashcode: " + hashCode);

    }

    @Inject
    void logInjection() {
        Timber.e("Injecting: ");
    }
}

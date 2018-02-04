package com.chronvas.simpledaggertest.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.chronvas.simpledaggertest.R;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.AndroidInjection;
import timber.log.Timber;

public class SimpleActivity extends AppCompatActivity implements ISimpleActivityContract.View {

    @Inject
    ISimpleActivityContract.Presenter presenter;

    @BindView(R.id.textView)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        ButterKnife.bind(this);
        presenter.check();
    }

    @Override
    public void showToast(int hashCode) {
        textView.setText(String.valueOf(hashCode));
    }

    @Inject
    void logInjection() {
        Timber.e("Injecting: ");
    }
}

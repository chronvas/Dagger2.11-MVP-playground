package com.chronvas.simpledaggertest.utils;

import android.support.annotation.NonNull;

import io.reactivex.Scheduler;

/**
 * Created by vasileios.chroniadis on 30/07/2017..
 */

interface ISchedulerProvider {
    @NonNull
    Scheduler computation();

    @NonNull
    Scheduler io();

    @NonNull
    Scheduler ui();
}

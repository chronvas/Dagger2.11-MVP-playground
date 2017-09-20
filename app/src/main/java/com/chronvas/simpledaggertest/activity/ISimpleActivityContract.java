package com.chronvas.simpledaggertest.activity;

/**
 * Created by vasileios.chroniadis on 30/07/2017..
 */

interface ISimpleActivityContract {
    interface View {
        void showToast(int hashCode);
    }

    interface Presenter {
        void check();
    }
}

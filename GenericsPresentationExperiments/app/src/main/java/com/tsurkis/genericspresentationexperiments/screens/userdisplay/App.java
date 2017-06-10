package com.tsurkis.genericspresentationexperiments.screens.userdisplay;

import android.app.Application;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
public class App extends Application {
    private static App instance;

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;
    }

    public static App getInstance() {
        return instance;
    }
}

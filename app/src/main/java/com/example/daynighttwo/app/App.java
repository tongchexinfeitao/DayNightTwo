package com.example.daynighttwo.app;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;

/**
 * Created by hasee on 2017/8/7.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (getSharedPreferences("theme", MODE_PRIVATE).getBoolean("night_theme", false)) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }
    }
}

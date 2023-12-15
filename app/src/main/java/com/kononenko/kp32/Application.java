package com.kononenko.kp32;

import static com.kononenko.kp32.basics.koin.JavaKoin.startKoinApplication;

import androidx.lifecycle.LifecycleObserver;

public class Application extends android.app.Application implements LifecycleObserver {

    public static final String TAG = "StatisticApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        startKoinApplication(this);
    }

}
package com.bter.greendaodemo;

import android.app.Application;
import android.content.Context;

import com.bter.greendaodemo.greendao.GreenDaoManager;

/**
 * Created by taofaqi on 2017/7/6.
 */

public class App extends Application {

    public static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        GreenDaoManager.getInstance();
    }

    public static Context getmContext() {
        return mContext;
    }
}

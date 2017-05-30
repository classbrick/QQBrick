package com.example.classbrick.qqbrick.utils;

import android.content.Context;

/**
 * Created by classbrick on 2017/5/30.
 */

public class Application extends android.app.Application {
    private static final String TAG = "Application";

    private static Context context = null;

    public void onCreate(){
        super.onCreate();
        this.context = getApplicationContext();
    }

    public static Context getGlobalContext(){
        return context;
    }
}

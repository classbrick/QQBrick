package com.example.classbrick.qqbrick.utils;

import android.content.Context;

/**
 * Created by classbrick on 2017/5/30.
 */

public class Application extends android.app.Application {
    private static final String TAG = "Application";

    private static Context context = null;

    @Override
    public void attachBaseContext(Context mContext){
        context = getApplicationContext();
    }

    public void onCreate(){
        super.onCreate();
        //context = getApplicationContext();
    }

    public static Context getGlobalContext(){
        return context;
    }
}

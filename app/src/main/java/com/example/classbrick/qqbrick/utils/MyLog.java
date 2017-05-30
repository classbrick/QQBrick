package com.example.classbrick.qqbrick.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by classbrick on 2017/5/30.
 */

public class MyLog {
    private static boolean debug = true;

    public static void i(String TAG, String Msg){
        if(debug){
            Log.i(TAG, Msg);
        }
    }

    public static void e(String TAG, String Msg){
        if(debug){
            Log.e(TAG, Msg);
        }
    }

    public static void d(String TAG, String Msg){
        if(debug){
            Log.d(TAG, Msg);
        }
    }

    public static void v(String TAG, String Msg){
        if(debug){
            Log.v(TAG, Msg);
        }
    }

    public static void w(String TAG, String Msg){
        if(debug){
            Log.w(TAG, Msg);
        }
    }

    public static void showToast(final Context context, final String Msg){
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(context, Msg, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

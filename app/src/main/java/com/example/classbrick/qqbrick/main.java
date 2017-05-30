package com.example.classbrick.qqbrick;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import com.example.classbrick.qqbrick.utils.MyLog;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

/**
 * Created by classbrick on 2017/5/30.
 */

public class main implements IXposedHookLoadPackage {
    private static final String TAG = "QQBrick.main";

    private static final String QQ_PACKAGE_NAME = "com.tencent.mobileqq";

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) throws Throwable {
        final Class<?> clazz = XposedHelpers.findClass("android.app.Instrumentation", null);
        XposedHelpers.findAndHookMethod(clazz, "callApplicationOnCreate", Application.class
                , new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
            }

            @Override
            protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                super.afterHookedMethod(param);
                Context context = null;
                if(param.args[0] instanceof Application){
                    context = ((Application) param.args[0]).getApplicationContext();
                } else {
                    MyLog.i(TAG, "hook callApplicationOnCreate failed");
                    return;
                }
                Toast.makeText(context, context.getPackageName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

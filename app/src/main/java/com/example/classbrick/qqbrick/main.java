package com.example.classbrick.qqbrick;

import android.util.Log;

import com.example.classbrick.qqbrick.utils.MyLog;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

/**
 * Created by classbrick on 2017/5/30.
 */

public class main implements IXposedHookLoadPackage {
    private static final String TAG = "main";

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) throws Throwable {
        if(loadPackageParam.packageName.equals("com.tencent.mm")){
            MyLog.showToast("打开QQ");
        }
    }
}

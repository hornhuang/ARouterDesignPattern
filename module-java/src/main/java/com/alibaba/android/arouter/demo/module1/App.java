package com.alibaba.android.arouter.demo.module1;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author fishinwater-1999
 * @version 2019-12-25
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.init(this);
    }
}

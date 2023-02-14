package com.example.vhs;

import android.app.Application;

import com.example.vhs.utils.task.MainInitTask;
import com.xuexiang.xtask.XTask;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        XTask.debug(MyApp.isDebug());
        XTask.getTaskChain()
                .addTask(new MainInitTask(this))
                .start();
    }

    public static boolean isDebug() {
        return BuildConfig.DEBUG;
    }
}

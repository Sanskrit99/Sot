package com.example.vhs.utils.task;

import android.app.Application;

import com.example.vhs.utils.sdkinit.XBasicLibInit;
import com.xuexiang.xtask.api.step.SimpleTaskStep;

public class MainInitTask extends SimpleTaskStep {

    private Application mApplication;

    public MainInitTask(Application application) {
        mApplication = application;
    }

    @Override
    public void doTask() throws Exception {
        XBasicLibInit.init(mApplication);
    }
}

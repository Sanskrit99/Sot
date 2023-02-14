package com.example.vhs.activity;
import com.xuexiang.xui.widget.activity.BaseSplashActivity;
import com.xuexiang.xutil.app.ActivityUtils;

public class SplashActivity extends BaseSplashActivity {
    @Override
    protected void onCreateActivity() {
//        ActivityUtils.startActivity(LoginActivity.class);
        ActivityUtils.startActivity(MainActivity.class);
    }

    @Override
    protected void onSplashFinished() {

    }
}

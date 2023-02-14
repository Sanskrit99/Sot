package com.example.vhs.utils.sdkinit;

import android.app.Application;
import android.content.Context;

import com.example.vhs.base.BaseActivity;
import com.xuexiang.xaop.XAOP;
import com.xuexiang.xhttp2.XHttpSDK;
import com.xuexiang.xpage.PageConfig;
import com.xuexiang.xpage.PageConfiguration;
import com.xuexiang.xpage.config.AppPageConfig;
import com.xuexiang.xpage.model.PageInfo;

import java.util.List;

public class XBasicLibInit {
    public static void init(Application application) {
//        initUtils(application);
        initPage(application);
        initAOP(application);
        initRouter(application);
//        initDB(application);
        initHttp(application);
    }

    private static void initRouter(Application application) {
//        XRouter.init(application);
    }

    private static void initAOP(Application application) {
        XAOP.init(application);
    }

    private static void initHttp(Application application) {
        XHttpSDK.init(application);
        XHttpSDK.setBaseUrl("http://192.168.31.123:8886");
    }

    private static void initPage(Application application) {
        PageConfig.getInstance()
                .setPageConfiguration(new PageConfiguration() {
                    @Override
                    public List<PageInfo> registerPages(Context context) {
                        return AppPageConfig.getInstance().getPages();
                    }
                })
                .setContainActivityClazz(BaseActivity.class)
                .init(application);
    }
}

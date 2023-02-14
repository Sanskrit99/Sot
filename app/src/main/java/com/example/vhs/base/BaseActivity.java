package com.example.vhs.base;

import android.os.Bundle;

import com.xuexiang.xpage.base.XPageActivity;
import com.xuexiang.xpage.base.XPageFragment;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public class BaseActivity extends XPageActivity {
    Unbinder mUnbinder;

    public <T extends XPageFragment> T switchPage(Class<T> clazz) {

        return changePage(clazz);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mUnbinder = ButterKnife.bind(this);
    }
}

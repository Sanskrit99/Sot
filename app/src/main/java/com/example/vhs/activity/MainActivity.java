package com.example.vhs.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.vhs.R;
import com.example.vhs.base.BaseActivity;
import com.example.vhs.fragment.ComponentsFragment;
import com.example.vhs.fragment.components.cmd.CmFragment;
import com.example.vhs.fragment.expands.ExFragment;
import com.google.android.material.tabs.TabLayout;
import com.xuexiang.xui.utils.WidgetUtils;


public class MainActivity extends BaseActivity {
    TabLayout tabsc;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switchPage(ComponentsFragment.class);
        tabsc = findViewById(R.id.tabscccc);
        WidgetUtils.clearActivityBackground(this);
        WidgetUtils.addTabWithoutRipple(tabsc,"aa",true? R.drawable.ic_launcher_background : com.xuexiang.xui.R.drawable.ic_clock_black_24dp);
        WidgetUtils.addTabWithoutRipple(tabsc,"bb",false? R.drawable.ic_launcher_background : com.xuexiang.xui.R.drawable.ic_clock_black_24dp);
        WidgetUtils.addTabWithoutRipple(tabsc,"cc",false? R.drawable.ic_launcher_background : com.xuexiang.xui.R.drawable.ic_clock_black_24dp);
        WidgetUtils.setTabLayoutTextFont(tabsc);

    }
}

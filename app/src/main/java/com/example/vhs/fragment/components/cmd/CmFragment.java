package com.example.vhs.fragment.components.cmd;

import com.example.vhs.DemoDataProvider;
import com.example.vhs.R;
import com.example.vhs.adapter.SimpleR;
import com.example.vhs.base.BaseFragment;
import com.github.mikephil.charting.stockChart.OneDayChart;
import com.github.mikephil.charting.stockChart.dataManage.TimeDataManage;
import com.xuexiang.xpage.annotation.Page;
import com.xuexiang.xui.widget.banner.recycler.BannerLayout;

import org.json.JSONException;
import org.json.JSONObject;

@Page(name = "cm")
public class CmFragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_cm;
    }


    @Override
    protected void initViews() {

    }

    @Override
    protected void initListeners() {

    }
}

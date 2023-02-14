package com.example.vhs.fragment.components;

import android.view.View;
import android.widget.Button;

import com.example.vhs.R;
import com.example.vhs.base.BaseFragment;
import com.example.vhs.widget.LineWidget;
import com.xuexiang.xpage.annotation.Page;

import butterknife.BindView;
import butterknife.OnClick;

@Page(name = "yd",params = {"阅读"})
public class YdFragmnet extends BaseFragment {

    @BindView(R.id.fkak)
    Button fkak;
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_yd;
    }

    @Override
    protected void initViews() {
        System.out.println("AFAFFAAF");
    }

    @Override
    protected void initListeners() {

    }
    @OnClick({R.id.fkak})
    void OnClick(View v){
        switch (v.getId()){
            case R.id.fkak:
                System.out.println("AFAFAFAF");
                break;
        }
    }
}

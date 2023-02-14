package com.example.vhs.fragment;

import android.os.Bundle;
import android.view.View;

import com.example.vhs.base.BaseHomeFragment;
import com.example.vhs.fragment.components.YdFragmnet;
import com.example.vhs.fragment.components.cmd.CmFragment;
import com.xuexiang.xpage.annotation.Page;
import com.xuexiang.xpage.config.AppPageConfig;
import com.xuexiang.xpage.enums.CoreAnim;
import com.xuexiang.xpage.model.PageInfo;

import java.util.List;

@Page(name = "zy", anim = CoreAnim.none)
public class ComponentsFragment extends BaseHomeFragment {
    @Override
    protected List<PageInfo> getPageContents() {
        return AppPageConfig.getInstance().getComponents();
    }

    @Override
    protected void onTest() {
        openNewPage(YdFragmnet.class);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("BBBB");
    }

}

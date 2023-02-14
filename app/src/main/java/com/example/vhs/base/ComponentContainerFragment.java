package com.example.vhs.base;

import com.xuexiang.xpage.base.XPageContainerListFragment;

public abstract class ComponentContainerFragment extends XPageContainerListFragment {
    @Override
    protected void initPage() {
       initViews();
       initListeners();

    }

    @Override
    protected void initViews() {
        super.initViews();
    }

    @Override
    protected void initListeners() {
        super.initListeners();
    }
}

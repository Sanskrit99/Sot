package com.example.vhs.fragment.other;

import com.example.vhs.R;
import com.example.vhs.base.BaseFragment;
import com.xuexiang.xpage.annotation.Page;
import com.xuexiang.xpage.enums.CoreAnim;
import com.xuexiang.xpage.utils.TitleBar;


@Page(anim = CoreAnim.none)
public class LoginFragment extends BaseFragment {

    @Override
    protected TitleBar initTitleBar() {
        return null;
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_login;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void initListeners() {

    }
}

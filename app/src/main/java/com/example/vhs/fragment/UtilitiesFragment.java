package com.example.vhs.fragment;

import com.example.vhs.base.BaseHomeFragment;
import com.xuexiang.xpage.annotation.Page;
import com.xuexiang.xpage.config.AppPageConfig;
import com.xuexiang.xpage.enums.CoreAnim;
import com.xuexiang.xpage.model.PageInfo;

import java.util.List;
@Page( name = "ut",anim = CoreAnim.none)
public class UtilitiesFragment extends BaseHomeFragment {

    @Override
    protected List<PageInfo> getPageContents() {
        return AppPageConfig.getInstance().getUtils();
    }

    @Override
    protected void onTest() {

    }
}

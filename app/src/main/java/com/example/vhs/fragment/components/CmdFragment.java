package com.example.vhs.fragment.components;

import com.example.vhs.R;
import com.example.vhs.base.BaseFragment;
import com.example.vhs.base.ComponentContainerFragment;
import com.example.vhs.fragment.components.cmd.CmFragment;
import com.xuexiang.xpage.annotation.Page;
import com.xuexiang.xpage.enums.CoreAnim;

@Page(name = "cmd", anim = CoreAnim.none, extra = R.drawable.ic_launcher_background)
public class CmdFragment extends ComponentContainerFragment {

    @Override
    protected Class[] getPagesClasses() {
        return new Class[]{
                CmFragment.class
        };
    }
}

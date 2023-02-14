package com.example.vhs.base;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vhs.R;
import com.example.vhs.adapter.WidgetItemAdapter;
import com.example.vhs.widget.ApWidget;
import com.xuexiang.xpage.model.PageInfo;
import com.xuexiang.xpage.utils.TitleBar;
import com.xuexiang.xui.adapter.recyclerview.RecyclerViewHolder;
import com.xuexiang.xui.widget.imageview.ImageLoader;
import com.xuexiang.xui.widget.imageview.strategy.DiskCacheStrategyEnum;

import java.util.List;

public abstract class BaseHomeFragment extends BaseFragment implements RecyclerViewHolder.OnItemClickListener<PageInfo> {
    @Override
    protected TitleBar initTitleBar() {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_basehome;
    }

    RecyclerView rsdd;
    ApWidget iv_item;
    private ColorDrawable mColorDrawable;
    private boolean mEnableCache = false;

    @Override
    protected void initViews() {
        List<PageInfo> pageInfos = getPageContents();
        System.out.println("AAAA");
//        iv_item = findViewById(R.id.iv_item);
//        mColorDrawable = new ColorDrawable(Color.parseColor("#555555"));
//        String imgUrl = "http://192.168.31.123:8886/img/i0";
//        if (!TextUtils.isEmpty(imgUrl)) {
//            ImageLoader.get().loadImage(iv_item, imgUrl, mColorDrawable,
//                    mEnableCache ? DiskCacheStrategyEnum.RESOURCE : DiskCacheStrategyEnum.NONE);
//        } else {
//            iv_item.setImageDrawable(mColorDrawable);
//        }
//        iv_item.post(new Runnable() {
//            @Override
//            public void run() {
////                Canvas cv = new Canvas();
//                int dw = iv_item.getDrawable().getBounds().width();
//                int dh = iv_item.getDrawable().getBounds().height();
//                System.out.println(dw);
//                System.out.println(dh);
//
//            }
//        });

//        System.out.println(iv_item.getHeight());
//        System.out.println(iv_item.getImageMatrix());
        onTest();
    }

    @Override
    protected void initListeners() {


    }

    protected abstract List<PageInfo> getPageContents();

    protected abstract void onTest();

    @Override
    public void onItemClick(View itemView, PageInfo item, int position) {

    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        ViewGroup root = (ViewGroup) getRootView();
        if (root.getChildAt(0) instanceof TitleBar) {
            root.removeViewAt(0);
        }
    }
}

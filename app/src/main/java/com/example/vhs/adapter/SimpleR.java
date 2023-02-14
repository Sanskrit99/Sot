package com.example.vhs.adapter;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import com.example.vhs.R;
import com.xuexiang.xui.adapter.recyclerview.BaseRecyclerAdapter;
import com.xuexiang.xui.adapter.recyclerview.RecyclerViewHolder;
import com.xuexiang.xui.widget.imageview.ImageLoader;
import com.xuexiang.xui.widget.imageview.strategy.DiskCacheStrategyEnum;

import java.util.Arrays;

public class SimpleR extends BaseRecyclerAdapter<String> {

    private ColorDrawable mColorDrawable;
    private boolean mEnableCache = true;

    public SimpleR(String[] list) {
        super(Arrays.asList(list));
        mColorDrawable = new ColorDrawable(Color.parseColor("#555555"));
    }

    @Override
    protected int getItemLayoutId(int viewType) {
        return R.layout.item_banner;
    }

    @Override
    protected void bindData(@NonNull RecyclerViewHolder holder, int position, String imgUrl) {
        ImageView imageView = holder.findViewById(R.id.iv_item);
        if (!TextUtils.isEmpty(imgUrl)) {
            ImageLoader.get().loadImage(imageView, imgUrl, mColorDrawable,
                    mEnableCache ? DiskCacheStrategyEnum.RESOURCE : DiskCacheStrategyEnum.NONE);
        } else {
            imageView.setImageDrawable(mColorDrawable);
        }
    }
}

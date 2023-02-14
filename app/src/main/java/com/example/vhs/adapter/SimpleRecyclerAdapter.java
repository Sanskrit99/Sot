package com.example.vhs.adapter;

import androidx.annotation.NonNull;

import com.xuexiang.xui.adapter.recyclerview.BaseRecyclerAdapter;
import com.xuexiang.xui.adapter.recyclerview.RecyclerViewHolder;

public class SimpleRecyclerAdapter extends BaseRecyclerAdapter<String> {

    @Override
    protected int getItemLayoutId(int viewType) {
        return 0;
    }

    @Override
    protected void bindData(@NonNull RecyclerViewHolder holder, int position, String item) {

    }
}

package com.example.vhs.adapter;


import androidx.annotation.NonNull;

import com.example.vhs.R;
import com.xuexiang.xpage.model.PageInfo;
import com.xuexiang.xui.adapter.recyclerview.BaseRecyclerAdapter;
import com.xuexiang.xui.adapter.recyclerview.RecyclerViewHolder;

import java.util.List;

public class WidgetItemAdapter extends BaseRecyclerAdapter<PageInfo> {

    public WidgetItemAdapter(List<PageInfo> list) {
        super(list);
    }

    @Override
    protected int getItemLayoutId(int viewType) {
        return R.layout.item_widget;
    }

    @Override
    protected void bindData(@NonNull RecyclerViewHolder holder, int position, PageInfo item) {
        System.out.println(item.getName());
        holder.text(R.id.skdd, "ff");
    }
}

package com.example.vhs.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.xuexiang.xui.widget.flowlayout.BaseTagAdapter;

public class FlowTagAdapter extends BaseTagAdapter<String, TextView> {
    public FlowTagAdapter(Context context) {
        super(context);
    }

    @Override
    protected TextView newViewHolder(View convertView) {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return 0;
    }

    @Override
    protected void convert(TextView holder, String item, int position) {

    }
}

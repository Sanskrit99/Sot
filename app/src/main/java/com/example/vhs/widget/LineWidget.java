package com.example.vhs.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class LineWidget extends LinearLayout {
    public LineWidget(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        System.out.println("C");

    }

    public LineWidget(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        System.out.println("D");

    }

    public LineWidget(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        EditText e = new EditText(context);
        this.addView(e);

    }

    public LineWidget(Context context) {
        super(context);
        System.out.println("B");
    }
}

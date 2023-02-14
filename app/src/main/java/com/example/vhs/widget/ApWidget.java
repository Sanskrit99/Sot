package com.example.vhs.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.WindowInsetsAnimation;

import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

import com.example.vhs.R;


public class ApWidget extends AppCompatImageView {
    public ApWidget(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    boolean k = true;

    public ApWidget(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ApWidget(Context context) {
        super(context);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ApWidget ap = this;
        if (k) {
            k = false;
        } else {
            this.post(new Runnable() {
                @Override
                public void run() {
                    int x = 120;
                    int y = 900;
                    int w = 266;
                    int h = 1177;
                    Rect rc = ap.getDrawable().getBounds();
                    int bw = rc.width();
                    int bh = rc.height();
//                    int aw = ap.getWidth();
                    int aw = 846;
                    int ah = ap.getHeight();
                    canvas.clipRect(x,y,w,h);
                    canvas.drawColor(Color.RED);
                    System.out.println(bw);
                    System.out.println(bh);
                    System.out.println(aw);
                    System.out.println(ah);
//                    v(x,aw,bw);
//                    v(y,ah,bh);
//                    v(w,aw,bw);
//                    v(h,ah,bw);

                }
            });
        }


    }

    private float v(int x, int y, int z) {
        return x*y/z;
    }
}

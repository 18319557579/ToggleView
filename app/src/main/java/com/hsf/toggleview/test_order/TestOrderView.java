package com.hsf.toggleview.test_order;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

public class TestOrderView extends View {
    Paint paint = new Paint();

    public TestOrderView(Context context) {
        this(context, null);
    }

    public TestOrderView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TestOrderView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.d("Daisy", "TestOrderView onMeasure");
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Log.d("Daisy", "TestOrderView onLayout");
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        Log.d("Daisy", "TestOrderView onSizeChanged");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.d("Daisy", "TestOrderView onDraw");

        canvas.drawText("abcdefghijklnmopqrstuvwxyz", 400, 400, paint);
        Log.d("Daisy", paint.getFontMetricsInt().toString());
    }
}

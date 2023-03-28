package com.hsf.toggleview.test_constructor;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

import com.hsf.toggleview.R;

public class CustomGreenView extends TextView {
    String tag = "customGreen";

    public CustomGreenView(Context context) {
        super(context);
        Log.d(tag, "一个参数");
    }

    public CustomGreenView(Context context, AttributeSet attrs) {
        this(context,attrs,0);
        Log.d(tag, "两个参数");
    }

    public CustomGreenView(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, R.style.GreenTextStyle);
        Log.d(tag, "三个参数");
    }

    public CustomGreenView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr,defStyleRes);
        Log.d(tag, "四个参数");
    }

}

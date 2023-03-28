package com.hsf.toggleview.test_constructor;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomBlankView extends TextView {
    String tag = "customGreen";

    public CustomBlankView(Context context) {
        super(context);
    }

    public CustomBlankView(Context context, AttributeSet attrs) {
        this(context,attrs,0);

    }

    public CustomBlankView(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr,0);
    }

    public CustomBlankView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr,defStyleRes);
    }

}
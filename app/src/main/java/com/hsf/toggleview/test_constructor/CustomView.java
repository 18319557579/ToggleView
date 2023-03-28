package com.hsf.toggleview.test_constructor;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

import com.hsf.toggleview.R;

@SuppressLint("AppCompatCustomView")
public class CustomView extends TextView {
    String tag = "customView";

    public CustomView(Context context) {
        super(context);
        Log.d(tag,"First Constructor");
    }

    public CustomView(Context context, AttributeSet attrs) {
        this(context,attrs, android.R.attr.textViewStyle);
//        this(context,attrs, android.R.attr.textViewStyle);
        Log.d(tag,"Second Constructor");


        for(int i=0;i<attrs.getAttributeCount();i++){
            Log.d(tag, attrs.getAttributeName(i)+"   :   "+attrs.getAttributeValue(i));
        }

    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr,0);
        Log.d(tag,"Third Constructor");
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr,defStyleRes);
        Log.d(tag,"Fourth Constructor");
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    }
}
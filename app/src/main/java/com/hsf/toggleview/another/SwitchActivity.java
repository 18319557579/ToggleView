package com.hsf.toggleview.another;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.hsf.toggleview.R;

public class SwitchActivity extends AppCompatActivity {

    SwitchButton switchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        switchButton = findViewById(R.id.switchButton);
        switchButton.setToggleOff(true);
    }
}
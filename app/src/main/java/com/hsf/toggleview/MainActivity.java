package com.hsf.toggleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hsf.toggleview.another.SwitchActivity;
import com.hsf.toggleview.another.SwitchButton;
import com.hsf.toggleview.test_constructor.TestConstructorActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_skip)
    Button btnSkip;

    @BindView(R.id.btn_test_priority)
    Button btnTestPriority;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
//        btnSkip = findViewById(R.id.btn_skip);

        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SwitchActivity.class);
                startActivity(intent);
            }
        });

        btnTestPriority.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TestConstructorActivity.class);
                startActivity(intent);
            }
        });
    }
}
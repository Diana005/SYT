package com.example.syt.Second;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.syt.Activity.Courses;
import com.example.syt.R;


public class DoDifficultWorkWhen extends Activity {
    private Button buttonc2;
    private Button button2c2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_difficult_work_when);
        buttonc2 = findViewById(R.id.buttonc2);
        button2c2 = findViewById(R.id.button2c2);
        buttonc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(DoDifficultWorkWhen.this, Courses.class);
                startActivity(p);
            }
        });
        button2c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(DoDifficultWorkWhen.this, Exam2.class);
                startActivity(p);


            }
        });
    }}

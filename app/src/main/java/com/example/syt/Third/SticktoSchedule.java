package com.example.syt.Third;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.syt.Courses;
import com.example.syt.R;

public class SticktoSchedule extends Activity {
    private Button buttonc3;
    private Button button2c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stickto_schedule);
        buttonc3 = findViewById(R.id.buttonc3);
        button2c3 = findViewById(R.id.button2c3);
        buttonc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(SticktoSchedule.this, Courses.class);
                startActivity(p);
            }
        });
        button2c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(SticktoSchedule.this, Exam3.class);
                startActivity(p);


            }
        });
    }}


package com.example.syt.Fourth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.syt.Courses;
import com.example.syt.R;

public class GoalSetting extends AppCompatActivity {
    private Button buttonc4;
    private Button button2c4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal_setting);
        buttonc4 = findViewById(R.id.buttonc4);
        button2c4 = findViewById(R.id.button2c4);
        buttonc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(GoalSetting.this, Courses.class);
                startActivity(p);
            }
        });
        button2c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(GoalSetting.this, Exam4.class);
                startActivity(p);


            }
        });
    }
}
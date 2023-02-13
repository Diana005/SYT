package com.example.syt.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.syt.Fifth.ConcentrationandFocus;
import com.example.syt.First.UnderstandtheDifferenceBetweenUrgentandImportant;
import com.example.syt.Fourth.GoalSetting;
import com.example.syt.R;
import com.example.syt.Second.DoDifficultWorkWhen;
import com.example.syt.Third.SticktoSchedule;

public class Courses extends AppCompatActivity {
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menue1);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Courses.this, UnderstandtheDifferenceBetweenUrgentandImportant.class);
                startActivity(p);


            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Courses.this, DoDifficultWorkWhen.class);
                startActivity(p);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Courses.this, SticktoSchedule.class);
                startActivity(p);


            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Courses.this, GoalSetting.class);
                startActivity(p);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Courses.this, ConcentrationandFocus.class);
                startActivity(p);
            }
        });
    }
}
package com.example.syt.First;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;

import com.example.syt.Courses;
import com.example.syt.R;


public class UnderstandtheDifferenceBetweenUrgentandImportant extends AppCompatActivity {
    private Button button;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_understandthe_difference_between_urgentand_important);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button.setOnClickListener(v -> {
            Intent p = new Intent(UnderstandtheDifferenceBetweenUrgentandImportant.this, Courses.class);
            startActivity(p);


        });
        button2.setOnClickListener(v -> {
            Intent p = new Intent(UnderstandtheDifferenceBetweenUrgentandImportant.this, Exam.class);
            startActivity(p);
        });
    }
}
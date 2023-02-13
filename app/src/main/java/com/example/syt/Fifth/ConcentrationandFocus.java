package com.example.syt.Fifth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.syt.Activity.Courses;
import com.example.syt.R;

public class ConcentrationandFocus extends AppCompatActivity {
    private Button buttonc5;
    private Button button2c5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concentrationand_focus);
        buttonc5 = findViewById(R.id.buttonc5);
        button2c5= findViewById(R.id.button2c5);
        buttonc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(ConcentrationandFocus.this, Courses.class);
                startActivity(p);
            }
        });
        button2c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(ConcentrationandFocus.this, Exam5.class);
                startActivity(p);


            }
        });

    }
}
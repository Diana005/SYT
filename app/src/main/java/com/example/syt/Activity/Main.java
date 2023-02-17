package com.example.syt.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.syt.R;

public class Main extends AppCompatActivity {
    private Button start;
    private Button introduction;
    private Button newLessons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=findViewById(R.id.start);
        introduction=findViewById(R.id.introduction);
        newLessons = findViewById(R.id.newLessons);
        introduction.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent p = new Intent(Main.this, Introduction.class);
                  startActivity(p);
              }
        });
        start.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent p = new Intent(Main.this, Start.class);
                  startActivity(p);
              }
        });
        newLessons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Main.this, Start.class);
                startActivity(p);
            }
        });
    }
}
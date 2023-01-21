package com.example.syt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button start;
    private Button introduction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=findViewById(R.id.start);
        introduction=findViewById(R.id.introduction);
      introduction.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent p = new Intent(MainActivity.this, Introduction.class);
              startActivity(p);


          }
      });
      start.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent p = new Intent(MainActivity.this, Menue0.class);
              startActivity(p);
          }
      });
    }
}
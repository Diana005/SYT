package com.example.syt.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.syt.R;

public class Start extends AppCompatActivity {
    private Button s;
    private Button i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manue0);
        s=findViewById(R.id.s);
        i=findViewById(R.id.i);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Start.this, Resources.class);
                startActivity(p);


            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Start.this, CoursesActivity.class);
                startActivity(p);
            }
        });
    }
}
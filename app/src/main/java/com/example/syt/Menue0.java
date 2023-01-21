package com.example.syt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menue0 extends AppCompatActivity {
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
                Intent p = new Intent(Menue0.this, Menue2.class);
                startActivity(p);


            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Menue0.this, Menue1.class);
                startActivity(p);
            }
        });
    }
}
package com.example.syt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.syt.Fifth.ConcentrationandFocus;
import com.example.syt.First.UnderstandtheDifferenceBetweenUrgentandImportant;
import com.example.syt.Fourth.GoalSetting;
import com.example.syt.Second.DoDifficultWorkWhen;
import com.example.syt.Third.SticktoSchedule;

public class Menue1 extends AppCompatActivity {
     ImageView firstmenue;
    ImageView secondmenue;
    ImageView thirdmenue;
    ImageView fourthmenue;
    ImageView fifthmenue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);
        firstmenue=findViewById(R.id.firstmenue);
        secondmenue=findViewById(R.id.secondmenue);
        thirdmenue=findViewById(R.id.thirdmenue);
        fourthmenue=findViewById(R.id.fourthmenue);
        fifthmenue=findViewById(R.id.fifthmenue);
        firstmenue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Menue1.this, UnderstandtheDifferenceBetweenUrgentandImportant.class);
                startActivity(p);


            }
        });
        secondmenue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Menue1.this, DoDifficultWorkWhen.class);
                startActivity(p);
            }
        });
        thirdmenue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Menue1.this, SticktoSchedule.class);
                startActivity(p);


            }
        });
        fourthmenue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Menue1.this, GoalSetting.class);
                startActivity(p);
            }
        });
        fifthmenue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Menue1.this, ConcentrationandFocus.class);
                startActivity(p);
            }
        });
    }
}
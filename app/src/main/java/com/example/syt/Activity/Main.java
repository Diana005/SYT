package com.example.syt.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.syt.Class.CourseClass;
import com.example.syt.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main extends AppCompatActivity {
    private Button s,i;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s=findViewById(R.id.s);

        i=findViewById(R.id.i);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Main.this, Resources.class);
                startActivity(p);
            }
        });

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Main.this, CoursesActivity.class);
                startActivity(p);
            }
        });


        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Lessons");
        DatabaseReference r1 = reference.child("Das1");
        r1.setValue(new CourseClass("Das1","Lorem1","https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/C_n%2Ffirstmenue.jpg?alt=media&token=2d66e73d-07c8-4e7c-b8bf-35585f010562"));
        DatabaseReference r2 = reference.child("Das2");
        r2.setValue(new CourseClass("Das2","Lorem2","https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/C_n%2Fsecondmenue.jpg?alt=media&token=c66483f6-e5e0-4cc8-8cb2-234a681c89f7"));
        DatabaseReference r3 = reference.child("Das3");
        r3.setValue(new CourseClass("Das3","Lorem3","https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/C_n%2Fsecondmenue.jpg?alt=media&token=c66483f6-e5e0-4cc8-8cb2-234a681c89f7"));
        DatabaseReference r4 = reference.child("Das4");
        r4.setValue(new CourseClass("Das4","Lorem4","https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/C_n%2Fsecondmenue.jpg?alt=media&token=c66483f6-e5e0-4cc8-8cb2-234a681c89f7"));
        DatabaseReference r5 = reference.child("Das5");
        r5.setValue(new CourseClass("Das5","Lorem5","https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/C_n%2Fsecondmenue.jpg?alt=media&token=c66483f6-e5e0-4cc8-8cb2-234a681c89f7"));




    }
}
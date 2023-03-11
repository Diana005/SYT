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
        s=findViewById(R.id.rectangle_32);

        i=findViewById(R.id.rectangle_33);
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
        r1.setValue(new CourseClass("Understand the Difference Between Urgent and Important","Lorem1","https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/courses02%2Femail_removebg_preview_21.PNG?alt=media&token=ae216ef8-a5ef-421a-99a0-f82d74c2e809"));
        DatabaseReference r2 = reference.child("Das2");
        r2.setValue(new CourseClass("Do Difficult Work When You Know You’re Most Productive","Lorem2","https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/courses02%2Fdistributed_removebg_preview__1__21.PNG?alt=media&token=088ac19f-e719-4cc8-bdda-8c7f6b12130chttps://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/courses02%2Fdistributed_removebg_preview__1__21.PNG?alt=media&token=088ac19f-e719-4cc8-bdda-8c7f6b12130c"));
        DatabaseReference r3 = reference.child("Das3");
        r3.setValue(new CourseClass("Stick to a Schedule and Don’t Miss Deadlines","Lorem3","https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/courses02%2Fdeadline_removebg_preview_2.PNG?alt=media&token=785f2790-6a29-41ee-8640-f16e2f2dc4db"));
        DatabaseReference r4 = reference.child("Das4");
        r4.setValue(new CourseClass("Goal setting","Lorem4","https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/courses02%2Fgoal_removebg_preview_2.PNG?alt=media&token=9c7d01a7-18b0-4166-a281-00e4d48fe472"));
        DatabaseReference r5 = reference.child("Das5");
        r5.setValue(new CourseClass("Concentration and focus","Lorem5","https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/courses02%2Fconcentration_removebg_preview_2.PNG?alt=media&token=afa3af0d-cef0-45b5-a49a-98bcc28844bb"));




    }
}
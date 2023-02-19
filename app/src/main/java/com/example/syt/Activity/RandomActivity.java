package com.example.syt.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.syt.Class.CourseClass;
import com.example.syt.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RandomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Lessons");
        DatabaseReference r1 = reference.child("Das1");
        r1.setValue(new CourseClass("Das1","Lorem1","https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/C_n%2Ffirstmenue.jpg?alt=media&token=2d66e73d-07c8-4e7c-b8bf-35585f010562"));
        DatabaseReference r2 = reference.child("Das2");
        r2.setValue(new CourseClass("Das2","Lorem2","https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/C_n%2Fsecondmenue.jpg?alt=media&token=c66483f6-e5e0-4cc8-8cb2-234a681c89f7"));

    }

}

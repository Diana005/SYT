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
        r1.setValue(new CourseClass("Das1","Lorem1","https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Courses%2Fc10.jpg?alt=media&token=1372510f-6918-4a41-af1d-28ba09cc62ce"));
        DatabaseReference r2 = reference.child("Das2");
        r2.setValue(new CourseClass("Das2","Lorem2","https://firebasestorage.googleapis.com/v0/b/syt0-cfc56.appspot.com/o/Courses%2Fc20.jpg?alt=media&token=3f9bac0a-6a4a-4340-8e94-0e5616c2ef8d"));

    }

}

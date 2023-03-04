package com.example.syt.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.syt.R;

public class ReadCourseActivity extends AppCompatActivity {


    private TextView name,lesson;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_course);
        name = findViewById(R.id.name);
        button= findViewById(R.id.button2);
        lesson = findViewById(R.id.lessonText);



        Intent intent = getIntent();
        if(intent!=null){
            name.setText(intent.getStringExtra("courseName"));
            lesson.setText(intent.getStringExtra("courseText"));
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent p = new Intent(ReadCourseActivity.this, Exam.class);
                    p.putExtra("courseName",intent.getStringExtra("courseName"));
                    startActivity(p);

                }
            });

        }

    }


}

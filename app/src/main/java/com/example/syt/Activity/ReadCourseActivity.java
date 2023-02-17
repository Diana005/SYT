package com.example.syt.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.syt.R;

public class ReadCourseActivity extends AppCompatActivity {


        private TextView name,lesson;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_read_course);
            name = findViewById(R.id.name);
            lesson = findViewById(R.id.lessonText);
            init();
        }
        public void init(){
            Intent intent = getIntent();
            if(intent!=null){
                name.setText(intent.getStringExtra("courseName"));
                lesson.setText(intent.getStringExtra("courseText"));
            }

        }


    }

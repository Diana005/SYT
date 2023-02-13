package com.example.syt.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.syt.Class.CourseClass;
import com.example.syt.R;

import java.util.ArrayList;

public class CoursesActivity extends AppCompatActivity {
    private RecyclerView listView;
    private ViewAdapter viewAdapter;
    private ArrayList<CourseClass> listData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        init();
    }
    public void init(){
        listView = findViewById(R.id.recView);
        listData = new ArrayList<CourseClass>();
        viewAdapter = new ViewAdapter(this,listData);
        listView.setLayoutManager(new LinearLayoutManager(this));
        listView.setAdapter(viewAdapter);
    }
}
package com.example.syt.Activity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.syt.Class.CourseClass;
import com.example.syt.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class CoursesActivity extends AppCompatActivity {
    private RecyclerView listView;
    private ViewAdapter viewAdapter;
    private ArrayList<CourseClass> listData;
    private DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        init();
        getDataFromDataBase();
    }
    public void init(){


        listView = findViewById(R.id.recView);
        listData = new ArrayList<CourseClass>();
        viewAdapter = new ViewAdapter(this,listData);
        listView.setLayoutManager(new LinearLayoutManager(this));
        listView.setAdapter(viewAdapter);
        reference = FirebaseDatabase.getInstance().getReference("Lessons");
    }
    private void getDataFromDataBase(){

        ValueEventListener eventListener = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(listData.size() > 0){
                    listData.clear();
                }
                for(DataSnapshot ds : snapshot.getChildren()){
                    CourseClass messenger = ds.getValue(CourseClass.class);
                    assert  messenger != null;
                    listData.add(messenger);
                }
                listView.setAdapter(viewAdapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        };
        reference.addValueEventListener(eventListener);

    }
}


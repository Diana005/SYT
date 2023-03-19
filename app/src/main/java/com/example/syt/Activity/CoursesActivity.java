package com.example.syt.Activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.syt.Activity.LoadingScreenFragment;
import com.example.syt.Activity.ViewAdapter;
import com.example.syt.Class.CourseClass;
import com.example.syt.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class CoursesActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    private RecyclerView listView;
    private ViewAdapter viewAdapter;
    private ArrayList<CourseClass> listData;
    private DatabaseReference reference;
    private LoadingScreenFragment loadingScreenFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        // Replace the existing content with the loading screen fragment
        loadingScreenFragment = new LoadingScreenFragment();
        fragmentTransaction.replace(android.R.id.content, loadingScreenFragment);
        fragmentTransaction.commit();

        init();
        getDataFromDataBase();
    }

    private void init() {
        listView = findViewById(R.id.recView);
        listData = new ArrayList<CourseClass>();
        viewAdapter = new ViewAdapter(this, listData);
        listView.setLayoutManager(new LinearLayoutManager(this));
        listView.setAdapter(viewAdapter);
        reference = FirebaseDatabase.getInstance().getReference("Lessons");
    }

    private void getDataFromDataBase() {
        ValueEventListener eventListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                if (listData.size() > 0) {
                    listData.clear();
                }
                for (DataSnapshot ds : snapshot.getChildren()) {
                    CourseClass messenger = ds.getValue(CourseClass.class);
                    if (messenger != null) {
                        listData.add(messenger);
                    }
                }
                viewAdapter.notifyDataSetChanged();
                stopLoading();
            }

            @Override
            public void onCancelled(DatabaseError error) {
                stopLoading();
            }
        };
        reference.addValueEventListener(eventListener);
    }

    private void stopLoading() {
        // Remove the loading screen fragment
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.remove(loadingScreenFragment);
        fragmentTransaction.commit();
    }
}

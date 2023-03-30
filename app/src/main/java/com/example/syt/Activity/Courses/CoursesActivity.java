package com.example.syt.Activity.Courses;

import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.syt.Activity.LoadingScreenFragment;
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

    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();


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
                    CourseClass m = ds.getValue(CourseClass.class);
                    if (m!= null) {
                        listData.add(m);
                    }
                }
                viewAdapter.notifyDataSetChanged();
                mHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        stopLoading();
                    }
                }, 4000);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                stopLoading();
            }
        };
        reference.addValueEventListener(eventListener);
    }

    private void stopLoading() {

        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.remove(loadingScreenFragment);
        fragmentTransaction.commit();
    }
}

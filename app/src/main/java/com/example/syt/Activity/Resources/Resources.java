package com.example.syt.Activity.Resources;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import com.example.syt.Activity.Courses.ViewAdapter;
import com.example.syt.Activity.LoadingScreenFragment;
import com.example.syt.Class.CourseClass;
import com.example.syt.Class.ResourcesClass;
import com.example.syt.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Resources extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    private RecyclerView ListView;
    private ResAdapter viewAdapter;
    private ArrayList<ResourcesClass> ListData;
    private DatabaseReference reference_res;
    private LoadingScreenFragment loadingScreenFragment;

    private Handler mHandler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource);
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
        ListView = findViewById(R.id.recView_rec);
        ListData = new ArrayList<ResourcesClass>();
        viewAdapter = new ResAdapter(this, ListData);
        ListView.setLayoutManager(new LinearLayoutManager(this));
        ListView.setAdapter(viewAdapter);
        reference_res = FirebaseDatabase.getInstance().getReference("Resources");
    }
    private void getDataFromDataBase() {
        ValueEventListener eventListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                if (ListData.size() > 0) {
                    ListData.clear();
                }
                for (DataSnapshot d : snapshot.getChildren()) {
                    ResourcesClass messenger = d.getValue(ResourcesClass.class);
                    if (messenger != null) {
                        ListData.add(messenger);
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
        reference_res.addValueEventListener(eventListener);
    }

    private void stopLoading() {
        // Remove the loading screen fragment
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.remove(loadingScreenFragment);
        fragmentTransaction.commit();
    }

}
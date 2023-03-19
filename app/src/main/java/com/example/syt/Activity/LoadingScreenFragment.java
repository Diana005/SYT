package com.example.syt.Activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import androidx.fragment.app.Fragment;

import com.example.syt.R;

public class LoadingScreenFragment extends Fragment {
    private ProgressBar progressBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.loading, container, false);
        progressBar = view.findViewById(R.id.progressBar);
        return view;
    }

    public void stopLoading() {
        if (progressBar != null) {
            progressBar.setVisibility(View.GONE);
        }
    }
}


package com.example.syt.Activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.syt.Class.CourseClass;
import com.example.syt.R;
import java.util.ArrayList;

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.ViewHolder> {
    private LayoutInflater inflater;
    private ArrayList<CourseClass> courseClasses;
    public ViewAdapter(Context context, ArrayList<CourseClass> courseClasses) {
        this.courseClasses = courseClasses;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CourseClass courseClass = courseClasses.get(position);
        holder.imageView.setImageURI(Uri.parse(courseClass.getImageUrl()));
        holder.courseName.setText(courseClass.getCourseName());
    }

    @Override
    public int getItemCount() {
        return courseClasses.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView courseName;
        ImageView imageView;
        Button button;

        public ViewHolder(View view) {
            super(view);
            courseName = view.findViewById(R.id.textView);
            imageView = view.findViewById(R.id.imageView);
            button = view.findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //
                    Intent intent = new Intent(view.getContext(),Main.class);
                    intent.putExtra("courseName",courseName.getText().toString());
                    view.getContext().startActivity(intent);
                }
            });
        }

    }


    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }

}

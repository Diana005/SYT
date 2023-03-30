package com.example.syt.Activity.Resources;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.syt.Activity.Courses.ReadCourseActivity;
import com.example.syt.Class.CourseClass;
import com.example.syt.Class.ResourcesClass;
import com.example.syt.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ResAdapter extends RecyclerView.Adapter<com.example.syt.Activity.Resources.ResAdapter.ViewHolder> {
    private LayoutInflater inflater_res;
    private ArrayList<ResourcesClass> resourcesClasses;

    public ResAdapter(Context context, ArrayList<ResourcesClass> resourcesClasses) {
        this.resourcesClasses = resourcesClasses;
        this.inflater_res = LayoutInflater.from(context);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ResourcesClass resourcesClass = resourcesClasses.get(position);
        Picasso.get().load(resourcesClass.getImageUrl1()).into(holder.imageView1);
        Picasso.get().load(resourcesClass.getImageUrl2()).into(holder.imageView2);
        Picasso.get().load(resourcesClass.getImageUrl3()).into(holder.imageView3);
        Picasso.get().load(resourcesClass.getImageUrl4()).into(holder.imageView4);
        Picasso.get().load(resourcesClass.getImageUrl5()).into(holder.imageView5);
        Picasso.get().load(resourcesClass.getImageUrl6()).into(holder.imageView6);
        holder.title.setText(resourcesClass.getTitle());
        holder.url1 = resourcesClass.getUrl1();
        holder.url2=resourcesClass.getUrl2();
        holder.url3=resourcesClass.getUrl3();
        holder.url4=resourcesClass.getUrl4();
        holder.url5=resourcesClass.getUrl5();
        holder.url6=resourcesClass.getUrl6();
    }

    @Override
    public int getItemCount() {
        return resourcesClasses.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        String url1, url2, url3, url4, url5, url6;
        TextView title;
        ImageView imageView1, imageView2, imageView3, imageView4, imageView5, imageView6;
        Context context;

        public ViewHolder(View view, Context context) {
            super(view);
            this.context = context;
            title = view.findViewById(R.id.textView10);
            imageView1 = view.findViewById(R.id.book1);
            imageView2 = view.findViewById(R.id.book2);
            imageView3 = view.findViewById(R.id.book3);
            imageView4 = view.findViewById(R.id.book4);
            imageView5 = view.findViewById(R.id.book5);
            imageView6 = view.findViewById(R.id.book6);

            imageView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    goLink(url1);
                }
            });
            imageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    goLink(url2);
                }
            });
            imageView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    goLink(url3);
                }
            });
            imageView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    goLink(url4);
                }
            });
            imageView5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    goLink(url5);
                }
            });
            imageView6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    goLink(url6);
                }
            });
        }

        private void goLink(String s) {
            Uri uri = Uri.parse(s);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            context.startActivity(intent);
        }
    }


    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater_res.inflate(R.layout.list_item_rec, parent, false);
        return new ViewHolder(v, parent.getContext());
    }



}
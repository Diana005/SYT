package com.example.syt.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.syt.R;

public class Resources extends AppCompatActivity {
ImageView book1,book2,book3,book4,book5,book6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource);
        book1=findViewById(R.id.book1);
        book2=findViewById(R.id.book2);
        book3=findViewById(R.id.book3);
        book4=findViewById(R.id.book4);
        book5=findViewById(R.id.book5);
        book6=findViewById(R.id.book6);
        book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.amazon.co.uk/Time-Management-Book-Productivity-Effectivity-ebook/dp/B081Y5BYLX");
            }
        });
        book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.theexceptionalskills.com/best-time-management-books/");
            }
        });
        book3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.linkedin.com/pulse/19-effective-time-management-books-you-should-read-2018-carey-bentley/");
            }
        });
        book4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.theexceptionalskills.com/best-time-management-books/");
            }
        });
        book5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://fivebooks.com/best-books/time-management-oliver-burkeman/");
            }
        });
        book6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.amazon.in/Time-Management-Sudhir-Dixit/dp/938824110X");
            }
        });
    }

    private void goLink(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
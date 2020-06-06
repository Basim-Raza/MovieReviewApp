package com.example.basimraza.moviereviewapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private int[] moviePosters = {R.mipmap.m1,R.mipmap.m2,R.mipmap.m3,R.mipmap.m4,R.mipmap.m5,
                                R.mipmap.m6,R.mipmap.m7,R.mipmap.m8,R.mipmap.m9,R.mipmap.m10};
    private String[] movieTitles;
    private RecyclerAdapter adapter;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        movieTitles = getResources().getStringArray(R.array.title);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        adapter = new RecyclerAdapter(moviePosters, movieTitles, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}

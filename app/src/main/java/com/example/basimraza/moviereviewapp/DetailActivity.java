package com.example.basimraza.moviereviewapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

public class DetailActivity extends AppCompatActivity {

    private VideoView movieTrailer;
    private ImageView moviePoster;
    private TextView movieTitle, movieDate, movieDetail;
    private Intent i;
    private int position;
    private int[] posters = {R.mipmap.m1,R.mipmap.m2,R.mipmap.m3,R.mipmap.m4,R.mipmap.m5,
            R.mipmap.m6,R.mipmap.m7,R.mipmap.m8,R.mipmap.m9,R.mipmap.m10};
    private String[] titles, dates, detail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        movieTrailer = (VideoView) findViewById(R.id.movieTrailer);
        moviePoster = (ImageView) findViewById(R.id.moviePoster);
        movieTitle = (TextView) findViewById(R.id.movieTitle);
        movieDate = (TextView) findViewById(R.id.movieDate);
        movieDetail = (TextView) findViewById(R.id.movieDetail);

        titles = getResources().getStringArray(R.array.title);
        dates = getResources().getStringArray(R.array.date);
        detail = getResources().getStringArray(R.array.descript);

        i = getIntent();
        position = i.getIntExtra("KEY", 1);

        moviePoster.setImageResource(posters[position]);
        movieTitle.setText(titles[position]);
        movieDate.setText(dates[position]);
        movieDetail.setText(detail[position]);
    }
}

package com.example.basimraza.moviereviewapp;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>{

    private int[] moviePosters;
    private String[] movieTitles;
    private Context context;
    private View view;

    private int count = 0;

    public RecyclerAdapter(int[] moviePosters, String[] movieTitles, Context context) {
        this.moviePosters = moviePosters;
        this.movieTitles = movieTitles;
        this.context = context;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener{

        CardView cardView1, cardView2;
        Context context;
        ImageView movieImage1, movieImage2;
        TextView movieName1, movieName2;

        public MyViewHolder(View view, Context context) {
            super(view);
            this.context = context;
            cardView1 = view.findViewById(R.id.cardView1);
            cardView2 = view.findViewById(R.id.cardView2);

            movieImage1 = view.findViewById(R.id.movieImage1);
            movieImage2 = view.findViewById(R.id.movieImage2);

            movieName1 = view.findViewById(R.id.movieName1);
            movieName2 = view.findViewById(R.id.movieName2);

            cardView1.setOnClickListener(this);
            cardView2.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            int position = (int) view.getTag();
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("KEY",position);
            context.startActivity(intent);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view, context);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.cardView1.setTag(count);
        holder.movieImage1.setImageResource(moviePosters[count]);
        holder.movieName1.setText(movieTitles[count]);
        count++;

        holder.cardView2.setTag(count);
        holder.movieImage2.setImageResource(moviePosters[count]);
        holder.movieName2.setText(movieTitles[count]);

        count++;

//        holder.cardView1.setOnClickListener(this);
//        holder.cardView2.setOnClickListener(this);

    }

    @Override
    public int getItemCount() {

        return (movieTitles.length / 2);
    }

//    @Override
//    public void onClick(View view) {
//        int postion = (int) view.getTag();
//        Toast.makeText(context," " + postion,Toast.LENGTH_SHORT).show();
//    }
}
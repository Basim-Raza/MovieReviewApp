package com.example.basimraza.moviereviewapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button fbButton;
    private Button gmailButton;
    private Button createButton;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fbButton = (Button) findViewById(R.id.fbButton);
        gmailButton = (Button) findViewById(R.id.gmailButton);
        createButton = (Button) findViewById(R.id.createButton);

        fbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        gmailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afterClick();
            }
        });
    }
    private void afterClick(){
        intent = new Intent(MainActivity.this, CreateActivity.class);
        startActivity(intent);
    }
}

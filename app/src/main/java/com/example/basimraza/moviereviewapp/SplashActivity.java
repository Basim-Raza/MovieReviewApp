package com.example.basimraza.moviereviewapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_TIME = 5000;
    private Intent intent;
    private TextView splashText;
    private  Animation in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }, SPLASH_TIME);

        splashText = (TextView) findViewById(R.id.splashText);
        in = new AlphaAnimation(0.0f, 1.0f);
        in.setDuration(2000);
        splashText.startAnimation(in);

    }
}

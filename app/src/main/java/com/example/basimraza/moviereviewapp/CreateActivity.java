package com.example.basimraza.moviereviewapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CreateActivity extends AppCompatActivity {

    private TextView signIn;
    private EditText fname, lname, email, password;
    public  String nameFirst, nameLast, mailE, wordPass;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        fname = (EditText) findViewById(R.id.fname);
        lname = (EditText) findViewById(R.id.lname);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        signIn = (TextView) findViewById(R.id.signIn);

        nameFirst = fname.getText().toString();
        nameLast = lname.getText().toString();
        mailE = email.getText().toString();
        wordPass = password.getText().toString();

        if (nameFirst != null && nameLast != null && mailE != null && wordPass != null) {
            signIn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    intent = new Intent(CreateActivity.this, HomeActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
}

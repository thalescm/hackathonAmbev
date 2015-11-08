package com.ambev.hackambev;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        AsyncTask.execute(new Runnable() {
            @Override
            public void run () {

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {

                }
                Intent intent = new Intent(SplashActivity.this, MoodActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

}

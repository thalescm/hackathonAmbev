package com.ambev.hackambev;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;

public class LoadingActivity extends Activity {

    private ImageView mLoadingBeer;
    private int mCount = 0;
    private static final int mBeerAnim[] = {R.drawable.beer_loading_1, R.drawable.beer_loading_2, R.drawable.beer_loading_3, R.drawable.beer_loading_4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        mLoadingBeer = (ImageView) findViewById(R.id.loading_beer);


        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                while (mCount < 30 && !isFinishing()) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            mLoadingBeer.setImageResource(mBeerAnim[mCount % mBeerAnim.length]);
                            mLoadingBeer.invalidate();
                        }
                    });

                    mCount++;
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {

                    }
                }
                if (!isFinishing()) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}

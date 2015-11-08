package com.ambev.hackambev;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;

public class LoadingActivity extends Activity {

    private ImageView mLoadingBeer;
    private int mCount = 0;
    private static final int mBeerAnim[] = {
            R.drawable.drink08,
            R.drawable.drink09,
            R.drawable.drink10,
            R.drawable.drink11,
            R.drawable.drink12,
            R.drawable.drink13,
            R.drawable.drink14,
            R.drawable.drink15,
            R.drawable.drink16,
            R.drawable.drink17,
            R.drawable.drink18,
            R.drawable.drink19,
            R.drawable.drink20,
            R.drawable.drink21,
            R.drawable.drink22,
            R.drawable.drink23,
            R.drawable.drink24,
            R.drawable.drink25,
            R.drawable.drink26,
            R.drawable.drink27,
            R.drawable.drink28,
            R.drawable.drink29,
            R.drawable.drink30,
            R.drawable.drink31,
            R.drawable.drink32,
            R.drawable.drink33,
            R.drawable.drink34,
            R.drawable.drink35
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        mLoadingBeer = (ImageView) findViewById(R.id.loading_beer);


        AsyncTask.execute(new Runnable() {
            @Override
            public void run () {

                while (mCount < 70 && !isFinishing()) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run () {
                            mLoadingBeer.setImageResource(mBeerAnim[(mCount + 1) % mBeerAnim.length]);
                            mLoadingBeer.invalidate();
                        }
                    });

                    mCount++;
                    try {
                        Thread.sleep(70);
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

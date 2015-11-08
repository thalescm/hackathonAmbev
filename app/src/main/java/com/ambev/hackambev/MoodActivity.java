package com.ambev.hackambev;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MoodActivity extends AppCompatActivity {


//    @Bind(R.id.brothersRL)
//    View brothersRL;
//    @Bind(R.id.dateRL)
//    View dateRL;
//    @Bind(R.id.crowdRL)
//    View crowdRL;
//    @Bind(R.id.soccerRL)
//    View soccerRL;
//    @Bind(R.id.wifiRL)
//    View wifiRL;
//    @Bind(R.id.musicRL)
//    View musicRL;
//    @Bind(R.id.foodRL)
//    View foodRL;
//    @Bind(R.id.parkRL)
//    View parkRL;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood);
        ButterKnife.bind(this);

    }


    @OnClick(R.id.findBTN)
    public void findMyBar(View view) {
        Intent intent = new Intent(this, LoadingActivity.class);
        startActivity(intent);
    }
}

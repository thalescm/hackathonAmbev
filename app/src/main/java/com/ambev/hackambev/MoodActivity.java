package com.ambev.hackambev;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MoodActivity extends AppCompatActivity {


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

    @Bind(R.id.brothersI)
    ImageView brothersI;
    int brotherCT = 0;
    int[] brotherArray = new int[] {
            R.drawable.mood_brothers_gray,
            R.drawable.mood_brothers_green,
            R.drawable.mood_brothers_red};
    @OnClick(R.id.brothersRL)
    public void cheangeBrothers(View view) {
        brothersI.setImageResource(brotherArray[++brotherCT % 3]);

        if (brotherCT % 3 == 1 && crowdCT % 3 == 0 &&
                soccerCT % 3 == 0 &&
                wifiCT % 3 == 0 &&
                musicCT % 3 == 0 &&
                foodCT % 3 == 0 &&
                parkCT % 3 == 0) {

            dateCT = 0;
            dateI.setImageResource(dateArray[dateCT]);
            crowdI.setImageResource(crowdArray[++crowdCT % 3]);
            soccerI.setImageResource(soccerArray[++soccerCT % 3]);
            wifiI.setImageResource(wifiArray[++wifiCT % 3]);
            musicI.setImageResource(musicArray[++musicCT % 3]);

        } else if (brotherCT % 3 == 2 && crowdCT % 3 == 1 &&
                soccerCT % 3 == 1 &&
                wifiCT % 3 == 1 &&
                musicCT % 3 == 1 &&
                foodCT % 3 == 0 &&
                parkCT % 3 == 0) {

            dateCT = 0;
            dateI.setImageResource(dateArray[dateCT]);
            crowdI.setImageResource(crowdArray[--crowdCT % 3]);
            soccerI.setImageResource(soccerArray[--soccerCT % 3]);
            wifiI.setImageResource(wifiArray[--wifiCT % 3]);
            musicI.setImageResource(musicArray[--musicCT % 3]);
        }
    }

    @Bind(R.id.dateI)
    ImageView dateI;
    int dateCT = 0;
    int[] dateArray = new int[] {
            R.drawable.mood_date_gray,
            R.drawable.mood_dare_green,
            R.drawable.mood_date_red};
    @OnClick(R.id.dateRL)
    public void cheangeDates(View view) {
        dateI.setImageResource(dateArray[++dateCT % 3]);

        if (dateCT == 1 && crowdCT % 3 == 0 &&
                soccerCT % 3 == 0 &&
                wifiCT % 3 == 0 &&
                musicCT % 3 == 0 &&
                foodCT % 3 == 0 &&
                parkCT % 3 == 0) {

            brotherCT = 0;
            brothersI.setImageResource(brotherArray[brotherCT]);
            wifiI.setImageResource(wifiArray[++wifiCT % 3]);
            foodI.setImageResource(foodArray[++foodCT % 3]);
            parkI.setImageResource(parkArray[++parkCT % 3]);

        } else if (dateCT % 3 == 2 && crowdCT % 3 == 0 &&
                soccerCT % 3 == 0 &&
                wifiCT % 3 == 1 &&
                musicCT % 3 == 0 &&
                foodCT % 3 == 1 &&
                parkCT % 3 == 1) {

            brotherCT = 0;
            brothersI.setImageResource(brotherArray[brotherCT]);
            wifiI.setImageResource(wifiArray[--wifiCT % 3]);
            foodI.setImageResource(foodArray[--foodCT % 3]);
            parkI.setImageResource(parkArray[--parkCT % 3]);
        }
    }

    @Bind(R.id.crowdI)
    ImageView crowdI;
    int crowdCT = 0;
    int[] crowdArray = new int[] {
            R.drawable.mood_crowd_gray,
            R.drawable.mood_crowd_green,
            R.drawable.mood_crowd_red};
    @OnClick(R.id.crowdRL)
    public void cheangeCrowdss(View view) {
        crowdI.setImageResource(crowdArray[++crowdCT % 3]);
    }


    @Bind(R.id.soccerI)
    ImageView soccerI;
    int soccerCT = 0;
    int[] soccerArray = new int[] {
            R.drawable.mood_soccer_gray,
            R.drawable.mood_soccer_green,
            R.drawable.mood_soccer_red};
    @OnClick(R.id.soccerRL)
    public void cheangeSoccers(View view) {
        soccerI.setImageResource(soccerArray[++soccerCT % 3]);
    }

    @Bind(R.id.wifiI)
    ImageView wifiI;
    int wifiCT = 0;
    int[] wifiArray = new int[] {
            R.drawable.mood_wifi_gray,
            R.drawable.mood_wifi_green,
            R.drawable.mood_wifi_red};
    @OnClick(R.id.wifiRL)
    public void cheangeWifis(View view) {
        wifiI.setImageResource(wifiArray[++wifiCT % 3]);
    }

    @Bind(R.id.musicI)
    ImageView musicI;
    int musicCT = 0;
    int[] musicArray = new int[] {
            R.drawable.mood_music_gray,
            R.drawable.mood_music_green,
            R.drawable.mood_music_red};
    @OnClick(R.id.musicRL)
    public void cheangeMusics(View view) {
        musicI.setImageResource(musicArray[++musicCT % 3]);
    }

    @Bind(R.id.foodI)
    ImageView foodI;
    int foodCT = 0;
    int[] foodArray = new int[] {
            R.drawable.mood_food_gray,
            R.drawable.mood_food_green,
            R.drawable.mood_food_red};
    @OnClick(R.id.foodRL)
    public void cheangeFoods(View view) {
        foodI.setImageResource(foodArray[++foodCT % 3]);
    }

    @Bind(R.id.parkI)
    ImageView parkI;
    int parkCT = 0;
    int[] parkArray = new int[] {
            R.drawable.mood_park_gray,
            R.drawable.mood_park_green,
            R.drawable.mood_park_red};
    @OnClick(R.id.parkRL)
    public void cheangeParks(View view) {
        parkI.setImageResource(parkArray[++parkCT % 3]);
    }
}

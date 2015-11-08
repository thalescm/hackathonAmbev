package com.ambev.hackambev;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.ambev.hackambev.bar.BarDetailActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Bind(R.id.drawer_layout)
    DrawerLayout mDraweLayout;

    @Bind(R.id.nav_view)
    NavigationView mNavigationView;

    @Bind(R.id.toolbar)
    Toolbar mToolbar;

    @Bind(R.id.bar_card)
    CardView barCard;

    @Bind(R.id.me_leve2)
    Button meLeva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setSupportActionBar(mToolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, mDraweLayout, mToolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDraweLayout.setDrawerListener(toggle);
        toggle.syncState();
        mNavigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        if (mDraweLayout.isDrawerOpen(GravityCompat.START)) {
            mDraweLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camara) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        mDraweLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @OnClick(R.id.bar_card)
    public void onClickBarDetail(View view) {
        Intent intent = new Intent(getApplicationContext(), BarDetailActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.me_leve2)
    public void onClickMeLeva(View view) {
        final Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.br/maps/dir/Ballroom+-+Rua+Estados+Unidos,+1570+-+Jardim+Paulista,+S%C3%A3o+Paulo+-+SP,+01412-100/Vila+Madalena,+S%C3%A3o+Paulo+-+State+of+S%C3%A3o+Paulo/@-23.5586979,-46.6920616,15z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x94ce59d64421f811:0xcbf2cb6d9ecbd226!2m2!1d-46.6690183!2d-23.566441!1m5!1m1!1s0x94ce57be69847fa9:0xd423d197dd9d1e01!2m2!1d-46.6975656!2d-23.5514369?hl=en"));
        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
        startActivity(intent);
    }
}

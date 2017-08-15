package com.example.bdtouristguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.maps.model.LatLng;

public class Dhaka extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Dhaka.this,ProfileActivity.class);
                startActivity(intent);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.dhaka, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_name) {
            double newLat = 24.5239682;
            double newLong = 90.29957850000005;

            LatLng fromPosition = new LatLng(newLat,newLong);

            Bundle args = new Bundle();
            args.putParcelable("longLat_dataProvider", fromPosition);

            Intent i = new Intent(Dhaka.this, MapsActivity.class);
            i.putExtras(args);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
Intent intent=new Intent(Dhaka.this,Ticketing.class);
            startActivity(intent);
        } else if (id == R.id.nav_gallery) {
            Intent i = new Intent(Dhaka.this, Dhaka_Gallery.class);
            startActivity(i);
        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void toDhakaSightseeing(View view)
    {
        Intent intent=new Intent(Dhaka.this,DhakaSightseeing.class);
        startActivity(intent);
    }
    public void toDhakaActivities(View view)
    {
        Intent intent=new Intent(Dhaka.this,DhakaActivities.class);
        startActivity(intent);
    }
    public void toDhakaHealth(View view)
    {
        Intent intent=new Intent(Dhaka.this,DhakaHealth.class);
        startActivity(intent);
    }
    public void toDhakaSports(View view)
    {
        Intent intent=new Intent(Dhaka.this,DhakaSports.class);
        startActivity(intent);
    }
    public void toDhakaSafety(View view)
    {
        Intent intent=new Intent(Dhaka.this,DhakaSafety.class);
        startActivity(intent);
    }
    public void toDhakaBank(View view)
    {
        Intent intent=new Intent(Dhaka.this,DhakaMoney.class);
        startActivity(intent);
    }
    public void toWeatherActivity(View view)
    {
        Intent intent=new Intent(Dhaka.this,WeatherActivity.class);
        startActivity(intent);
    }
    public void toRegion(View view)
    {
        Intent intent=new Intent(Dhaka.this,DhakaRegion.class);
        startActivity(intent);
    }
    public void toDhakaCityWalks(View view)
    {
        Intent intent=new Intent(Dhaka.this,DhakaCityWalks.class);
        startActivity(intent);
    }
}

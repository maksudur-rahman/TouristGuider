package com.example.bdtouristguide;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class HomeScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_home_screen);
    }
    public void toSearchScreen(View view)
    {
        Intent intent=new Intent(HomeScreen.this,Search.class);
        startActivity(intent);
    }
    public void toBrowseActivity(View view)
    {
        Intent intent=new Intent(HomeScreen.this,Browse.class);
        startActivity(intent);
    }
}

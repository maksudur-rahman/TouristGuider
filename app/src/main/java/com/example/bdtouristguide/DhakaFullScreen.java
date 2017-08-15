package com.example.bdtouristguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class DhakaFullScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka_full_screen);
        Intent i=getIntent();
        int position=i.getExtras().getInt("ID");
        DhakaImageAdapter imageAdapter=new DhakaImageAdapter(this);
        ImageView imageView= (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(imageAdapter.image[position]);
    }
}
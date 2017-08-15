package com.example.bdtouristguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SylhetFullScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet_full_screen);
        Intent i=getIntent();
        int position=i.getExtras().getInt("ID");
        SylhetImageAdapter imageAdapter=new SylhetImageAdapter(this);
        ImageView imageView= (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(imageAdapter.image[position]);
    }
}

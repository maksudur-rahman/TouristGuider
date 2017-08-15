package com.example.bdtouristguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Browse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);
    }
    public void toDhaka(View view)
    {
        Intent intent=new Intent(Browse.this,Dhaka.class);
        startActivity(intent);
    }
    public void toComilla(View view)
    {
        Intent intent=new Intent(Browse.this,Comilla.class);
        startActivity(intent);
    }
    public void toChittagong(View view)
    {
        Intent intent=new Intent(Browse.this,Chittagong.class);
        startActivity(intent);
    }
    public void toSylhet(View view)
    {
        Intent intent=new Intent(Browse.this,Sylhet.class);
        startActivity(intent);
    }
    public void toMymensingh(View view)
    {
        Intent intent=new Intent(Browse.this,Mymensingh.class);
        startActivity(intent);
    }
    public void toRajshahi(View view)
    {
        Intent intent=new Intent(Browse.this,Rajshahi.class);
        startActivity(intent);
    }
    public void toKhulna(View view)
    {
        Intent intent=new Intent(Browse.this,Khulna.class);
        startActivity(intent);
    }
    public void toRangpur(View view)
    {
        Intent intent=new Intent(Browse.this,Rangpur.class);
        startActivity(intent);
    }
    public void toBarisal(View view)
    {
        Intent intent=new Intent(Browse.this,Barisal.class);
        startActivity(intent);
    }
}

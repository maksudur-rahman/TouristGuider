package com.example.bdtouristguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
public class Chittagong_Gallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittagong__gallery);
        GridView gridView1= (GridView) findViewById(R.id.gridView);
        gridView1.setAdapter(new ChittagongImageAdapter(this));
        gridView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(getApplicationContext(),ChittagongFullScreen.class);
                i.putExtra("ID",position);
                startActivity(i);
            }
        });
    }
}

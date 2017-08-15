package com.example.bdtouristguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.HashMap;

public class Search extends AppCompatActivity {

    // List view
    private ListView lv;

    // Listview Adapter
    ArrayAdapter<String> adapter;

    // Search EditText
    EditText inputSearch;


    // ArrayList for Listview
    ArrayList<HashMap<String, String>> productList;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.again_menu, menu);
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
            Intent i = new Intent(Search.this, MapsActivity.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        String products[] = {"Dhaka","Comilla","Chitagong","Sylhet","Rajshahi","Rangpur","Khulna","Barisal","Mymensingh"};

        lv = (ListView) findViewById(R.id.list_view);
        inputSearch = (EditText) findViewById(R.id.inputSearch);

        // Adding items to listview
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.product_name, products);
        lv.setAdapter(adapter);

        /**
         * Enabling Search Filter
         * */
        inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                Search.this.adapter.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                String string=inputSearch.getText().toString();
               if (position==0){
                    Intent intent=new Intent(Search.this,Dhaka.class);
                    startActivity(intent);
                }
                if (string.equals("Dhaka")){
                    Intent intent=new Intent(Search.this,Dhaka.class);
                    startActivity(intent);
                }
                if (position==1){
                    Intent intent=new Intent(Search.this,Comilla.class);
                    startActivity(intent);
                }
                if (string.equals("Comilla")){
                    Intent intent=new Intent(Search.this,Comilla.class);
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent=new Intent(Search.this,Chittagong.class);
                    startActivity(intent);
                }
                if (string.equals("Chittagong")){
                    Intent intent=new Intent(Search.this,Chittagong.class);
                    startActivity(intent);
                }
                if (position==3){
                    Intent intent=new Intent(Search.this,Sylhet.class);
                    startActivity(intent);
                }
                if (string.equals("Sylhet")){
                    Intent intent=new Intent(Search.this,Sylhet.class);
                    startActivity(intent);
                }
                if (position==4){
                    Intent intent=new Intent(Search.this,Rajshahi.class);
                    startActivity(intent);
                }
                if (string.equals("Rajshahi")){
                    Intent intent=new Intent(Search.this,Rajshahi.class);
                    startActivity(intent);
                }
                if (position==5){
                    Intent intent=new Intent(Search.this,Rangpur.class);
                    startActivity(intent);
                }
                if (string.equals("Rangpur")){
                    Intent intent=new Intent(Search.this,Rangpur.class);
                    startActivity(intent);
                }
                if (position==6){
                    Intent intent=new Intent(Search.this,Khulna.class);
                    startActivity(intent);
                }
                if (string.equals("Khulna")){
                    Intent intent=new Intent(Search.this,Khulna.class);
                    startActivity(intent);
                }
                if (position==7){
                    Intent intent=new Intent(Search.this,Barisal.class);
                    startActivity(intent);
                }
                if (string.equals("Barisal")){
                    Intent intent=new Intent(Search.this,Barisal.class);
                    startActivity(intent);
                }
                if (position==8){
                    Intent intent=new Intent(Search.this,Mymensingh.class);
                    startActivity(intent);
                }
                if (string.equals("Mymensingh")){
                    Intent intent=new Intent(Search.this,Mymensingh.class);
                    startActivity(intent);
                }
            }
        });
    }

}

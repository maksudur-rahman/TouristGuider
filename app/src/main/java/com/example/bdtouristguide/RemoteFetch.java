package com.example.bdtouristguide;

import android.content.Context;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by andrei on 15.06.2015.
 */
public class RemoteFetch {

    private static final String OPEN_WEATHER_MAP_API =
            "http://api.openweathermap.org/data/2.5/weather?q=%s&units=metric";

    public static JSONObject getJSON(Context context, String city) {
        try {
            URL url = new URL(String.format(OPEN_WEATHER_MAP_API, city));
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.addRequestProperty("x-api-key",
                    context.getString(R.string.Default));

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(connection.getInputStream()));

            StringBuffer json = new StringBuffer(1024);
            String tmp = "";

            while((tmp = reader.readLine()) != null)
                json.append(tmp).append("\n");
            reader.close();

            JSONObject data = new JSONObject(json.toString());

            if(data.getInt("cod") != 200) {
                return null;
            }

            return data;
        } catch (Exception e) {
            return null;
        }
    }
}


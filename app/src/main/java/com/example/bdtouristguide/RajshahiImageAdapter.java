package com.example.bdtouristguide;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class RajshahiImageAdapter extends BaseAdapter {
    private Context context;
    public int[]image={

            R.mipmap.b1,
            R.mipmap.b2,
            R.mipmap.b3,
            R.mipmap.b4,
            R.mipmap.b5,
            R.mipmap.b6,
            R.mipmap.b7,
            R.mipmap.g1,
            R.mipmap.m1,
            R.mipmap.m2,
            R.mipmap.m3,
            R.mipmap.m4,
            R.mipmap.m5,
            R.mipmap.m6,
            R.mipmap.m7,
            R.mipmap.mm1,
            R.mipmap.mm2,
            R.mipmap.mm3,
            R.mipmap.mm4,
            R.mipmap.p1,
            R.mipmap.p2,
            R.mipmap.p3,
            R.mipmap.p4,
            R.mipmap.padma,
            R.mipmap.rj1,
            R.mipmap.rj2,
            R.mipmap.rj3,
            R.mipmap.rj4,
            R.mipmap.rj5,
            R.mipmap.rj6,
            R.mipmap.rr2,
            R.mipmap.rr3,
            R.mipmap.bodhdho_bihar,
            R.mipmap.mohasthangor
    };
    public RajshahiImageAdapter(Context c){
        context=c;
    }
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int position) {
        return image[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView=new ImageView(context);
        imageView.setImageResource(image[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setLayoutParams(new GridView.LayoutParams(240,240));
        return imageView;
    }
}

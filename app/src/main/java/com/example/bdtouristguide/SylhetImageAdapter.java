package com.example.bdtouristguide;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class SylhetImageAdapter extends BaseAdapter {

    private Context context;
    public int[]image={

            R.mipmap.jhorna,
            R.mipmap.jj1,
            R.mipmap.mountain1,
            R.mipmap.r1,
            R.mipmap.r2,
            R.mipmap.r3,
            R.mipmap.r4,
            R.mipmap.r5,
            R.mipmap.r6,
            R.mipmap.r7,
            R.mipmap.r8,
            R.mipmap.r9,
            R.mipmap.r10,
            R.mipmap.r11,
            R.mipmap.r12,
            R.mipmap.r13,
            R.mipmap.shah_mazar,
            R.mipmap.tea1,
            R.mipmap.tea_garden
    };
    public SylhetImageAdapter(Context c){
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

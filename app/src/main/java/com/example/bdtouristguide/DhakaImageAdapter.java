package com.example.bdtouristguide;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;


public class DhakaImageAdapter extends BaseAdapter {
    private Context context;
    public int[]image={

            R.mipmap.ahsan_monjil,
            R.mipmap.bajar,
            R.mipmap.carzon_hal,
            R.mipmap.charch,
            R.mipmap.hatir_jhil,
            R.mipmap.lalbag,
            R.mipmap.d_city,
            R.mipmap.d1,
            R.mipmap.dhaka,
            R.mipmap.lalbag,
            R.mipmap.perliament
    };
    public DhakaImageAdapter(Context c){
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

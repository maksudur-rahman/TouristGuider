package com.example.bdtouristguide;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ChittagongImageAdapter extends BaseAdapter {

    private Context context;
    public int[]image={

            R.mipmap.alutila,
            R.mipmap.banderban,
            R.mipmap.beach,
            R.mipmap.coxsbazar1,
            R.mipmap.coxsbazar2,
            R.mipmap.inani,
            R.mipmap.jhorna1,
            R.mipmap.saint,
            R.mipmap.saint_martin,
            R.mipmap.saint12,
            R.mipmap.sajek,
            R.mipmap.sajek1,
            R.mipmap.sajekk,
            R.mipmap.sm1,
            R.mipmap.sm2,
            R.mipmap.sm3,
            R.mipmap.sm4,
            R.mipmap.sm5,
            R.mipmap.sm6,
            R.mipmap.sm7,
            R.mipmap.jhorna
    };
    public ChittagongImageAdapter(Context c){
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

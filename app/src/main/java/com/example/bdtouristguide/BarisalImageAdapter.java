package com.example.bdtouristguide;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class BarisalImageAdapter extends BaseAdapter {

    private Context context;
    public int[]image={

            R.mipmap.br1,
            R.mipmap.br2,
            R.mipmap.kuakata,
            R.mipmap.br3,
            R.mipmap.br4,
            R.mipmap.br5,
            R.mipmap.br6,
            R.mipmap.br7,
            R.mipmap.br9,
            R.mipmap.k1,
            R.mipmap.k2,
            R.mipmap.k3,
            R.mipmap.k4,
            R.mipmap.k5,
            R.mipmap.k6,
            R.mipmap.k7,
            R.mipmap.k8,
            R.mipmap.k9
    };
    public BarisalImageAdapter(Context c){
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

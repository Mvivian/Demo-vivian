package com.example.ViewDemo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import java.util.ArrayList;
import java.lang.reflect.Field;

/**
 * Created by fxm_vivian on 14-12-9.
 */
public class CyclicGallery extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simplegallery);
        Gallery gallery = (Gallery)findViewById(R.id.simplegallery);
        gallery.setAdapter(new ImageAdapater(this));
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,View v,int position,long id) {
                Toast.makeText(CyclicGallery.this, "You have choosed the " + position + "image.", Toast.LENGTH_LONG).show();
            }
        });
    }


    private class ImageAdapater extends BaseAdapter{
        private int[] mImageId = { R.drawable.green, R.drawable.apple, R.drawable.oldman, R.drawable.flower};
        private Context mContext = null;
        ImageAdapater(Context context) {
            mContext = context;
        }

        public int getCount() {
            return Integer.MAX_VALUE;
        }

        public Object getItem(int position) {
            return position;
        }

        public long getItemId(int position) {
            return position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView image = new ImageView(mContext);
            image.setImageResource(mImageId[position%mImageId.length]);
            image.setLayoutParams(new Gallery.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            image.setScaleType(ImageView.ScaleType.FIT_CENTER);
            return image;
        }

    }

}

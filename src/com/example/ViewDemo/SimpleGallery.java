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
public class SimpleGallery extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simplegallery);
        Gallery gallery = (Gallery)findViewById(R.id.simplegallery);
        try {
            gallery.setAdapter(new ImageAdapter(this));
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,View v,int position,long id) {
                Toast.makeText(SimpleGallery.this, "You have choosed the " + position + "image.", Toast.LENGTH_LONG).show();
            }
        });
    }


    private class ImageAdapter extends BaseAdapter{
        private Context mContext;
        private java.util.ArrayList<Integer> imgList=new java.util.ArrayList<Integer>();
        private java.util.ArrayList<Object> imgSizes=new java.util.ArrayList<Object>();
        public ImageAdapter(Context c) throws IllegalArgumentException, IllegalAccessException{
            mContext = c;
            //用反射机制来获取资源中的图片ID和尺寸
            Field[] fields = R.drawable.class.getDeclaredFields();
            for (Field field : fields)
            {
                if (!"icon".equals(field.getName()))//除了icon之外的图片
                {
                    int index=field.getInt(R.drawable.class);
                    //保存图片ID
                    imgList.add(index);
                    //保存图片大小
                    int size[]=new int[2];
                    Bitmap bmImg= BitmapFactory.decodeResource(getResources(), index);
                    size[0]=bmImg.getWidth();size[1]=bmImg.getHeight();
                    imgSizes.add(size);
                }
            }
        }
        @Override
        public int getCount() {
            // TODO Auto-generated method stub

            return imgList.size();
        }

        @Override
        public Object getItem(int position) {
            // TODO Auto-generated method stub

            return position;
        }

        @Override
        public long getItemId(int position) {
            // TODO Auto-generated method stub

            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub

            ImageView i = new ImageView (mContext);
            //从imgList取得图片ID
            i.setImageResource(imgList.get(position).intValue());
            i.setScaleType(ImageView.ScaleType.FIT_XY);
            //从imgSizes取得图片大小
            int size[]= new int[2];
            size=(int[]) imgSizes.get(position);
            i.setLayoutParams(new Gallery.LayoutParams(size[0], size[1]));
            return i;
        }
    }


}

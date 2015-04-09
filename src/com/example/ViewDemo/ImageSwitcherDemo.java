package com.example.ViewDemo;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.*;
import android.widget.ViewSwitcher.ViewFactory;

/**
 * Created by fxm_vivian on 15-1-4.
 */
public class ImageSwitcherDemo extends Activity implements ViewFactory{
    int[] imageIDs = {
            R.drawable.jay,R.drawable.apple, R.drawable.flower, R.drawable.green, R.drawable.image, R.drawable.oldman
    };
    private ImageSwitcher imageSwitcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imageswitcherdemo);

        imageSwitcher = (ImageSwitcher)findViewById(R.id.switcher1);
        imageSwitcher.setFactory(this);
        imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
        imageSwitcher.setOutAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_out));

        Gallery gallery = (Gallery) findViewById(R.id.gallery1);
        ImageAdapter adapter = new ImageAdapter(this);
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                imageSwitcher.setImageResource(imageIDs[position]);
            }
        });

    }

    @Override
    public View makeView() {
        ImageView view = new ImageView(this);
        view.setBackgroundColor(0xFF000000);
        view.setScaleType(ImageView.ScaleType.FIT_CENTER);
        view.setLayoutParams(new ImageSwitcher.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT));
        return view;
    }

    public class ImageAdapter extends BaseAdapter {
        private Context context;
        private int itemBackground;
        public ImageAdapter(Context c) {
            TypedArray a = obtainStyledAttributes(R.styleable.Gallery1);
            itemBackground = a.getResourceId(R.styleable.Gallery1_android_galleryItemBackground, 0);
            a.recycle();
        }

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int position) {
            return position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageview = new ImageView(context);
            imageview.setImageResource(imageIDs[position]);
            imageview.setScaleType(ImageView.ScaleType.FIT_XY);
            imageview.setLayoutParams(new Gallery.LayoutParams(150, 200));
            imageview.setBackgroundResource(itemBackground);
            return imageview;
        }
    }//class ImageAdapter
}

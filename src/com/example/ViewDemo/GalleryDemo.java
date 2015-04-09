package com.example.ViewDemo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

/**
 * Created by fxm_vivian on 14-12-8.
 */
public class GalleryDemo extends Activity{
    private Context mContext = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mContext = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallerydemo);
        /***Simple Gallery***/
        Button button1 = (Button)findViewById(R.id.gallery_button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, SimpleGallery.class);
                startActivity(intent);
            }
        });
        /***Cyclic Gallery***/
        Button button2= (Button)findViewById(R.id.gallery_button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, CyclicGallery.class);
                startActivity(intent);
            }
        });
    }
}

package com.example.ViewDemo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListViewDemo extends Activity {
    /**
     * Called when the activity is first created.
     */
    Context mContext = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listviewdemo);
        mContext = this;
        /***SimpleList***/
        Button button0 = (Button)findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, SimpleList.class);
                startActivity(intent);
            }
        });
        /***TitleList***/
        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, TitleList.class);
                startActivity(intent);
            }
        });
        /***IconList***/
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, IconList.class);
                startActivity(intent);
            }
        });
        /***自定义BaseAdapteryanyse颜涩***/
        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, ColorList.class);
                startActivity(intent);
            }
        });
        /***修改列表颜色***/
        Button button4= (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, ArrayList.class);
                startActivity(intent);
            }
        });

    }
}

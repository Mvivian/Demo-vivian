package com.example.ViewDemo;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

/**
 * Created by fxm_vivian on 14-12-8.
 */
public class ViewDemo extends Activity{
    Context mContext = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mContext = this;
        WindowManager wm = getWindowManager();
        Display d = wm.getDefaultDisplay();
        if(d.getWidth()>d.getHeight())
            Log.d("Orientation", "Landsapce mode");
        else
            Log.d("Orientation", "Portrait mdoe");

 //       setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
//        ActionBar actionBar = getActionBar();
//        actionBar.hide();


        /***ListDemo***/
        Button button0 = (Button)findViewById(R.id.listviewdemo);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, ListViewDemo.class);
                startActivity(intent);
            }
        });

        /***GridViewDemo***/
        Button button1 = (Button)findViewById(R.id.gridviewdemo);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, GridViewDemo.class);
                startActivity(intent);
            }
        });

        /***GalleryDemo***/
        Button button2 = (Button)findViewById(R.id.gallerydemo);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, GalleryDemo.class);
                startActivity(intent);
            }
        });

        /***MenuDemo***/
        Button button3 = (Button)findViewById(R.id.menudemo);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, MenuDemo.class);
                startActivity(intent);
            }
        });

        /***LayoutDemo***/
        Button button4 = (Button)findViewById(R.id.scrollviewdemo);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, ScrollViewDemo.class);
                startActivity(intent);
            }
        });

        /***ButtonDemo***/
        Button button5 = (Button)findViewById(R.id.buttondemo);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, ButtonDemo.class);
                startActivity(intent);
            }
        });

        Button button6 = (Button)findViewById(R.id.progressbardemo);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, ProgressBarDemo.class);
                startActivity(intent);
            }
        });

        Button button7 = (Button)findViewById(R.id.spinnerdemo);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, SpinnerDemo.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        CreateMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return MenuChoice(item);
    }

    private void CreateMenu(Menu menu) {
        MenuItem mnu1 = menu.add(0,0,0,"Item1");
        mnu1.setIcon(R.drawable.jay);
        mnu1.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);

        MenuItem mnu2 = menu.add(0,1,1,"Item2");
        mnu2.setIcon(R.drawable.jay);
        mnu2.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);

        MenuItem mnu3 = menu.add(0,2,2,"Item3");
        mnu3.setIcon(R.drawable.jay);
        mnu3.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);

        MenuItem mnu4 = menu.add(0,3,3,"Item4");
        mnu4.setIcon(R.drawable.jay);
        mnu4.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);

        MenuItem mnu5 = menu.add(0,4,4,"Item5");
        mnu5.setIcon(R.drawable.jay);
        mnu5.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
    }

    private boolean MenuChoice(MenuItem item) {
        switch(item.getItemId()) {
            case 0:
                Toast.makeText(mContext,"You clicked on Item 1", Toast.LENGTH_LONG).show();
                return true;
            case 1:
                Toast.makeText(mContext,"You clicked on Item 2", Toast.LENGTH_LONG).show();
                return true;
            case 2:
                Toast.makeText(mContext,"You clicked on Item 3", Toast.LENGTH_LONG).show();
                return true;
            case 3:
                Toast.makeText(mContext,"You clicked on Item 4", Toast.LENGTH_LONG).show();
                return true;
            case 4:
                Toast.makeText(mContext,"You clicked on Item 5", Toast.LENGTH_LONG).show();
                return true;
        }
        return false;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_DPAD_LEFT:
                Toast.makeText(this, "Left was clicked", Toast.LENGTH_LONG).show();
                return true;
            case KeyEvent.KEYCODE_DPAD_RIGHT:
                Toast.makeText(this, "Right was clicked", Toast.LENGTH_LONG).show();
                return true;
            case KeyEvent.KEYCODE_DPAD_UP:
                Toast.makeText(this, "Up was clicked", Toast.LENGTH_LONG).show();
                return true;
            case KeyEvent.KEYCODE_DPAD_DOWN:
                Toast.makeText(this, "Down was clicked", Toast.LENGTH_LONG).show();
                return true;
            case KeyEvent.KEYCODE_DPAD_CENTER:
                Toast.makeText(this, "Center was clicked", Toast.LENGTH_LONG).show();
                return true;
        }
        return false;
    }
}

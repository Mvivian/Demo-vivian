package com.example.ViewDemo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by fxm_vivian on 14-12-10.
 */
public class MenuDemo extends Activity{
    private Context mContext = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menudemo);

        /***OptionMenuDemo***/
        Button button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, OptionMenuDemo.class);
                startActivity(intent);
            }
        });

        /***SubMenuDemo***/
        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, SubMenuDemo.class);
                startActivity(intent);
            }
        });

        /***ContextMenuDemo***/
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, ContextMenuDemo.class);
                startActivity(intent);
            }
        });
    }

}

package com.example.ViewDemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by fxm_vivian on 14-12-19.
 */
public class ButtonDemo extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_radio);

        CheckBox checkBox = (CheckBox)findViewById(R.id.chkAutoSave);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((CheckBox)view).isChecked())
                    DisplayToast("CheckBox is checked");
                else
                    DisplayToast("CheckBox is unchecked");
            }
        });

        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.rdbGp1);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.rdb1:
                        DisplayToast("Option 1 is checkede");
                        return;
                    case R.id.rdb2:
                        DisplayToast("Option 2 is checked");
                }
                return;
            }
        });

    }

    private void DisplayToast(String string) {
        Toast.makeText(this, string, Toast.LENGTH_LONG).show();
    }
}

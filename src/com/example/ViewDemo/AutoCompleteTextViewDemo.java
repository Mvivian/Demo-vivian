package com.example.ViewDemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

/**
 * Created by fxm_vivian on 15-1-4.
 */
public class AutoCompleteTextViewDemo extends Activity{
    String[] presidents = {
            "Dwight", "John", "Lyndon", "Richard", "Gerald", "Jimmy", "Ronald", "George", "Bill", "Barack"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autocompletetextview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, presidents);
        AutoCompleteTextView textView = (AutoCompleteTextView)findViewById(R.id.actextview);

        textView.setThreshold(1);
        textView.setAdapter(adapter);

    }
}

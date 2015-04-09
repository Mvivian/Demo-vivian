package com.example.ViewDemo;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by fxm_vivian on 14-12-1.
 */
public class SimpleList extends ListActivity{
    private String[] mListStr = {"Name:Vivian", "Gender:Female", "BirthDay:1987-11-21"};
    ListView mListView = null;
    @Override
    protected void onCreate(Bundle savedInstanceSate) {
        mListView = getListView();
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mListStr));
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(SimpleList.this, "you have choosed " + mListStr[position], Toast.LENGTH_LONG).show();
            }
        });
        super.onCreate(savedInstanceSate);
    }
}

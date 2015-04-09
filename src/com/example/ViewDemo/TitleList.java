package com.example.ViewDemo;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by fxm_vivian on 14-12-1.
 */
public class TitleList extends ListActivity{
    private String[] mListTitle = {"Name", "Gender", "BirthDay"};
    private String[] mListStr = {"Vivian", "Female", "1987-11-21"};
    ListView mListView = null;
    ArrayList<Map<String, Object>> mData = new ArrayList<Map<String, Object>>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mListView = getListView();
        int length = mListTitle.length;
        for(int i=0; i<length; i++) {
            Map<String, Object> item = new HashMap<String, Object>();
            item.put("title", mListTitle[i]);
            item.put("text", mListStr[i]);
            mData.add(item);
        }

        SimpleAdapter adapter = new SimpleAdapter(this, mData, android.R.layout.simple_list_item_2,
                new String[]{"title","text"},
                new int[]{android.R.id.text1,android.R.id.text2});
        setListAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(TitleList.this, "You have choosed Title: " + mListTitle[position] + "Content: " + mListStr[position], Toast.LENGTH_LONG).show();
            }
        });
        super.onCreate(savedInstanceState);
    }


}

package com.example.ViewDemo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

/**
 * Created by fxm_vivian on 14-12-8.
 */
public class GridViewDemo extends Activity{
    private String[] items={"lorem", "ipsum", "dolor", "sit", "amet", "hello", "me", "elit", "morbi", "vel", "ligula", "vitae", "arcu", "aliquet", "mollis", "etiam", "vel", "erat", "placerat", "ante","hi", "sodales", "test", "augue", "purus"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview);
        GridView view = (GridView)findViewById(R.id.grid);
        view.setAdapter(new FunnyLookingAdapter(this, android.R.layout.simple_list_item_1, items));
        view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(GridViewDemo.this,"ƒ˙—°‘Ò¡À" + items[position], Toast.LENGTH_LONG).show();
            }
        });

    }


    private class FunnyLookingAdapter extends ArrayAdapter<String> {
        private Context context;
        private String[] theItems;

        FunnyLookingAdapter( Context context, int resource, String[] items){
            super(context,resource,items);
            this.context = context;
            theItems = items;
        }

        public View   getView  (int position, View convertView, ViewGroup parent) {
            TextView label = (TextView)convertView;
            if(convertView == null){
                convertView = new TextView(context);
                label = (TextView)convertView;
            }

            label.setText(position + ": "  + theItems[position]);
            return convertView;
        }
    }
}

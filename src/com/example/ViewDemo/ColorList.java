package com.example.ViewDemo;

import android.app.ListActivity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

/**
 * Created by fxm_vivian on 14-12-2.
 */
public class ColorList extends ListActivity{
    private String[] mListTitle = {"Name", "Gender", "BirthDay"};
    private String[] mListStr = {"Vivian", "Female", "1987-11-21"};
    ListView mListView = null;
    MyListAdapter myAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mListView = getListView();
        myAdapter = new MyListAdapter(this);
        setListAdapter(myAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                View v = adapterView.getChildAt(position);
                v.setBackgroundColor(Color.RED);
                Toast.makeText(ColorList.this,"ƒ˙—°‘Ò¡À" + mListStr[position], Toast.LENGTH_LONG).show();
            }
        });

        super.onCreate(savedInstanceState);
    }

    class MyListAdapter extends BaseAdapter {
        private int[] colors = new int[] {0xff626569, 0xff4f5257};
        private Context mContext;
        public MyListAdapter(Context context) {
            mContext = context;
        }

        public int getCount() {
            return mListStr.length;
        }

        @Override
        public boolean areAllItemsEnabled() {
            return false;
        }

        public Object getItem(int position) {
            return position;
        }

        public long getItemId(int position) {
            return position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView image = null;
            TextView title = null;
            TextView text = null;
            if(convertView == null) {
                convertView = LayoutInflater.from(mContext).inflate(R.layout.colorlist, null);
                image = (ImageView) convertView.findViewById(R.id.color_image);
                title =(TextView) convertView.findViewById(R.id.color_title);
                text= (TextView) convertView.findViewById(R.id.color_text);
            }

            int colorPos = position % colors.length;
            convertView.setBackgroundColor(colors[colorPos]);
            image.setImageResource(R.drawable.jay);
            title.setText(mListTitle[position]);
            text.setText(mListStr[position]);
            return convertView;
        }
    }
}

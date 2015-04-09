package com.example.ViewDemo;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

/**
 * Created by fxm_vivian on 14-12-2.
 */
public class ArrayList extends ListActivity{
    private String[] mListTitle = {"Name", "Gender", "BirthDay"};
    private String[] mListStr = {"Vivian", "Female", "1987-11-21"};
    ListView mListView = null;
    MyListAdapter myAdapter = null;
    ArrayList arrayList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mListView = getListView();
        myAdapter = new MyListAdapter(this,R.layout.arraylist);
        arrayList = this;
        setListAdapter(myAdapter);
        super.onCreate(savedInstanceState);
    }

    class MyListAdapter extends ArrayAdapter<Object> {
        int mTextViewResourceID = 0;
        private int[] colors = new int[] {0xff626569, 0xff4f5257};
        private Context mContext;
        public MyListAdapter(Context context, int textViewResourceId) {
            super(context, textViewResourceId);
            mTextViewResourceID = textViewResourceId;
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

        public View getView(final int position, View convertView, ViewGroup parent) {
            ImageView image = null;
            TextView title = null;
            TextView text = null;
            Button button = null;
            if(convertView == null) {
                convertView = LayoutInflater.from(mContext).inflate(mTextViewResourceID, null);
                image = (ImageView) convertView.findViewById(R.id.array_image);
                title = (TextView) convertView.findViewById(R.id.array_title);
                text = (TextView) convertView.findViewById(R.id.array_text);
                button = (Button)convertView.findViewById(R.id.array_button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        Toast.makeText(arrayList,"您点击的第"+position +"个按钮", Toast.LENGTH_LONG).show();
                    }
                });
            }

            int colorPos = position % colors.length;
            convertView.setBackgroundColor(colors[colorPos]);
            if(colorPos == 0)
                image.setImageResource(R.drawable.jay);
            else
                image.setImageResource(R.drawable.image);
            title.setText(mListTitle[position]);
            text.setText(mListStr[position]);
            return convertView;
        }
    }
}

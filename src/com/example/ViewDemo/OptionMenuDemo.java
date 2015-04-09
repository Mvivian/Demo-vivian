package com.example.ViewDemo;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by fxm_vivian on 14-12-12.
 */
public class OptionMenuDemo extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /***GroupId, ItemId, Order***/
        MenuItem mnu1 = menu.add(0, 0, 1, "Item1");
        mnu1.setAlphabeticShortcut('a');
        mnu1.setIcon(R.drawable.jay);
        mnu1.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM|MenuItem.SHOW_AS_ACTION_WITH_TEXT);
        mnu1.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                return false;
            }
        });

        MenuItem mnu2 = menu.add(0, 1, 0, "Item2");
        mnu2.setAlphabeticShortcut('b');
        mnu2.setIcon(R.drawable.jay);


        MenuItem mnu3 = menu.add(0, 2, 2, "Item3");
        mnu3.setAlphabeticShortcut('c');
        mnu3.setIcon(R.drawable.jay);

        MenuItem mnu4 = menu.add(0, 3, 3, "Item4");
        mnu4.setAlphabeticShortcut('d');

        menu.add(0, 6, 5, "Item5");
        menu.add(0, 5, 4, "Item6");
        menu.add(0, 4, 6, "Item7");
        return super.onCreateOptionsMenu(menu);
    }

       @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Toast.makeText(this, "You clicked on the application icon", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, MenuDemo.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                return true;
            case 0:
                Toast.makeText(this, "You clicked on Item1", Toast.LENGTH_LONG).show();
                return true;
            case 1:
                Toast.makeText(this, "You clicked on Item2", Toast.LENGTH_LONG).show();
                return true;
            case 2:
                Toast.makeText(this, "You clicked on Item3", Toast.LENGTH_LONG).show();
                return true;
            case 3:
                Toast.makeText(this, "You clicked on Item4", Toast.LENGTH_LONG).show();
                return true;
            case 4:
                Toast.makeText(this, "You clicked on Item5", Toast.LENGTH_LONG).show();
                return true;
            case 5:
                Toast.makeText(this, "You clicked on Item6", Toast.LENGTH_LONG).show();
                return true;
            case 6:
                Toast.makeText(this, "You clicked on Item7", Toast.LENGTH_LONG).show();
                return true;
        }
        return false;
    }

}

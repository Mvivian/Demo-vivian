package com.example.ViewDemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by fxm_vivian on 14-12-12.
 */
public class ContextMenuDemo extends Activity{
    private EditText edit1 = null;
    private EditText edit2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contextmenu_demo);
        edit1 = (EditText)findViewById(R.id.edit1);
        edit2 = (EditText)findViewById(R.id.edit2);

        this.registerForContextMenu(edit1);
        this.registerForContextMenu(edit2);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderIcon(R.drawable.jay);
        switch (v.getId()) {
            case R.id.edit1:
                menu.add(0, 0, 0, "��һ���һ��");
                menu.add(0, 1, 1, "��һ��ڶ���");
                menu.add(0, 2, 2, "��һ�������");
                break;
            case R.id.edit2:
                menu.add(1, 3, 0, "�ڶ����һ��");
                menu.add(1, 4, 1, "�ڶ���ڶ���");
                menu.add(1, 5, 2, "�ڶ��������");
                break;
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 0:
                Toast.makeText(this, "��һ���һ��", Toast.LENGTH_LONG).show();
                break;
            case 1:
                Toast.makeText(this, "��һ��ڶ���", Toast.LENGTH_LONG).show();
                break;
            case 2:
                Toast.makeText(this, "��һ�������", Toast.LENGTH_LONG).show();
                break;
            case 3:
                Toast.makeText(this, "�ڶ����һ��", Toast.LENGTH_LONG).show();
                break;
            case 4:
                Toast.makeText(this, "�ڶ���ڶ���", Toast.LENGTH_LONG).show();
                break;
            case 5:
                Toast.makeText(this, "�ڶ��������", Toast.LENGTH_LONG).show();
                break;
        }
        return super.onContextItemSelected(item);
    }
}

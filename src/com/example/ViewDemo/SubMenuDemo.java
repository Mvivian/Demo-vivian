package com.example.ViewDemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.SubMenu;

/**
 * Created by fxm_vivian on 14-12-12.
 */
public class SubMenuDemo extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        int base = Menu.FIRST;
        // һ��menu���԰�������Ӳ˵�
        SubMenu subMenu = menu.addSubMenu(base, base+1, Menu.NONE, "ϵͳ����");
        // �Ӳ˵����԰�������˵���
        subMenu.add(base, base+1, base+1, "��ʾ����").setIcon(R.drawable.jay);
        subMenu.add(base, base+2, base+2, "��������").setIcon(R.drawable.jay);
        subMenu.add(base, base+3, base+3, "�߼�����").setIcon(R.drawable.jay);
        subMenu.add(base, base+4, base+4, "��ȫ����").setIcon(R.drawable.jay);
        return super.onCreateOptionsMenu(menu);
    }
}

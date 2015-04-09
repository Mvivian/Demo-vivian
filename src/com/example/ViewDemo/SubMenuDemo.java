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
        // 一个menu可以包括多个子菜单
        SubMenu subMenu = menu.addSubMenu(base, base+1, Menu.NONE, "系统设置");
        // 子菜单可以包括多个菜单项
        subMenu.add(base, base+1, base+1, "显示设置").setIcon(R.drawable.jay);
        subMenu.add(base, base+2, base+2, "网络设置").setIcon(R.drawable.jay);
        subMenu.add(base, base+3, base+3, "高级设置").setIcon(R.drawable.jay);
        subMenu.add(base, base+4, base+4, "安全设置").setIcon(R.drawable.jay);
        return super.onCreateOptionsMenu(menu);
    }
}

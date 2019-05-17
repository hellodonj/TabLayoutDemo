package com.example.djj.tablayoutdemo.commontab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * 描述: fragment的adapter适配器
 * 作者|时间: djj on 2018/3/29 15:09
 * 博客地址: http://www.jianshu.com/u/dfbde65a03fc
 */

public class MyPagerAdapter extends FragmentPagerAdapter {

    private List<String> list;

    public MyPagerAdapter(FragmentManager fm, List<String> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return TabFragment.newInstance(list.get(position));

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position);
    }
}

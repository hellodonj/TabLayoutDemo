package com.example.djj.tablayoutdemo.commontab;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.TextView;

import com.example.djj.tablayoutdemo.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.tab_layout)
    TabLayout tabLayout;
    @BindView(R.id.view_pager)
    ViewPager viewPager;

    private int tabCount = 2;
    private List<String> tabs;
    private List<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initData();
        initViewPager();
        initTabLayout();
    }

    //初始化数据
    private void initData() {
        tabs = new ArrayList<String>();
        tabs.add("预约");
        tabs.add("我的");
        tabs.add("任务");
        tabs.add("历史");
        tabs.add("带班");
        tabs.add("历史");
        tabs.add("带班");

        fragments = new ArrayList<Fragment>();
        for (int i = 0; i < tabs.size(); i++) {
            fragments.add(TabFragment.newInstance(tabs.get(i)));
        }
    }

    //初始化viewpager
    private void initViewPager() {
        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager(), tabs));
    }

    //初始化TabLayout
    private void initTabLayout() {
        //tab与viewpager绑定
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        //自定义标签布局
        for (int i = 0; i < tabs.size(); i++) {
            TabLayout.Tab tab = tabLayout.getTabAt(i);
            TextView tv = (TextView) LayoutInflater.from(this).inflate(R.layout.tabview_main, tabLayout, false);
            tv.setText(tabs.get(i));
            tab.setCustomView(tv);
        }
    }
}

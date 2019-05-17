package com.example.djj.tablayoutdemo.flycotab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.djj.tablayoutdemo.R;
import com.example.djj.tablayoutdemo.commontab.TabFragment;
import com.flyco.tablayout.SegmentTabLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FlycoTabActivity extends AppCompatActivity {

    @BindView(R.id.segment_tab)
    SegmentTabLayout tabCommon;
    @BindView(R.id.vp_1)
    ViewPager vp1;

    private String[] tabs = new String[2];
    private ArrayList<Fragment> fragments;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flyco_tab);
        ButterKnife.bind(this);

        initData();
        tabCommon.setTabData(tabs);

    }

    //初始化数据
    private void initData() {
        tabs[0] = "预约";
        tabs[1] = "我的";


        fragments = new ArrayList<Fragment>();
        for (int i = 0; i < tabs.length; i++) {
            fragments.add(TabFragment.newInstance(tabs[i]));
        }
    }
}

package com.example.djj.tablayoutdemo.flycotab;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.djj.tablayoutdemo.R;
import com.flyco.tablayout.listener.CustomTabEntity;

/**
 * 描述: tab的fragment
 * 作者|时间: djj on 2018/3/29 15:31
 * 博客地址: http://www.jianshu.com/u/dfbde65a03fc
 */

public class Tab1Fragment extends Fragment {

    public static Tab1Fragment newInstance(CustomTabEntity text) {
        Bundle bundle = new Bundle();
        bundle.putString("text", text.getTabTitle());
        Tab1Fragment tabFragment = new Tab1Fragment();
        tabFragment.setArguments(bundle);
        return tabFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = view.findViewById(R.id.tv_show);
        textView.setText(getArguments().getString("text"));
    }
}

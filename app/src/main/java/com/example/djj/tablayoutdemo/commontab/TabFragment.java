package com.example.djj.tablayoutdemo.commontab;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.djj.tablayoutdemo.R;

/**
 * 描述: tab的fragment
 * 作者|时间: djj on 2018/3/29 15:31
 * 博客地址: http://www.jianshu.com/u/dfbde65a03fc
 */

public class TabFragment extends Fragment {

    public TabFragment() {
    }

    public static TabFragment newInstance(String text) {
        Bundle bundle = new Bundle();
        bundle.putString("text", text);
        TabFragment tabFragment = new TabFragment();
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

package com.example.djj.tablayoutdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by djj on 2018/4/26.
 */

public class CountHeaderViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;

    public CountHeaderViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.tv_time);
    }

    public void render(String text) {
        textView.setText(text);
    }
}
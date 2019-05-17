package com.example.djj.tablayoutdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by djj on 2018/4/26.
 */

public class CountItemViewHolder extends RecyclerView.ViewHolder {

    public ImageView icon;

    public CountItemViewHolder(View itemView) {
        super(itemView);
        //由于itemView是item的布局文件，我们需要的是里面的textView，因此利用itemView.findViewById获
        //取里面的textView实例，后面通过onBindViewHolder方法能直接填充数据到每一个textView了
        icon = itemView.findViewById(R.id.item_image);

    }

    public void render(int pic) {
        icon.setImageResource(pic);
    }
}
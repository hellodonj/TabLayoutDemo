package com.example.djj.tablayoutdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.truizlop.sectionedrecyclerview.SectionedRecyclerViewAdapter;

/**
 * 描述:
 * 作者|时间: djj on 2018/4/26 18:37
 * 博客地址: http://www.jianshu.com/u/dfbde65a03fc
 */

public class CountSectionAdapter extends SectionedRecyclerViewAdapter<CountHeaderViewHolder,
        CountItemViewHolder, CountFooterViewHolder> {

    private Context context;

    public CountSectionAdapter(Context context) {
        this.context = context;
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    private OnItemClickListener mOnItemClickListener;

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }

    /**
     * 分几段
     *
     * @return
     */
    @Override
    protected int getSectionCount() {
        return 6;
    }

    /**
     * 段下面有多少item
     *
     * @param section
     * @return
     */
    @Override
    protected int getItemCountForSection(int section) {
        return 20;
    }

    @Override
    protected boolean hasFooterInSection(int section) {
        return false;
    }

    protected LayoutInflater getLayoutInflater() {
        return LayoutInflater.from(context);
    }

    @Override
    protected CountHeaderViewHolder onCreateSectionHeaderViewHolder(ViewGroup parent, int viewType) {
        View view = getLayoutInflater().inflate(R.layout.item_title, parent, false);
        return new CountHeaderViewHolder(view);
    }

    @Override
    protected CountFooterViewHolder onCreateSectionFooterViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    protected CountItemViewHolder onCreateItemViewHolder(ViewGroup parent, int viewType) {
        View view = getLayoutInflater().inflate(R.layout.item_list, parent, false);
        return new CountItemViewHolder(view);
    }

    @Override
    protected void onBindSectionHeaderViewHolder(CountHeaderViewHolder holder, int section) {
        holder.render((section + 9) + ":00");
    }

    @Override
    protected void onBindSectionFooterViewHolder(CountFooterViewHolder holder, int section) {

    }

    @Override
    protected void onBindItemViewHolder(CountItemViewHolder holder, int section, final int position) {
        holder.render(R.drawable.jian);

    }
}
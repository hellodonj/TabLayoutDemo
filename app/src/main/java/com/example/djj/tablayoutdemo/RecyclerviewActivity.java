package com.example.djj.tablayoutdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.truizlop.sectionedrecyclerview.SectionedSpanSizeLookup;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerviewActivity extends Activity {

    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;

    private CountSectionAdapter mSectionAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        ButterKnife.bind(this);



//        mRecyclerView.addItemDecoration(new DividerItemDecoration(RecyclerviewActivity.this, DividerItemDecoration.VERTICAL));
//        mLayoutManager = new LinearLayoutManager(this);
//        mRecyclerView.setLayoutManager(mLayoutManager);
        mSectionAdapter = new CountSectionAdapter(RecyclerviewActivity.this);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 10);
        SectionedSpanSizeLookup lookup = new SectionedSpanSizeLookup(mSectionAdapter, layoutManager);
        layoutManager.setSpanSizeLookup(lookup);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mSectionAdapter);
        mSectionAdapter.setOnItemClickListener(new CountSectionAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(RecyclerviewActivity.this, "你点击了第" + position + "项", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

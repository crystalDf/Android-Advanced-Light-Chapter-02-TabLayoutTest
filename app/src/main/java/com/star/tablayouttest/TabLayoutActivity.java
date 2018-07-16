package com.star.tablayouttest;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class TabLayoutActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        mViewPager = findViewById(R.id.viewpager);

        initViewPager();
    }

    private void initViewPager() {

        mTabLayout = findViewById(R.id.tab_layout);

        List<String> titles = new ArrayList<>();

        titles.add("精选");
        titles.add("体育");
        titles.add("巴萨");
        titles.add("购物");

        for (String title : titles) {

            mTabLayout.addTab(mTabLayout.newTab().setText(title));
        }
    }
}

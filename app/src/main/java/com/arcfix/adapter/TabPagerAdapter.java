package com.arcfix.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.arcfix.R;
import com.arcfix.fragment.FeedsFragment;

/**
 * Created by deep on 30/03/16.
 */
public class TabPagerAdapter  extends FragmentPagerAdapter {
    final int PAGE_COUNT = 3;
    private String tabTitles[] ;
    private Context context;

    public TabPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
        tabTitles = context.getResources().getStringArray(R.array.tab_title);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        return FeedsFragment.instantiate(context,FeedsFragment.class.getName());
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
package com.example.luricha.snackless;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    int TabNum;

    public PagerAdapter(FragmentManager fm, int NumberOfTabs){
        super(fm);
        this.TabNum = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int pos){
        switch(pos){
            case 0:
                TodayTab ttab = new TodayTab();
                return ttab;
            case 1:
                LogTab ltab = new LogTab();
                return ltab;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 0;
    }
}

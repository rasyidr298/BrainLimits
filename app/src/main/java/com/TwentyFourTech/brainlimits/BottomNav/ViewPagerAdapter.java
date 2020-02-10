package com.TwentyFourTech.brainlimits.BottomNav;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {


    private final List<Fragment> IstFragment =new ArrayList<>();
    private final List<String>IstTitles = new ArrayList<>();



    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int poition) {
        return IstFragment.get(poition);
    }

    @Override
    public int getCount() {
        return IstTitles.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return IstTitles.get(position);
    }


    public void AddFragment (Fragment fragment,String title){
        IstFragment.add(fragment);
        IstTitles.add(title);
    }
}

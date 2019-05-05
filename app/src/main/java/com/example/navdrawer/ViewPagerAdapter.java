package com.example.navdrawer;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import java.util.List;
import java.util.ArrayList;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
   private final List<Fragment> fragmentList = new ArrayList<>();
   private final List<String> FragmentListTitles = new ArrayList<>();
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return fragmentList.get(i);
    }

    @Override
    public int getCount() {
        return FragmentListTitles.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return FragmentListTitles.get(position);
    }

    public void AddFragment(Fragment fragment, String Title)
    {
        fragmentList.add(fragment);
        FragmentListTitles.add(Title);
    }
}

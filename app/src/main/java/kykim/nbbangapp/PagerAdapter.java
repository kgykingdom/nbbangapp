package kykim.nbbangapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by 1002507 on 2015-10-11.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {
    int NUM_PAGES = 2;

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return NUM_PAGES;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                MainFragment01 tab1 = new MainFragment01();
                return tab1;
            case 1:
                Fragment02 tab2 = new Fragment02();
                return tab2;
            default:
                return null;
        }
    }
}

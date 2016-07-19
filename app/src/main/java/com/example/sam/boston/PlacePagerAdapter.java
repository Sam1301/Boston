package com.example.sam.boston;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * FragmentPagerAdapter for viewpager.
 */
public class PlacePagerAdapter extends FragmentPagerAdapter {

    // total number of pages
    private final int NUMBER_OF_PAGES = 4;

    private final Context mContext;

    /**
     * Create a new {@link PlacePagerAdapter} object.
     *
     * @param fm is a fragment manager that will keep each fragment's state in the adapter across
     *           swipes.
     */
    public PlacePagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Returns a fragment for a given page
     *
     * @param position of page in viewpager
     * @return fragment
     */
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new MallsFragment();
            case 1:
                return new RestaurantsFragment();
            case 2:
                return new CollegesFragment();
            case 3:
                return new OfficesFragment();
            default:
                return null;
        }

    }

    /**
     * Returns the total number of pages in viewpager
     *
     * @return number of pages
     */
    @Override
    public int getCount() {
        return NUMBER_OF_PAGES;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.category_malls);
            case 1:
                return mContext.getString(R.string.category_restaurants);
            case 2:
                return mContext.getString(R.string.category_colleges);
            case 3:
                return mContext.getString(R.string.category_offices);
            default:
                return null;
        }
    }
}

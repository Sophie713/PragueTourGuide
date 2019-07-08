package com.example.sophie.praguetourguide.SupportClasses;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class LocationAdapter extends FragmentPagerAdapter {
    private ArrayList<LocationObject> locations;
    private ArrayList<String> titles;


    public LocationAdapter(FragmentManager fragmentManager,
                           ArrayList<LocationObject> locations_src,
                           ArrayList<String> titles_src){
        super(fragmentManager);
        this.locations = locations_src;
        this.titles = titles_src;

    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return super.getItemPosition(object);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return LocationObject(position);
    }

    @Override
    public int getCount() {
        int length = locations.length();
        return length;
    }
}

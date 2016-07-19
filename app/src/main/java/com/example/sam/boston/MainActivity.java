package com.example.sam.boston;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // set the activity UI
        setContentView(R.layout.activity_main);

        // find viewpager
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // initialize PlacePagerAdapter object
        PlacePagerAdapter adapter = new PlacePagerAdapter(this, getSupportFragmentManager());

        // set the adapter onto the viewpager object
        viewPager.setAdapter(adapter);

        // give TabLayout a ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
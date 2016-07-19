package com.example.sam.boston;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MallsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set UI for activity
        setContentView(R.layout.activity_category);

        // add MallsFragment
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new MallsFragment())
                .commit();
    }
}

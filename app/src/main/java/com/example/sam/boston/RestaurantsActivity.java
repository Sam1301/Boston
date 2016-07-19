package com.example.sam.boston;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // set UI for activity
        setContentView(R.layout.places_list);


        // array for places to display in ListView
        String[] places = {"Harvard",
                "Harvard",
                "Harvard",
                "Harvard",
                "Harvard",
                "Harvard",
                "Harvard",
                "Harvard",
                "Harvard",
                "Harvard",
                "Harvard",
                "Harvard",
                "Harvard",
                "Harvard",
                "Harvard",
                "Harvard",
                "Harvard",
                "Harvard",
                "Harvard",
                "Harvard"};

        // array adapter to aid displaying places in ListView
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, places);

        // find ListView and set adapter on it to display the list of places
        ListView listView = (ListView) findViewById(R.id.places_list_view);
        listView.setAdapter(arrayAdapter);
    }
}

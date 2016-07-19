package com.example.sam.boston;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // set UI for activity
        setContentView(R.layout.places_list);

        // array list for places to display in ListView
        ArrayList<Place> places = new ArrayList<>();

        // initialize array list
        places.add(new Place("Harvard", "Cambridge, MA 02138", "+1 617-495-1000"));
        places.add(new Place("Harvard", "Cambridge, MA 02138", "+1 617-495-1000"));
        places.add(new Place("Harvard", "Cambridge, MA 02138", "+1 617-495-1000"));
        places.add(new Place("Harvard", "Cambridge, MA 02138", "+1 617-495-1000"));
        places.add(new Place("Harvard", "Cambridge, MA 02138", "+1 617-495-1000"));
        places.add(new Place("Harvard", "Cambridge, MA 02138", "+1 617-495-1000"));
        places.add(new Place("Harvard", "Cambridge, MA 02138", "+1 617-495-1000"));
        places.add(new Place("Harvard", "Cambridge, MA 02138", "+1 617-495-1000"));
        places.add(new Place("Harvard", "Cambridge, MA 02138", "+1 617-495-1000"));
        places.add(new Place("Harvard", "Cambridge, MA 02138", "+1 617-495-1000"));
        places.add(new Place("Harvard", "Cambridge, MA 02138", "+1 617-495-1000"));
        places.add(new Place("Harvard", "Cambridge, MA 02138", "+1 617-495-1000"));
        places.add(new Place("Harvard", "Cambridge, MA 02138", "+1 617-495-1000"));
        places.add(new Place("Harvard", "Cambridge, MA 02138", "+1 617-495-1000"));
        places.add(new Place("Harvard", "Cambridge, MA 02138", "+1 617-495-1000"));

        // array adapter to aid displaying places in ListView
        ArrayAdapter<Place> arrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, places);

        // find ListView and set adapter on it to display the list of places
        ListView listView = (ListView) findViewById(R.id.places_list_view);
        listView.setAdapter(arrayAdapter);
    }
}

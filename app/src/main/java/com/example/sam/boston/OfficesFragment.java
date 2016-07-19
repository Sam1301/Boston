package com.example.sam.boston;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass to represent Offices page
 */
public class OfficesFragment extends Fragment {


    public OfficesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // array list for places to display in ListView
        ArrayList<Place> places = new ArrayList<>();

        // initialize array list
        places.add(new Place(R.drawable.image, "Harvard", "Cambridge, MA 02138", "+1 617-495-1000"));
        places.add(new Place(R.drawable.image, "Harvard", "Cambridge, MA 02138", "+1 617-495-1000"));
        places.add(new Place(R.drawable.image, "Harvard", "Cambridge, MA 02138", "+1 617-495-1000"));
        places.add(new Place(R.drawable.image, "Harvard", "Cambridge, MA 02138", "+1 617-495-1000"));
        places.add(new Place(R.drawable.image, "Harvard", "Cambridge, MA 02138", "+1 617-495-1000"));
        places.add(new Place(R.drawable.image, "Harvard", "Cambridge, MA 02138", "+1 617-495-1000"));

        // array adapter to aid displaying places in ListView
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // find ListView and set adapter on it to display the list of places
        ListView listView = (ListView) rootView.findViewById(R.id.places_list_view);
        listView.setAdapter(adapter);

        return rootView;
    }

}

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
public class PlacesFragment extends Fragment {


    public PlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // array list for places to display in ListView
        ArrayList<Place> places = new ArrayList<>();

        // initialize array list
        places.add(new Place(R.drawable.place_fenway_park,
                getActivity().getString(R.string.place_fenway_park_name),
                getActivity().getString(R.string.place_fenway_park_address),
                getActivity().getString(R.string.place_fenway_park_phone)));
        places.add(new Place(R.drawable.place_boston_public_garden,
                getActivity().getString(R.string.place_boston_public_garden_name),
                getActivity().getString(R.string.place_boston_public_garden_address),
                getActivity().getString(R.string.place_boston_public_garden_phone)));
        places.add(new Place(R.drawable.place_faneuil_hall,
                getActivity().getString(R.string.place_faneuil_hall_name),
                getActivity().getString(R.string.place_faneuil_hall_address),
                getActivity().getString(R.string.place_faneuil_hall_phone)));
        places.add(new Place(R.drawable.place_boston_harbor,
                getActivity().getString(R.string.place_boston_harbor_name),
                getActivity().getString(R.string.place_boston_harbor_address),
                getActivity().getString(R.string.place_boston_harbor_phone)));

        // array adapter to aid displaying places in ListView
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // find ListView and set adapter on it to display the list of places
        ListView listView = (ListView) rootView.findViewById(R.id.places_list_view);
        listView.setAdapter(adapter);

        return rootView;
    }

}

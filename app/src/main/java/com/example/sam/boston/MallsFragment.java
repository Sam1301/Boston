package com.example.sam.boston;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass to represent Malls page
 */
public class MallsFragment extends Fragment {


    public MallsFragment() {
        // Required empty public constructor
    }


    /**
     * Returns view inflated using places_list.xml
     *
     * @param inflater           inflater
     * @param container          container view in activity
     * @param savedInstanceState saved state bundle
     * @return root view
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // array list for places to display in ListView
        ArrayList<Place> places = new ArrayList<>();

        // initialize array list
        places.add(new Place(R.drawable.mall_commonwealth_avenue,
                getActivity().getString(R.string.mall_commonwealth_avenue_name), 4.6f,
                getActivity().getString(R.string.mall_commonwealth_avenue_address),
                getActivity().getString(R.string.mall_commonwealth_avenue_phone),
                getActivity().getString(R.string.mall_commonwealth_avenue_time)));
        places.add(new Place(R.drawable.mall_copley_place,
                getActivity().getString(R.string.mall_copley_place_name), 4.2f,
                getActivity().getString(R.string.mall_copley_place_address),
                getActivity().getString(R.string.mall_copley_place_phone),
                getActivity().getString(R.string.mall_copley_place_time)));
        places.add(new Place(R.drawable.mall_market_place_center,
                getActivity().getString(R.string.mall_market_place_center_name), 4.0f,
                getActivity().getString(R.string.mall_market_place_center_address),
                getActivity().getString(R.string.mall_market_place_center_phone),
                getActivity().getString(R.string.mall_market_place_center_time)));
        places.add(new Place(R.drawable.mall_the_corner,
                getActivity().getString(R.string.mall_the_corner_name), 4.0f,
                getActivity().getString(R.string.mall_the_corner_address),
                getActivity().getString(R.string.mall_the_corner_phone),
                getActivity().getString(R.string.mall_the_corner_time)));

        // array adapter to aid displaying places in ListView
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // find ListView and set adapter on it to display the list of places
        ListView listView = (ListView) rootView.findViewById(R.id.places_list_view);
        listView.setAdapter(adapter);

        return rootView;
    }

}
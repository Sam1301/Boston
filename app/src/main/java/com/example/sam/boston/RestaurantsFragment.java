package com.example.sam.boston;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass to represent Restaurants page
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // array list for places to display in ListView
        ArrayList<Place> places = new ArrayList<>();

        // initialize array list
        places.add(new Place(R.drawable.restr_grotto,
                getActivity().getString(R.string.restr_grotto_name), 4.3f,
                getActivity().getString(R.string.restr_grotto_address),
                getActivity().getString(R.string.restr_grotto_phone),
                getActivity().getString(R.string.restr_grotto_time)));
        places.add(new Place(R.drawable.restr_mamma_maria,
                getActivity().getString(R.string.restr_mamma_maria_name), 4.4f,
                getActivity().getString(R.string.restr_mamma_maria_address),
                getActivity().getString(R.string.restr_mamma_maria_phone),
                getActivity().getString(R.string.restr_mamma_maria_time)));
        places.add(new Place(R.drawable.restr_marliave,
                getActivity().getString(R.string.restr_marliave_name), 4.1f,
                getActivity().getString(R.string.restr_marliave_address),
                getActivity().getString(R.string.restr_marliave_phone),
                getActivity().getString(R.string.restr_marliave_time)));
        places.add(new Place(R.drawable.restr_mooo_rest,
                getActivity().getString(R.string.restr_mooo_rest_name), 4.1f,
                getActivity().getString(R.string.restr_mooo_rest_address),
                getActivity().getString(R.string.restr_mooo_rest_phone),
                getActivity().getString(R.string.restr_mooo_rest_time)));
        places.add(new Place(R.drawable.restr_neptune_oyster,
                getActivity().getString(R.string.restr_neptune_oyster_name), 4.4f,
                getActivity().getString(R.string.restr_neptune_oyster_address),
                getActivity().getString(R.string.restr_neptune_oyster_phone),
                getActivity().getString(R.string.restr_neptune_oyster_time)));

        // array adapter to aid displaying places in ListView
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // find ListView and set adapter on it to display the list of places
        ListView listView = (ListView) rootView.findViewById(R.id.places_list_view);
        listView.setAdapter(adapter);

        return rootView;
    }

}
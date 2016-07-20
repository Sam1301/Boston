package com.example.sam.boston;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass to represent Colleges page
 */
public class CollegesFragment extends Fragment {


    public CollegesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // array list for places to display in ListView
        ArrayList<Place> places = new ArrayList<>();

        // initialize array list
        places.add(new Place(R.drawable.college_harvard_b_school,
                getActivity().getString(R.string.college_harvard_b_school_name),
                getActivity().getString(R.string.college_harvard_b_school_address),
                getActivity().getString(R.string.college_harvard_b_school_phone)));
        places.add(new Place(R.drawable.college_berkley_col_music,
                getActivity().getString(R.string.college_berkley_col_music_name),
                getActivity().getString(R.string.college_berkley_col_music_address),
                getActivity().getString(R.string.college_berkley_col_music_phone)));
        places.add(new Place(R.drawable.college_boston,
                getActivity().getString(R.string.college_boston_name),
                getActivity().getString(R.string.college_boston_address),
                getActivity().getString(R.string.college_boston_phone)));
        places.add(new Place(R.drawable.college_harvard_med_school,
                getActivity().getString(R.string.college_harvard_med_school_name),
                getActivity().getString(R.string.college_harvard_med_school_address),
                getActivity().getString(R.string.college_harvard_med_school_phone)));
        places.add(new Place(R.drawable.college_tufts_univ,
                getActivity().getString(R.string.college_tufts_univ_name),
                getActivity().getString(R.string.college_tufts_univ_address),
                getActivity().getString(R.string.college_tufts_univ_phone)));
        places.add(new Place(R.drawable.college_harvard_school_ph,
                getActivity().getString(R.string.college_harvard_school_ph_name),
                getActivity().getString(R.string.college_harvard_school_ph_address),
                getActivity().getString(R.string.college_harvard_school_ph_phone)));


        // array adapter to aid displaying places in ListView
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // find ListView and set adapter on it to display the list of places
        ListView listView = (ListView) rootView.findViewById(R.id.places_list_view);
        listView.setAdapter(adapter);

        return rootView;
    }

}

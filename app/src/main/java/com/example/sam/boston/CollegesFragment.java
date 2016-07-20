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
        places.add(new Place(R.drawable.harvard_b_school, "Harvard Business School",
                "Boston, MA 02163", "+1 617-495-6000"));
        places.add(new Place(R.drawable.berkley_col_music, "Berkley College of Music",
                "Boston, MA 02215", "+1 617-266-1400"));
        places.add(new Place(R.drawable.boston_college, "Boston College", "Newton, MA 02467",
                "+1 617-552-8000"));
        places.add(new Place(R.drawable.harvard_med_school, "Harvard Medical School",
                "25 Shattuck St, Boston, MA 02115", "+1 617-432-1000"));
        places.add(new Place(R.drawable.tufts_univ, "Tuft University",
                "419 Boston Ave, Medford, MA 02155", "+1 617-628-5000"));
        places.add(new Place(R.drawable.harvard_school_ph, "Harvard School of Public Health",
                "677 Huntington Ave, Boston, MA 02115", "+1 617-495-1000"));


        // array adapter to aid displaying places in ListView
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // find ListView and set adapter on it to display the list of places
        ListView listView = (ListView) rootView.findViewById(R.id.places_list_view);
        listView.setAdapter(adapter);

        return rootView;
    }

}

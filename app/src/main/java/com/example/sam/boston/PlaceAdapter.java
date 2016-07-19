package com.example.sam.boston;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Adapter {@link PlaceAdapter} for populating ListView with place {@link Place} objects.
 */
public class PlaceAdapter extends ArrayAdapter<Place> {

    /**
     * To initialize memory for Place {@link Place} objects
     *
     * @param context  activity context {@link Context}
     * @param resource layout file for list item
     * @param objects  ArrayList of Place {@link Place} objects
     */
    public PlaceAdapter(Context context, int resource, List<Place> objects) {
        super(context, resource, objects);
    }

    /**
     * Returns the inflated view for ListView
     *
     * @param position    in the array list of {@link Place} objects
     * @param convertView recycled view to populate
     * @param parent      ViewGroup that is used for inflation
     * @return view for the position in the ListView
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // check if view is being reused, otherwise inflate it
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,
                    parent, false);
        }

        // get the object located at this position in the list
        Place currentPlace = getItem(position);

        // find TextView in the list_item.xml with id name
        TextView nameTextView = (TextView) convertView.findViewById(R.id.name);
        nameTextView.setText(currentPlace.getName());

        // find TextView in the list_item.xml with id address
        TextView addressTextView = (TextView) convertView.findViewById(R.id.address);
        addressTextView.setText(currentPlace.getAddress());

        // find TextView in the list_item.xml with id phone
        TextView phoneTextView = (TextView) convertView.findViewById(R.id.phone);
        phoneTextView.setText(currentPlace.getPhoneNumber());

        return convertView;
    }
}

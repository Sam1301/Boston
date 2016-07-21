package com.example.sam.boston;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Adapter {@link PlaceAdapter} for populating ListView with place {@link Place} objects.
 */
public class PlaceAdapter extends ArrayAdapter<Place> {

    /**
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context current context used to inflate the activity
     * @param places  ArrayList of Place {@link Place} objects
     */
    public PlaceAdapter(Context context, ArrayList<Place> places) {
        // This initializes the ArrayAdapter's internal storage for the context and the list.
        // The second argument is used when the ArrayAdapter is populating a single TextView.
        // The adapter is not going to use this value so it can be anything, in this case 0.
        super(context, 0, places);
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

        // find TextView in the list_item.xml with id place_image
        ImageView placeImageView = (ImageView) convertView.findViewById(R.id.place_image);
        placeImageView.setImageResource(currentPlace.getImageResourceId());

        // find TextView in the list_item.xml with id rating
        TextView ratingTextView = (TextView) convertView.findViewById(R.id.float_rating);

        // find RatingBar in the list_item.xml with id rating_bar
        RatingBar ratingBar = (RatingBar) convertView.findViewById(R.id.rating_bar);

        // find ImageView in the list_item.xml with id icon_time
        ImageView timeImageView = (ImageView) convertView.findViewById(R.id.icon_time);

        // find TextView in the list_item.xml with id time
        TextView timeTextView = (TextView) convertView.findViewById(R.id.time);

        if (currentPlace.hasRatingAndTime()) {
            // set value for rating
            ratingTextView.setText(String.format(
                    getContext().getString(R.string.list_item_rating_format_string),
                    currentPlace.getRating()));

            // set value for rating bar
            ratingBar.setRating(currentPlace.getRating());

            // set value for time
            timeTextView.setText(String.format(getContext().getString(R.string.list_item_time_format_string), currentPlace.getTime()));
        } else {
            // remove rating, rating bar and time from list item layout for PlacesFragment and
            // CollegesFragment
            ratingTextView.setVisibility(View.GONE);
            ratingBar.setVisibility(View.GONE);
            timeImageView.setVisibility(View.GONE);
            timeTextView.setVisibility(View.GONE);
        }

        // return view
        return convertView;
    }
}

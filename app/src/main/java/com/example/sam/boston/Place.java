package com.example.sam.boston;

/**
 * {@link Place} Stores the information of every place like image {@link Place#mImageResourceId},
 * address {@link Place#mAddress}, rating {@link Place#mRating}, phone number
 * {@link Place#mPhoneNumber} and hours open {@link Place#mTime}.
 */
public class Place {

    // TODO: add functionality for storing image
    // resource id for image
    private int mImageResourceId;

    // name
    private String mName;

    // sentinel value for rating
    private final float NO_RATING_VALUE = -1.0f;

    // rating
    private float mRating = NO_RATING_VALUE;

    // address
    private String mAddress;

    // phone number
    // using a string data type to account for phone numbers starting with zero
    private String mPhoneNumber;

    // opens at
    private String mTime;

    /**
     * Constructor to initialize image resource id, name, address and phone number fields for a place
     * Used by {@link PlacesFragment} and {@link CollegesFragment}
     *
     * @param imageResourceId {@link Place#mImageResourceId}
     * @param name {@link Place#mName}
     * @param address {@link Place#mAddress}
     * @param phoneNumber {@link Place#mPhoneNumber}
     */
    public Place(int imageResourceId, String name, String address, String phoneNumber) {
        mImageResourceId = imageResourceId;
        mName = name;
        mPhoneNumber = phoneNumber;
        mAddress = address;
    }

    /**
     * Constructor to initialize name, rating, address ,phone number and opening time fields for a
     * place.
     * Used by {@link MallsFragment} and {@link RestaurantsFragment}
     *
     * @param name {@link Place#mName}
     * @param rating {@link Place#mRating}
     * @param address {@link Place#mAddress}
     * @param phoneNumber {@link Place#mPhoneNumber}
     * @param time {@link Place#mTime}
     */
    public Place(int imageResourceId, String name, float rating, String address, String phoneNumber, String time) {
        mImageResourceId = imageResourceId;
        mName = name;
        mPhoneNumber = phoneNumber;
        mAddress = address;
        mRating = rating;
        mTime = time;
    }

    /**
     * Return name of place
     *
     * @return {@link Place#mName}
     */
    public String getName() {
        return mName;
    }

    /**
     * Return rating of mall or restaurant
     *
     * @return {@link Place#mRating}
     */
    public float getRating() {
        return mRating;
    }

    /**
     * Return image of place
     *
     * @return {@link Place#mImageResourceId}
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


    /**
     * Return time at which the place opens
     *
     * @return {@link Place#mTime}
     */
    public String getTime() {
        return mTime;
    }


    /**
     * Return address of place
     *
     * @return {@link Place#mAddress}
     */
    public String getAddress() {
        return mAddress;
    }

    /**
     * Return phone number of place
     *
     * @return {@link Place#mPhoneNumber}
     */
    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    /**
     * Function to return true if place object {@link Place} is storing Malls or Restaurant data
     *
     * @return return true when PLace {@link Place} object has value for rating and time fields
     */
    public boolean hasRatingAndTime() {
        return mRating != NO_RATING_VALUE;
    }
}

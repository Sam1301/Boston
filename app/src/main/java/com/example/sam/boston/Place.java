package com.example.sam.boston;

/**
 * {@link Place} Stores the information of every place like image {@link Place#mImageResourceId},
 * address {@link Place#mAddress}, rating {@link Place#mRating}, phone number
 * {@link Place#mPhoneNumber} and hours open {@link Place#mTimeInMillis}.
 */
public class Place {

    // TODO: add functionality for storing image
    // resource id for image
    private int mImageResourceId;

    // name
    private String mName;

    // rating
    private float mRating;

    // address
    private String mAddress;

    // phone number
    // using a string data type to account for phone numbers starting with zero
    private String mPhoneNumber;

    // opens at
    private long mTimeInMillis;

    /**
     * Constructor to initialize name, address and phone number fields for a place
     * Used by {@link OfficesActivity} and {@link CollegesActivity}
     *
     * @param name {@link Place#mName}
     * @param address {@link Place#mAddress}
     * @param phoneNumber {@link Place#mPhoneNumber}
     */
    public Place(String name, String address, String phoneNumber) {
        mName = name;
        mPhoneNumber = phoneNumber;
        mAddress = address;
    }

    /**
     * Constructor to initialize name, rating, address ,phone number and opening time fields for a
     * place.
     * Used by {@link MallsActivity} and {@link RestaurantsActivity}
     *
     * @param name {@link Place#mName}
     * @param rating {@link Place#mRating}
     * @param address {@link Place#mAddress}
     * @param phoneNumber {@link Place#mPhoneNumber}
     * @param time {@link Place#mTimeInMillis}
     */
    public Place(String name, float rating, String address, String phoneNumber, long time) {
        mName = name;
        mPhoneNumber = phoneNumber;
        mAddress = address;
        mRating = rating;
        mTimeInMillis = time;
    }

    @Override
    public String toString() {
        return mName + "\n" + mAddress + "\n" + mPhoneNumber;
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
     * @return {@link Place#mTimeInMillis}
     */
    public long getTimeInMillis() {
        return mTimeInMillis;
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

    // TODO: Handle case for different constructor invocation (for RestaurantsActivity and MallsActivity)
}

package com.example.sam.boston;

/**
 * {@link Place} Stores the information of every place like image {@link Place#mImageResourceId},
 * address {@link Place#mAddress}, rating {@link Place#mRating}, phone number
 * {@link Place#mPhoneNumber} and hours open {@link Place#mTimeInMillis}.
 */
public class Place {
    // resource id for image
    int mImageResourceId;

    // name
    String mName;

    // rating
    float mRating;

    // address
    String mAddress;

    // phone number
    // using a string data type to account for phone numbers starting with zero
    String mPhoneNumber;

    // opens at
    long mTimeInMillis;

    // TODO: add functionality for storing image

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
}

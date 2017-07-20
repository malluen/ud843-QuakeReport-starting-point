package com.example.android.quakereport;

/**
 * Created by malluen on 7/20/17.
 */

public class earthquake {

    private String mMagnitude;
    private String mLocation;
    private String mDate;

    /**
     * Constructs the earthquake object
     * @param magnitude
     * @param location
     * @param date
     */
    public earthquake(String magnitude, String location, String date){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    /**
     *
     * @return mMagnitude the magnitude of the earthquake
     */
    public String getmMagnitude(){return mMagnitude;}


    /**
     *
     * @return mLocation the location of the earthquake
     */
    public String getmLocation(){return mLocation;}


    /**
     *
     * @return mDate the date the earthquake happened
     */
    public String getmDate(){return mDate;}
}

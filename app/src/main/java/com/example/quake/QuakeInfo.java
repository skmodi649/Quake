package com.example.quake;

public class QuakeInfo {

    // Magnitude of the Earthquake
    private final String mVersionMag;

    // Name of the Earthquake location
    private final String mVersionPlace;

    // Date of Earthquake
    private final String mVersionDate;

    // Time of Earthquake
    private final String mVersionTime;

    // More details of the Place
    private final String mVersionPlaceDetail;

    // Creating a constructor for the objects
    public QuakeInfo(String vMag, String vPlace, String vDate, String vTime, String vPlaceDetail) {
        mVersionDate = vDate;
        mVersionMag = vMag;
        mVersionPlace = vPlace;
        mVersionTime = vTime;
        mVersionPlaceDetail = vPlaceDetail;
    }

    /**
     * Getting magnitude of the Earthquake
     */

    public String getVersionMag() {
        return mVersionMag;
    }

    /**
     * Getting locations of the Earthquake
     */

    public String getVersionPlace() {
        return mVersionPlace;
    }

    /**
     * Getting date of Earthquake
     */

    public String getVersionDate() {
        return mVersionDate;
    }

    /**
     * Getting time of Earthquake
     */

    public String getVersionTime() {
        return mVersionTime;
    }

    /**
     * Getting detail of Place
     */

    public String getVersionPlaceDetail()

    {
        return mVersionPlaceDetail;
    }

}

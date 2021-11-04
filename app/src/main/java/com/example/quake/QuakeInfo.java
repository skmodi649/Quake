package com.example.quake;

public class QuakeInfo {

    // Magnitude of the Earthquake
    private final double mVersionMag;

    // Name of the Earthquake location
    private final String mVersionPlace;

    // Date of Earthquake
    private final String mVersionDate;

    // Time of Earthquake
    private final String mVersionTime;

    // More details of the Place
    private final String mVersionPlaceDetail;

    // Url of the Website
    private final String Url;

    // Creating a constructor for the objects
    public QuakeInfo(double vMag, String vPlace, String vDate, String vTime, String vPlaceDetail, String vUrl) {
        mVersionDate = vDate;
        mVersionMag = vMag;
        mVersionPlace = vPlace;
        mVersionTime = vTime;
        mVersionPlaceDetail = vPlaceDetail;
        Url = vUrl;
    }

    /**
     * Getting magnitude of the Earthquake
     */

    public double getVersionMag() {
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

    /**
     * Getting URL of the Website
     */

    public String getVersionUrl() { return Url; }

}

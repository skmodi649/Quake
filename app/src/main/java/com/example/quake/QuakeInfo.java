package com.example.quake;

public class QuakeInfo {

    // Magnitude of the Earthquake
    private final String mVersionMag;

    // Name of the Earthquake location
    private final String mVersionPlace;

    // Date of Earthquake
    private final String mVersionDate;

    //Time of Earthquake
    private final String mVersionTime;

    // Creating a constructor for the objects
    public QuakeInfo(String vMag , String vPlace , String vDate , String vTime)
    {
        mVersionDate = vDate;
        mVersionMag = vMag;
        mVersionPlace = vPlace;
        mVersionTime = vTime;
    }

    /**
     * Getting magnitude of the Earthquake
     */

    public String getVersionMag(){
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

    public String getVersionDate(){
        return mVersionDate;
    }
}

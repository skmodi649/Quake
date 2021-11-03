package com.example.quake;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating a demo list of Earthquake locations

        // ArrayList<QuakeInfo> list = new ArrayList<QuakeInfo>();

        // list.add(new QuakeInfo("7.2" , "San Fransisco" , "Feb 2,2016"));
        // list.add(new QuakeInfo("6.1" , "London" , "July 20,2015"));
        // list.add(new QuakeInfo("3.9" , "Tokyo" , "Nov 10,2014"));
        // list.add(new QuakeInfo("5.4" , "Mexico City" , "May 3,2014"));
        // list.add(new QuakeInfo("5.3" , "Patna" , "April 28,2015"));
        // list.add(new QuakeInfo("7.8" , "Vice City" , "Aug 19,1948"));
        // list.add(new QuakeInfo("9.1" , "Peshawar" , "Nov 10,2021"));
        // list.add(new QuakeInfo("7.3" , "Lahore" , "Dec 10,2022"));
        // list.add(new QuakeInfo("4.9" , "Delhi" , "June 15,2012"));
        // list.add(new QuakeInfo("5.8" , "Kolkata" , "Jan 16,2005"));
        // list.add(new QuakeInfo("6.5" , "Chennai" , "Oct 17,2007"));
        // list.add(new QuakeInfo("7.7" , "Bihar" , "Feb 14,2012"));
        // list.add(new QuakeInfo("8.9" , "Kerala" , "March 16,1989"));


        /**
         * Now using JSON object Arraylist
         * They correspond to the QueryUtils class
         */

        ArrayList list = QueryUtils.extractEarthquakes();


        // Create a new {@link ArrayAdapter} of earthquake
        QuakeInfoAdapter quakeAdapter = new QuakeInfoAdapter(this , list);

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = findViewById(R.id.list);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(quakeAdapter);
    }
}
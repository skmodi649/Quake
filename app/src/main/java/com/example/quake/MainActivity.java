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


        /*
          Now using JSON object Arraylist
          They correspond to the QueryUtils class
         */

        ArrayList<QuakeInfo> list = QueryUtils.extractEarthquakes();


        // Create a new {@link ArrayAdapter} of earthquake
        QuakeInfoAdapter quakeAdapter = new QuakeInfoAdapter(this , list);

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = findViewById(R.id.list);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(quakeAdapter);
    }
}
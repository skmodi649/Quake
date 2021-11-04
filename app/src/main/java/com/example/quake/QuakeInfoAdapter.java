package com.example.quake;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class QuakeInfoAdapter extends ArrayAdapter<QuakeInfo> {


     private Activity context;


    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *  @param context        The current context. Used to inflate the layout file.
     * @param quakeInfos A List of AndroidFlavor objects to display in a list
     */

    public  QuakeInfoAdapter(Context context, ArrayList<QuakeInfo> quakeInfos) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for three TextViews , the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, quakeInfos);
    }

    /**
         * Provides a view for an AdapterView (ListView, GridView, etc.)
         *
         * @param position The position in the list of data that should be displayed in the
         *                 list item view.
         * @param convertView The recycled view to populate.
         * @param parent The parent ViewGroup that is used for inflation.
         * @return The View for the position in the AdapterView.
         */

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {



            // Check if the existing view is being reused, otherwise inflate the view
            View listItemView = convertView;
            if(listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.activity_list, parent, false);
            }


            // Get the {@link QuakeInfo} object located at this position in the list
            QuakeInfo currentQuakeInfo = getItem(position);


            // Find the TextView with view ID magnitude
            TextView magnitudeView =  listItemView.findViewById(R.id.version_mag);
            // Format the magnitude to show 1 decimal place
            String formattedMagnitude = formatMagnitude(currentQuakeInfo.getVersionMag());
            // Display the magnitude of the current earthquake in that TextView
            magnitudeView.setText(formattedMagnitude);

            // Set the proper background color on the magnitude circle.
            // Fetch the background from the TextView, which is a GradientDrawable.
            GradientDrawable magnitudeCircle = (GradientDrawable) magnitudeView.getBackground();
            // Get the appropriate background color based on the current earthquake magnitude
            int magnitudeColor = getMagnitudeColor(currentQuakeInfo.getVersionMag());
            // Set the color on the magnitude circle
            magnitudeCircle.setColor(magnitudeColor);

            // Find the TextView in the activity_list.xml layout with the ID version_place
            TextView placeTextView = listItemView.findViewById(R.id.version_place);
            // Get the version place from the current QuakeInfo object and
            // set this text on the place TextView
            placeTextView.setText(currentQuakeInfo.getVersionPlace());

            // Find the TextView in the activity_list.xml layout with the ID version_date
            TextView dateTextView = listItemView.findViewById(R.id.version_date);
            // Get the version date from the current QuakeInfo object and
            // set the text to date TextView
            dateTextView.setText(currentQuakeInfo.getVersionDate());

            //Find the TextView in the activity_list.xml layout with the ID version_time
            TextView timeTextView = listItemView.findViewById(R.id.version_time);
            // Get the version time from the current QuakeInfo object and
            // set the text to time TextView
            timeTextView.setText(currentQuakeInfo.getVersionTime());

            //Find the TextView in the activity_list.xml layout with the ID version_placedetail
            TextView detailTextView = listItemView.findViewById(R.id.version_placedetail);
            // Get the version time from the current QuakeInfo object and
            // set the text to time TextView
            detailTextView.setText(currentQuakeInfo.getVersionPlaceDetail());

            // Return the whole list item layout (containing 3 TextViews)
            // so that it can be shown in the ListView
            return listItemView;

        }

    /**
     * Return the formatted magnitude string showing 1 decimal place (i.e. "3.2")
     * from a decimal magnitude value.
     */
    private String formatMagnitude(double magnitude) {
        DecimalFormat magnitudeFormat = new DecimalFormat("0.0");
        return magnitudeFormat.format(magnitude);
    }



    private int getMagnitudeColor(double magnitude) {
        int magnitudeColorResourceId;
        int magnitudeFloor = (int) Math.floor(magnitude);
        switch (magnitudeFloor) {
            case 0:
            case 1:
                magnitudeColorResourceId = R.color.magnitude1;
                break;
            case 2:
                magnitudeColorResourceId = R.color.magnitude2;
                break;
            case 3:
                magnitudeColorResourceId = R.color.magnitude3;
                break;
            case 4:
                magnitudeColorResourceId = R.color.magnitude4;
                break;
            case 5:
                magnitudeColorResourceId = R.color.magnitude5;
                break;
            case 6:
                magnitudeColorResourceId = R.color.magnitude6;
                break;
            case 7:
                magnitudeColorResourceId = R.color.magnitude7;
                break;
            case 8:
                magnitudeColorResourceId = R.color.magnitude8;
                break;
            case 9:
                magnitudeColorResourceId = R.color.magnitude9;
                break;
            default:
                magnitudeColorResourceId = R.color.magnitude10plus;
                break;
        }
        return ContextCompat.getColor(getContext() , magnitudeColorResourceId);
    }
}

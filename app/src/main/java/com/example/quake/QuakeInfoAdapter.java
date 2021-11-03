package com.example.quake;

import android.widget.ArrayAdapter;
import android.app.Activity;
import java.util.ArrayList;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;

public class QuakeInfoAdapter extends ArrayAdapter<QuakeInfo> {


    private Activity context;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *  @param context        The current context. Used to inflate the layout file.
     * @param quakeInfos A List of AndroidFlavor objects to display in a list
     */

    public  QuakeInfoAdapter(Activity context, ArrayList<QuakeInfo> quakeInfos) {
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


            // Find the TextView in the activity_list.xml layout with the ID version_mag
            TextView MagTextView = listItemView.findViewById(R.id.version_mag);
            // Get the version name from the current AndroidFlavor object and
            // set this text on the name TextView
            MagTextView.setText(currentQuakeInfo.getVersionMag());

            // Find the TextView in the activity_list.xml layout with the ID version_place
            TextView placeTextView = listItemView.findViewById(R.id.version_place);
            // Get the version number from the current QuakeInfo object and
            // set this text on the number TextView
            placeTextView.setText(currentQuakeInfo.getVersionPlace());

            // Find the TextView in the activity_list.xml layout with the ID version_date
            TextView dateTextView = listItemView.findViewById(R.id.version_date);
            // Get the image resource ID from the current QuakeInfo object and
            // set the image to iconView
            dateTextView.setText(currentQuakeInfo.getVersionDate());

            //Find the TextView in the activity_list.xml layout with the ID version_time
            TextView timeTextView = listItemView.findViewById(R.id.version_time);

            // Return the whole list item layout (containing 3 TextViews)
            // so that it can be shown in the ListView
            return listItemView;

        }


}

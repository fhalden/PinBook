package com.example.android.pinbook;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * {@link CameraAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Camera} objects.
 */
public class CameraAdapter extends ArrayAdapter<Camera>  {

    /** Resource ID for the background color for this list of cameras */
    private int mColorResourceId;

    /**
     * Create a new {@link CameraAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param cameras is the list of {@link Camera}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of cameras
     */
    public CameraAdapter(Context context, ArrayList<Camera> cameras, int colorResourceId) {
        super(context, 0, cameras);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.cameras_list_item_layout, parent, false);
        }

        // Get the {@link Camera} object located at this position in the list
        Camera currentCamera = getItem(position);

        // Find the TextView in the camera_list_item.xml layout with the ID camera_name.
        TextView cameraNameTextView = (TextView) listItemView.findViewById(R.id.camera_name);
        // Get the camera name from the currentCamera object and set this text on
        // the camera name TextView.
        cameraNameTextView.setText(currentCamera.getCameraName());

        // Find the TextView in the camera_list_item.xml layout with the ID film_type.
        TextView filmTypeTextView = (TextView) listItemView.findViewById(R.id.film_type);
        // Get the film type from the currentCamera object and set this text on
        // the film type TextView.
        filmTypeTextView.setText(currentCamera.getFilmType());

        // Find the ImageView in the camera_list_item.xml layout with the ID camera_icon.
        ImageView cameraIcon = (ImageView) listItemView.findViewById(R.id.camera_icon);
        cameraIcon.setImageResource(currentCamera.getImageResourceId());
        // Make sure the view is visible
        cameraIcon.setVisibility(View.VISIBLE);

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.camera_text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
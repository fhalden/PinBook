package com.example.android.pinbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class CameraChoiceActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_design);

        Spinner cameraSpinner = (Spinner) findViewById(R.id.camera_model_spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> cameraAdapter = ArrayAdapter.createFromResource(this,
                R.array.cameras_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        cameraAdapter.setDropDownViewResource(android.R.layout.simple_selectable_list_item);
// Apply the adapter to the spinner
        cameraSpinner.setAdapter(cameraAdapter);



        Spinner filmSpinner = (Spinner) findViewById(R.id.film_spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.films_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_selectable_list_item);
// Apply the adapter to the spinner
        filmSpinner.setAdapter(adapter);



    }

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}

package com.example.android.pinbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // # Start the activity connect to the
//# specified class

                Intent i = new Intent(getBaseContext(), CameraChoiceActivity.class);
                startActivity(i);
            }
        });

        // Create a list of cameras
        final ArrayList<Camera> cameras = new ArrayList<Camera>();
        cameras.add(new Camera("Ondu 6x9",  R.drawable.ondu_6x9_front1));
        cameras.add(new Camera("Ondu 4x5", R.drawable.ondu_4x5_front_open));
        cameras.add(new Camera("Ondu 8x10", R.drawable.ondu_8x10_front));

Log.v("Array of cameras","created");
        // Create an {@link CameraAdapter}, whose data source is a list of {@link Camera}s. The
        // adapter knows how to create list items for each item in the list.
        CameraAdapter adapter = new CameraAdapter(this, cameras, R.color.colorSecondary);
        Log.v("Adaptor variable","created");
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // camera_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link CameraAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

package com.r4497.fullbodyworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button exerciseButton = (Button) findViewById(R.id.exercisesbtn);
        exerciseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startExercisesIntent = new Intent(getApplicationContext(),ExerciseListActivity.class);
                startActivity(startExercisesIntent);
            }
        });

        Button mapsButton = (Button) findViewById(R.id.mapsbtn);
        mapsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startMapsIntent = new Intent(getApplicationContext(),CaliMapsActivity.class);
                startActivity(startMapsIntent);
            }
        });
    }




}

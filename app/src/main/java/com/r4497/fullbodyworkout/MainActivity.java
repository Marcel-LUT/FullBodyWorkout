package com.r4497.fullbodyworkout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

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

        Button youtubeBtn = findViewById(R.id.youtubebtn);
        youtubeBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent youtubeIntent = new Intent(Intent.ACTION_VIEW);
                youtubeIntent.setData((Uri.parse("https://www.youtube.com/watch?v=8J2pCRDTK9o")));
                startActivity(youtubeIntent);
            }
        });
    }




}

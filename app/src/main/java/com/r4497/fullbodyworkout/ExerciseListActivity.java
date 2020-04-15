package com.r4497.fullbodyworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ExerciseListActivity extends AppCompatActivity {

    ListView ExerciseListView;
    String[] exercises;
    String[] muscles;
    String[] repetitions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_list);

        Resources res = getResources();
        ExerciseListView = (ListView) findViewById(R.id.ExerciseListView);
        exercises = res.getStringArray(R.array.exercises);
        muscles = res.getStringArray(R.array.muscles);
        repetitions = res.getStringArray(R.array.Repetitions);

        ExerciseAdapter exerciseAdapter = new ExerciseAdapter(this, exercises, muscles, repetitions);
        ExerciseListView.setAdapter(exerciseAdapter);

        ExerciseListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent showExerciseActivity =
                        new Intent(getApplicationContext(), ExerciseDetailActivity.class);
                showExerciseActivity.putExtra("com.r4497.fullbodyworkout.EX_INDEX", position);
                startActivity(showExerciseActivity);


            }
        });

    }
}

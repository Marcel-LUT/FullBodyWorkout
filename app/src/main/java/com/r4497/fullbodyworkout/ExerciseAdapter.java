package com.r4497.fullbodyworkout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/*
Build the class according to the ItemAdapter Class from earlier this day
which I coded according to the video was given in moodle
 */
public class ExerciseAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    String[] exercises;
    String[] muscles;
    String[] repetitions;

    public ExerciseAdapter (Context c, String[] exe, String[] mus, String[] rep){
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        exercises = exe;
        muscles = mus;
        repetitions = rep;
    }


    @Override
    public int getCount() {
        return exercises.length;
    }

    @Override
    public Object getItem(int position) {
        return exercises[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = mInflater.inflate(R.layout.exercise_listview_detail, null);
        TextView exerciseTextView = (TextView) v.findViewById(R.id.exerciseTextView);
        TextView muscleTextView = (TextView) v.findViewById(R.id.musclesTextView);
        TextView repetitionsTextView = (TextView) v.findViewById(R.id.repetitionsTextView);

        String ex = exercises[position];
        String mu = muscles[position];
        String re = repetitions[position];

        exerciseTextView.setText(ex);
        muscleTextView.setText(mu);
        repetitionsTextView.setText(re);

        return v;

    }
}

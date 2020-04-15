package com.r4497.fullbodyworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Display;
import android.widget.ImageView;

public class ExerciseDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_detail);

        Intent in = getIntent();
        int index = in.getIntExtra("com.r4497.fullbodyworkout.EX_INDEX", -1);


        if (index > -1) {

            int pic = getImg(index);
            ImageView imgv = findViewById(R.id.exerciseImageView);
            scaleImg(imgv, pic);
        }

    }


    private int getImg (int i) {
        switch (i) {
            case 0:
                return R.drawable.archer;
            case 1:
                return R.drawable.dips;
            case 2:
                return R.drawable.pullup;
            case 3:
                return R.drawable.pike;
            case 4:
                return R.drawable.star;
            case 5:
                return R.drawable.plank;
            case 6:
                return R.drawable.pistol;
            default:
                return -1;
        }
    }
    private void scaleImg(ImageView img, int pic) {
        Display screen = getWindowManager().getDefaultDisplay();
        BitmapFactory.Options options = new BitmapFactory.Options();

        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), pic, options);

        int imgWidth = options.outWidth;
        int screenWidth = screen.getWidth();
        if (imgWidth > screenWidth){
            int ratio = Math.round( (float) imgWidth / (float) screenWidth);
            options.inSampleSize = ratio;
        }

        options.inJustDecodeBounds = false;
        Bitmap scaledImg = BitmapFactory.decodeResource(getResources(), pic, options);
        img.setImageBitmap(scaledImg);

    }

}

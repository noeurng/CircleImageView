package com.noeurng.circleimageview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            ImageView imageView = (ImageView) findViewById(R.id.iv_pic);
            Glide.with(this)
                    .load(R.drawable.profile_pic)
                    .transform(new CircleTransform(this))
                    .into(imageView);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

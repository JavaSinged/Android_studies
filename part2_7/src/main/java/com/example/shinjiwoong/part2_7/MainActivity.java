package com.example.shinjiwoong.part2_7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.img);

        //animation get
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.in);
        anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.move);

                anim.setFillAfter(true);
                imageView.setAnimation(anim);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
        imageView.setAnimation(anim);
    }
}

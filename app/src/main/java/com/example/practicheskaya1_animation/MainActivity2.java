package com.example.practicheskaya1_animation;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private ImageView animationIV;

    private AnimationDrawable frameAnimation;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        backButton = findViewById(R.id.buttonBack);

        animationIV=findViewById(R.id.animImageView);

        Animation rotateAnimation = AnimationUtils.loadAnimation(this,R.anim.button_animation_right);

        frameAnimation=(AnimationDrawable) animationIV.getDrawable();
        animationIV.startAnimation(rotateAnimation);
        frameAnimation.start();

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frameAnimation.stop();
                backButton.startAnimation(rotateAnimation);
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.back_anim_1,0);
            }
        });
    }

}
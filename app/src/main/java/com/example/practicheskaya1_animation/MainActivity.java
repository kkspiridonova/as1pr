package com.example.practicheskaya1_animation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button rabbitButton;
    private Button nonrabbitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rabbitButton = findViewById(R.id.rabbitBtn);
        Animation scaleAnimation= AnimationUtils.loadAnimation(this,R.anim.button_animation);

        rabbitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rabbitButton.startAnimation(scaleAnimation);
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_right,0);
            }
        });



        nonrabbitButton = findViewById(R.id.notrabbitBtn);
        Animation scaleAnimation2 = AnimationUtils.loadAnimation(this,R.anim.second_button_animation);

        nonrabbitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nonrabbitButton.startAnimation(scaleAnimation2);
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_up,0);
            }
        });
    }

 
}
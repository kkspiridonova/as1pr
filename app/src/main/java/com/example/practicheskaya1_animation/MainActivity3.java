package com.example.practicheskaya1_animation;

import android.content.Intent;
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

public class MainActivity3 extends AppCompatActivity {
    private ImageView img;
    private Button backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        img=findViewById(R.id.img_blink);
        backButton = findViewById(R.id.buttonBack);

        Animation backAnim = AnimationUtils.loadAnimation(this,R.anim.button_animation_left);
        Animation blinkAnimation= AnimationUtils.loadAnimation(this,R.anim.common_animation);
        img.startAnimation(blinkAnimation);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backButton.startAnimation(backAnim);
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.back_anim_2,0);
            }
        });
    }
}
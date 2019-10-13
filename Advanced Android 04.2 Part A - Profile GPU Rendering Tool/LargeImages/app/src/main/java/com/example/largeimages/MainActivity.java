package com.example.largeimages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int toggle = 0;
    private TextView textButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textButton = findViewById(R.id.textButton);
        textButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                changeImage(textButton);
            }
        });
    }

    public void changeImage(View view) {

        if (toggle == 0) {
            view.setBackgroundResource(R.drawable.dinosaur_medium);
            toggle = 1;
        }

        else {

            try {
                Thread.sleep(32); // two refreshes
            }

            catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            view.setBackgroundResource(R.drawable.ankylo);
            toggle = 0;
        }
    }
}

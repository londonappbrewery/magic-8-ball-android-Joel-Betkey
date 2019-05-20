package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView ballDisplay;
    private static final int[] ballArray = {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};
    private Button askBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*null pointer exception from
         *  askBtn.findViewById(R.id.askButton);
        ballDisplay.findViewById(R.id.image_8ball);
        correct to
         */
        askBtn = findViewById(R.id.askButton);
        ballDisplay = findViewById(R.id.image_8ball);

        askBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(5);

                ballDisplay.setImageResource(ballArray[number]);

            }
        });

    }


}

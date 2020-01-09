package com.example.firstjavaapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] seasons = {"春", "夏", "秋", "冬"};
        final int maxIndex = seasons.length;
        final TextView mainText = findViewById(R.id.mainText);
        Button nextButton = findViewById(R.id.nextButton);
        Button previousButton = findViewById(R.id.previousButton);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                mainText.setText(seasons[count % maxIndex]);
            }
        });

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                if (count < 0) {
                    count = maxIndex - 1;
                }
                mainText.setText(seasons[count % maxIndex]);
            }
        });
    }
}

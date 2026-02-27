package com.example.androiduitesting;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {
    TextView cityTextView;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        cityTextView = findViewById(R.id.cityTextView);
        backButton = findViewById(R.id.backButton);

        String cityName = getIntent().getStringExtra("cityName");

        cityTextView.setText(cityName);

        backButton.setOnClickListener(v -> finish());
    }
}

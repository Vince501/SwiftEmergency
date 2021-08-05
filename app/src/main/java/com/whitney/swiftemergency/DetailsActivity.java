package com.whitney.swiftemergency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    TextView markertxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        markertxt = findViewById(R.id.marker);
        //get data from maps activity
        String title = getIntent().getStringExtra("title");
        markertxt.setText(title);
    }
}
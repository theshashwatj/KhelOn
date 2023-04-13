package com.example.khelon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BadmintonActivity extends AppCompatActivity {

    ImageView badmintonBackbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badminton);

        badmintonBackbtn = findViewById(R.id.badmintonBackbtn);

        badmintonBackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BadmintonActivity.super.onBackPressed();
                finish();
            }
        });
    }
}
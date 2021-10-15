package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class Struk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_struk);

        ImageButton home = findViewById(R.id.btnHome);
        home.setOnClickListener(v -> openHome());
    }

    private void openHome() {
        Intent h = new Intent(Struk.this, HomepageUser.class);
        startActivity(h);
    }
}
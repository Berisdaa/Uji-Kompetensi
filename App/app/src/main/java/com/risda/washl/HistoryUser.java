package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class HistoryUser extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_user);

        ImageButton home = findViewById(R.id.btnBackHistoryUser);
        home.setOnClickListener(v -> openHome());

    }

    private void openHome() {
        Intent h = new Intent(HistoryUser.this, HomepageUser.class);
        startActivity(h);
    }
}
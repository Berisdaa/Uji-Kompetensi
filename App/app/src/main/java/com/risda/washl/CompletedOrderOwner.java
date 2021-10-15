package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class CompletedOrderOwner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completed_order_owner);
        ImageButton home = findViewById(R.id.btnBackHome4);
        home.setOnClickListener(v -> openHome());
    }

    private void openHome() {
        Intent h = new Intent(CompletedOrderOwner.this, HomepageOwner.class);
        startActivity(h);
        finish();
    }
}
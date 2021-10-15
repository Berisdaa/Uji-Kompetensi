package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class CustomerList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_list);
        ImageButton home = findViewById(R.id.btnBackHome);
        home.setOnClickListener(v -> openHome());
    }

    private void openHome() {
        Intent h = new Intent(CustomerList.this, HomepageOwner.class);
        startActivity(h);
        finish();
    }
}
package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class FormOrder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_order);

        ImageButton home = findViewById(R.id.btnBackSearch);
        home.setOnClickListener(v -> openSearch());
    }

    private void openSearch() {
        Intent s = new Intent(FormOrder.this, SearchBar.class);
        startActivity(s);
        finish();
    }
}
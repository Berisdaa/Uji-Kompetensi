package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;



public class SearchBar extends AppCompatActivity {

    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_bar);

        button = (Button) findViewById(R.id.btnNextForm);
        button.setOnClickListener(v -> openForm());



    }

    private void openForm() {
        Intent h = new Intent(SearchBar.this, FormOrder.class);
        startActivity(h);
    }
}
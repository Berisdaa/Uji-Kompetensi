package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class HomepageUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage_user);

        ImageButton struk = findViewById(R.id.btnStruk);
        ImageButton history = findViewById(R.id.btnHistory);
        ImageButton searchBar = findViewById(R.id.btnSearchBar);

        struk.setOnClickListener(v -> openStruk());
        history.setOnClickListener(v -> openHistory());
        searchBar.setOnClickListener(v -> openSearchBar());
    }

    private void openSearchBar() {
        Intent s = new Intent(HomepageUser.this, SearchBar.class);
        startActivity(s);
    }

    private void openHistory() {
        Intent h = new Intent(HomepageUser.this, HistoryUser.class);
        startActivity(h);
    }

    private void openStruk() {
        Intent s = new Intent(HomepageUser.this, Struk.class);
        startActivity(s);
    }


}
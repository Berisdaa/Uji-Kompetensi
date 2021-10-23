package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import java.util.ArrayList;

public class HistoryUser extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_user);

        ImageButton home = findViewById(R.id.btnBackHistoryUser);
        home.setOnClickListener(v -> openHome());

        RecyclerView recyclerView = findViewById(R.id.recyclerHistoryUsr);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        historyUserStr[] historyUserStrs = new historyUserStr[]{
                new historyUserStr("3","Diana Laundry","Gedangan","Cuci Kering"),
                new historyUserStr("2","Diana Laundry","Gedangan","Cuci Kering"),
                new historyUserStr("4","Sarah Laundry","Candi","Cuci Basah"),
                new historyUserStr("5","Pras Laundry","Buduran","Setrika"),
                new historyUserStr("7","Pras Laundry","Buduran","Cuci Setrika"),
                new historyUserStr("10","Pras Laundry","Buduran","Cuci Setrika"),
                new historyUserStr("9","Sarah laundry","Candi","Cuci Basah"),
        };

       historyUserAdapter HistoryUserAdapter = new historyUserAdapter(historyUserStrs, HistoryUser.this);
       recyclerView.setAdapter(HistoryUserAdapter);

    }


    private void openHome() {
        Intent h = new Intent(HistoryUser.this, HomepageUser.class);
        startActivity(h);
    }
}
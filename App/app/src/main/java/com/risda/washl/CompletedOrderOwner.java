package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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

        RecyclerView recyclerView = findViewById(R.id.recyclerCompleteOrder);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        completeOrder[] completeOrders = new completeOrder[]{
                new completeOrder("2", "Rianti anna", "Candi", "Cuci Basah"),
                new completeOrder("4", "Adi Ahmad", "Sukodono","Cuci Kering"),
                new completeOrder("5", "Yanuar", "Kemiri", "Setrika"),
                new completeOrder("4", "Amanda", "Gedangan", "Cuci Setrika"),
                new completeOrder("5", "Yanuar", "Kemiri", "Cuci Basah"),
                new completeOrder("3", "Yudiono", "Tanggulangin", "Cuci Setrika"),
                new completeOrder("7", "Jasmine", "Buduran", "Cuci Kering"),
        };

        completeOrderAdapter CompleteOrderAdapter = new completeOrderAdapter(completeOrders, CompletedOrderOwner.this);
        recyclerView.setAdapter(CompleteOrderAdapter);
    }

    private void openHome() {
        Intent h = new Intent(CompletedOrderOwner.this, HomepageOwner.class);
        startActivity(h);
        finish();
    }
}
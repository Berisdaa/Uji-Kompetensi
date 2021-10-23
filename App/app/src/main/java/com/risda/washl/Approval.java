package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class Approval extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_approval);

        ImageButton home = findViewById(R.id.btnBackHome3);
        home.setOnClickListener(v -> openHome());

        RecyclerView recyclerView = findViewById(R.id.recyclerOrder);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        approvalStr[] approvalStrs = new approvalStr[]{
                new approvalStr("8", "Irish", "Berlin", "Cuci Kering"),
                new approvalStr("9", "Reihan", "Jakarta", "Cuci Basah"),
                new approvalStr("5", "Yuki", "Tokyo", "Cuci Basah"),
                new approvalStr("2", "Rio", "Barcelona", "Cuci Setrika"),
                new approvalStr("4", "Maria", "Adelaide", "Setrika"),
                new approvalStr("7", "Christy", "London", "Cuci Kering"),
                new approvalStr("3", "Sheila", "New York", "Setrika"),
        };

        approvalAdapter ApprovalAdapter = new approvalAdapter(approvalStrs, Approval.this);
        recyclerView.setAdapter(ApprovalAdapter);

    }


    private void openHome() {
        Intent h = new Intent(Approval.this, HomepageOwner.class);
        startActivity(h);
        finish();
    }
}
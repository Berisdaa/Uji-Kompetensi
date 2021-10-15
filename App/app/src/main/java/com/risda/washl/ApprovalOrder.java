package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class ApprovalOrder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_approval_order);

        ImageButton home = findViewById(R.id.btnBackApproveOrder);
        home.setOnClickListener(v -> openHome());
    }

    private void openHome() {
        Intent h = new Intent(ApprovalOrder.this, Approval.class);
        startActivity(h);
    }
}
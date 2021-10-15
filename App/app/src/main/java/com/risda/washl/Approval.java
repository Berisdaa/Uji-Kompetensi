package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;

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

        Button form = findViewById(R.id.btnAproveOrder);
        form.setOnClickListener(v -> openForm());
    }

    private void openForm() {
        Intent f = new Intent(Approval.this, ApprovalOrder.class);
        startActivity(f);
    }

    private void openHome() {
        Intent h = new Intent(Approval.this, HomepageOwner.class);
        startActivity(h);
        finish();
    }
}
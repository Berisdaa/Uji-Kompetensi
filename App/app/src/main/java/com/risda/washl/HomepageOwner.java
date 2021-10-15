package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class HomepageOwner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage_owner);

        ImageButton Ok = findViewById(R.id.btnOk);
        ImageButton CompletedOrder = findViewById(R.id.btnCompletedOrder);
        ImageButton CustomerList = findViewById(R.id.btnCustomerList);
        ImageButton SettingAcc = findViewById(R.id.btnSettingAcc);

        Ok.setOnClickListener(v -> openOk());
        CompletedOrder.setOnClickListener(v -> openCompletedOrder());
        CustomerList.setOnClickListener(v -> openCustomerList());
        SettingAcc.setOnClickListener(v -> openSettingAcc());

    }

    private void openOk() {
        Intent s = new Intent(HomepageOwner.this, Approval.class);
        startActivity(s);
    }


    private void openSettingAcc() {
        Intent s = new Intent(HomepageOwner.this, SettingProfileOwner.class);
        startActivity(s);
    }

    private void openCustomerList() {
        Intent c = new Intent(HomepageOwner.this, CustomerList.class);
        startActivity(c);
    }



    private void openCompletedOrder() {
        Intent o = new Intent(HomepageOwner.this, CompletedOrderOwner.class);
        startActivity(o);
    }

}
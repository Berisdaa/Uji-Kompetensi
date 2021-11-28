package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;

import com.risda.washl.login.LoginRequest;
import com.risda.washl.login.LoginRequestOwner;

public class HomepageOwner extends AppCompatActivity {

    TextView total;

    LoginRequestOwner loginRequestOwner;

    TextView Email, User;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage_owner);

        Email = findViewById(R.id.profilOwnerUsr);
        User = findViewById(R.id.emailOwner);

        Intent intent = getIntent();
        if (intent.getExtras() != null){
            loginRequestOwner = (LoginRequestOwner) intent.getSerializableExtra("data");
            Email.setText(loginRequestOwner.getEmail());
            User.setText(loginRequestOwner.getUsername());
            Log.e("TAG", "=====> "+loginRequestOwner.getEmail());
        }

        ImageButton Ok = findViewById(R.id.btnOk);
        ImageButton CompletedOrder = findViewById(R.id.btnCompletedOrder);
        ImageButton CustomerList = findViewById(R.id.btnCustomerList);
        ImageButton SettingAcc = findViewById(R.id.btnSettingAcc);

        Ok.setOnClickListener(v -> openOk());
        CompletedOrder.setOnClickListener(v -> openCompletedOrder());
        CustomerList.setOnClickListener(v -> openCustomerList());
        SettingAcc.setOnClickListener(v -> openSettingAcc());

        total = findViewById(R.id.textView30);

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
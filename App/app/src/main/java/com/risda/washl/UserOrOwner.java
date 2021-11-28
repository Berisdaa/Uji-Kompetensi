package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.risda.washl.register.RegisterOwner;


public class UserOrOwner extends AppCompatActivity {

    private Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_or_owner);

        button = findViewById(R.id.btnUser);
        button2 = findViewById(R.id.btnOwner);
        button.setOnClickListener(v -> openAsUser());
        button2.setOnClickListener(v -> openAsOwner());


    }

    public void openAsUser(){
        Intent u = new Intent(this, HomepageUser.class);
        startActivity(u);
    }

    public void openAsOwner(){
        Intent o = new Intent(this, RegisterOwner.class);
        startActivity(o);
    }


}
package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.risda.washl.login.LoginOwner;
import com.risda.washl.register.RegisterOwner;

public class AsOwner extends AppCompatActivity {
    private Button button, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_as_owner);

        button = (Button) findViewById(R.id.btnSignInOwner);
        button.setOnClickListener(v -> openLogin());

        button2 = findViewById(R.id.btnSignUpOwner);
        button2.setOnClickListener(v -> openRegister());
    }

    private void openRegister() {
        Intent r = new Intent(AsOwner.this, RegisterOwner.class);
        startActivity(r);
    }

    private void openLogin() {
        Intent l = new Intent(AsOwner.this, LoginOwner.class);
        startActivity(l);
    }
}
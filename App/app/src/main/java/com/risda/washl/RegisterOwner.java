package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class RegisterOwner extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_owner);

        button = findViewById(R.id.btnNextRegisOwner);
        button.setOnClickListener(v -> openRegister2());
    }

    private void openRegister2() {
        Intent r = new Intent(RegisterOwner.this, RegisterOwner2.class);
        startActivity(r);
    }
}
package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ProfileUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_user);

        ImageButton home = findViewById(R.id.btnBackHomeUser);
        home.setOnClickListener(v -> openHome());

        Button confirm = findViewById(R.id.btnConfirmProfileUser);
        confirm.setOnClickListener(v -> ok());
    }

    private void ok() {
        Toast.makeText(this, "OKE PROFILE BERHASIL DIPERBARUI", Toast.LENGTH_SHORT).show();
    }

    private void openHome() {
        Intent h = new Intent(ProfileUser.this, HomepageUser.class);
        startActivity(h);
    }
}
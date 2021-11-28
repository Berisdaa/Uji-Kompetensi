package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class SettingProfileOwner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_profile_owner);

        ImageButton home = findViewById(R.id.btnBackHome2);
        home.setOnClickListener(v -> openHome());

        Button logout = findViewById(R.id.btnLogoutOwner);
        Button confirm = findViewById(R.id.btnRegisterFinal2);
        logout.setOnClickListener(v -> logOut());
        confirm.setOnClickListener(v -> conFirm());

        Button setProduk = findViewById(R.id.btnSettingProduk);
        setProduk.setOnClickListener(v -> openSetProduk());
    }

    private void openSetProduk() {
        Intent l = new Intent(SettingProfileOwner.this, SettingProduk.class);
        startActivity(l);
        finish();
    }

    private void conFirm() {
        Toast.makeText(this, "OKE BERHASIL", Toast.LENGTH_SHORT).show();
    }

    private void logOut() {
        Intent l = new Intent(SettingProfileOwner.this, UserOrOwner.class);
        startActivity(l);
        finish();
    }

    private void openHome() {
        Intent h = new Intent(SettingProfileOwner.this, HomepageOwner.class);
        startActivity(h);
        finish();
    }
}
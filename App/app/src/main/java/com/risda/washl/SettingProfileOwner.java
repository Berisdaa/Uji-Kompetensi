package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class SettingProfileOwner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_profile_owner);

        ImageButton home = findViewById(R.id.btnBackHome2);
        home.setOnClickListener(v -> openHome());
    }

    private void openHome() {
        Intent h = new Intent(SettingProfileOwner.this, HomepageOwner.class);
        startActivity(h);
        finish();
    }
}
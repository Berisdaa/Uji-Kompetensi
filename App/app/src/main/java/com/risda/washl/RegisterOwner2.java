package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class RegisterOwner2 extends AppCompatActivity {
    public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_owner2);

        button = (Button) findViewById(R.id.btnRegisterFinal);
        button.setOnClickListener(v -> openHomepage());
    }

    private void openHomepage() {
        Intent h = new Intent(RegisterOwner2.this, HomepageOwner.class);
        startActivity(h);
    }
}
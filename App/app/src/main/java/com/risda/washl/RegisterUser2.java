package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class RegisterUser2 extends AppCompatActivity {
    public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user2);

        button = (Button) findViewById(R.id.btnConfirmUser);
        button.setOnClickListener(v -> openHomepage());
    }

    private void openHomepage() {
        Intent h = new Intent(RegisterUser2.this, HomepageUser.class);
        startActivity(h);
    }
}
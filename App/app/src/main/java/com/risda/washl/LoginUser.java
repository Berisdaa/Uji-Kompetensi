package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class LoginUser extends AppCompatActivity {
    public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);

        button = (Button) findViewById(R.id.btnLoginUser);
        button.setOnClickListener(v -> openHomepage());
    }

    private void openHomepage() {
        Intent h = new Intent(LoginUser.this, HomepageUser.class);
        startActivity(h);
    }
}
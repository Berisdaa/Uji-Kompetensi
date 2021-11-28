package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.risda.washl.login.LoginUser;
import com.risda.washl.register.RegisterUser;

public class AsUser extends AppCompatActivity {
    private Button button, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_as_user);

        Button button = (Button) findViewById(R.id.btnSignInUser);
        button.setOnClickListener(v -> openLogin());

        Button button2 = findViewById(R.id.btnSignUpUser);
        button2.setOnClickListener(v -> openRegister());
    }

    private void openRegister() {
        Intent r = new Intent(AsUser.this, RegisterUser.class);
        startActivity(r);
    }

    public void openLogin(){
        Intent l = new Intent(AsUser.this, LoginUser.class);
        startActivity(l);
    }

}
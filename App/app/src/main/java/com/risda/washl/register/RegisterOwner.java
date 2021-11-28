package com.risda.washl.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.risda.washl.HomepageOwner;
import com.risda.washl.R;
import com.risda.washl.login.LoginOwner;
import com.risda.washl.login.LoginUser;
import com.risda.washl.rest.ApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterOwner extends AppCompatActivity {

    private Button button;
    EditText username, email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_owner);

        username = findViewById(R.id.usrOwrRegis);
        email = findViewById(R.id.emailOwrRegis);
        password = findViewById(R.id.passOwrRegis);
        button = findViewById(R.id.btnNextRegisOwner);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(email.getText().toString()) || TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty(password.getText().toString()) ){
                    Toast.makeText(RegisterOwner.this, "Input Akun Berhasil", Toast.LENGTH_SHORT).show();
                }else {
                    RegisterRequestOwner registerRequestOwner = new RegisterRequestOwner();
                    registerRequestOwner.setEmail(email.getText().toString());
                    registerRequestOwner.setPassword(password.getText().toString());
                    registerRequestOwner.setUsername(username.getText().toString());
                    registowner(registerRequestOwner);
                }
            }
        });
    }

//    private void openRegister2() {
//        Intent r = new Intent(RegisterOwner.this, HomepageOwner.class);
//        startActivity(r);
//    }

    public void registowner(RegisterRequestOwner registerRequestOwner){

        Call<RegisterResponseOwner> registerResponseOwnerCall = ApiClient.getService().registerOwner(registerRequestOwner);
        registerResponseOwnerCall.enqueue(new Callback<RegisterResponseOwner>() {
            @Override
            public void onResponse(Call<RegisterResponseOwner> call, Response<RegisterResponseOwner> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(RegisterOwner.this, "Register Berhasil", Toast.LENGTH_SHORT).show();

                    Intent h = new Intent(RegisterOwner.this, LoginOwner.class);
                    startActivity(h);
                    finish();

                }else{
                    Toast.makeText(RegisterOwner.this, "Register Gagal", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<RegisterResponseOwner> call, Throwable t) {
                Toast.makeText(RegisterOwner.this, "Register Gagal", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
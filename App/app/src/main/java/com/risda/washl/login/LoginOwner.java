package com.risda.washl.login;

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
import com.risda.washl.rest.ApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginOwner extends AppCompatActivity {
    public Button button, lupa;
    EditText oEmail, oPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_owner);

        lupa = findViewById(R.id.lupaPwUser);
        lupa.setOnClickListener(v -> openLupaPw());

        oEmail = findViewById(R.id.logEmailOwner);
        oPassword = findViewById(R.id.logPassOwner);
        button = (Button) findViewById(R.id.btnLoginOwner);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(oEmail.getText().toString()) || TextUtils.isEmpty(oPassword.getText().toString()) ) {
                    Toast.makeText(LoginOwner.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                }else{
                    LoginRequestOwner loginRequestOwner = new LoginRequestOwner();
                    loginRequestOwner.setEmail(oEmail.getText().toString());
                    loginRequestOwner.setPassword(oPassword.getText().toString());

                    loginowner(loginRequestOwner);
                }
            }
        });

    }

    private void openLupaPw() {

    }


    public void loginowner(LoginRequestOwner loginRequestOwner){
        Call<LoginResponseOwner> loginResponseOwnerCall = ApiClient.getService().loginOwner(loginRequestOwner);
        loginResponseOwnerCall.enqueue(new Callback<LoginResponseOwner>(){
            @Override
            public void onResponse(Call<LoginResponseOwner> call, Response<LoginResponseOwner> response) {
                if (response.isSuccessful()){

                    LoginRequestOwner loginRequestOwner = response.body().getData();

                    Intent h = new Intent(LoginOwner.this, HomepageOwner.class).putExtra("data", loginRequestOwner);
                    startActivity(h);
                    finish();
                }else{
                    Toast.makeText(LoginOwner.this, "Login Gagal", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<LoginResponseOwner> call, Throwable t) {
                Toast.makeText(LoginOwner.this, "Login Gagal", Toast.LENGTH_SHORT).show();
            }
        });
    }

    }

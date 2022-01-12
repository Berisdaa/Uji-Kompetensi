package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.risda.washl.login.GetLoginEmail;
import com.risda.washl.login.LoginEmail;
import com.risda.washl.login.LoginUser;
import com.risda.washl.rest.ApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LupaPasswordUser1 extends AppCompatActivity {

    Button Akun;
    EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa_password_user1);

        Akun = findViewById(R.id.keAkun);
        Akun.setOnClickListener(v -> cariAkun());

        email = findViewById(R.id.etLupaEmailUser);
    }

    private void cariAkun() {
        LoginEmail login = new LoginEmail();
        login.setEmail(email.getText().toString());

        LoginAkun(login);
    }

    private void LoginAkun(LoginEmail loginEmail) {
        Call<GetLoginEmail> loginCall = ApiClient.getService().loginEmail(loginEmail);
        loginCall.enqueue(new Callback<GetLoginEmail>() {
            @Override
            public void onResponse(Call<GetLoginEmail> call, Response<GetLoginEmail> response) {
                if (response.isSuccessful()) {
                    LoginEmail getLogin = response.body().getData();
                    startActivity(new Intent(LupaPasswordUser1.this, LupaPasswordUser2.class).putExtra("data", getLogin));
                    finish();


                } else {
                    String pesan1 = "gagal";
                    Toast.makeText(LupaPasswordUser1.this, pesan1, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<GetLoginEmail> call, Throwable t) {
                String pesan = "Login Gagal";
                Toast.makeText(LupaPasswordUser1.this, pesan, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
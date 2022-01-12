package com.risda.washl.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.risda.washl.HomepageUser;
import com.risda.washl.LupaPasswordUser1;
import com.risda.washl.R;
import com.risda.washl.register.RegisterUser;
import com.risda.washl.rest.ApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginUser extends AppCompatActivity {
    Button login;
    TextView daftar, gantiPw;
    EditText etEmailUser, etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);

        daftar = findViewById(R.id.daftarUsr);
        daftar.setOnClickListener(v -> Daftar());

        gantiPw = findViewById(R.id.gantiPwUsr);
        gantiPw.setOnClickListener(v -> GantiPw());

        etEmailUser = findViewById(R.id.etEmailUser);
        etPassword = findViewById(R.id.etPwUser);
        login = findViewById(R.id.btnLoginUser);

//        String Email = etEmailUser.getText().toString();
//        String Password = etPassword.getText().toString();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etEmailUser.getText().toString()) || TextUtils.isEmpty(etPassword.getText().toString()) ) {
                    Toast.makeText(LoginUser.this, "Login Gagal", Toast.LENGTH_SHORT).show();
                }else{
                    LoginRequest loginRequest = new LoginRequest();
                    loginRequest.setEmail(etEmailUser.getText().toString());
                    loginRequest.setPassword(etPassword.getText().toString());

                    loginuser(loginRequest);
                }
            }
        });


    }

    private void GantiPw() {
        Intent d = new Intent(LoginUser.this, LupaPasswordUser1.class);
        startActivity(d);
    }

    private void Daftar() {
        Intent d = new Intent(LoginUser.this, RegisterUser.class);
        startActivity(d);
    }


    public void loginuser(LoginRequest loginRequest){
        Call<LoginResponse> loginResponseCall = ApiClient.getService().loginUser(loginRequest);
        loginResponseCall.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.isSuccessful()){
                    LoginRequest loginRequest = response.body().getData();

                    Intent h = new Intent(LoginUser.this, HomepageUser.class).putExtra("data", loginRequest);
                    startActivity(h);
                    finish();
                }else{
                    Toast.makeText(LoginUser.this, "Login Gagal 1", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Toast.makeText(LoginUser.this, "Login Gagal 2", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
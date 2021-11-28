package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.risda.washl.login.LoginRequest;
import com.risda.washl.login.LoginResponse;
import com.risda.washl.login.LoginUser;
import com.risda.washl.rest.ApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Handler h = new Handler();

    LoginRequest loginRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                loginuser(loginRequest);
                Intent i = new Intent(MainActivity.this, UserOrOwner.class);
                startActivity(i);
                finish();
            }
        }, 2000);
    }

    public void loginuser(LoginRequest loginRequest){
        Call<LoginResponse> loginResponseCall = ApiClient.getService().loginUser(loginRequest);
        loginResponseCall.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.isSuccessful()){
                    LoginRequest loginRequest = response.body().getData();

                    Intent h = new Intent(MainActivity.this, HomepageUser.class).putExtra("data", loginRequest);
                    startActivity(h);
                    finish();
                }else{
                    Toast.makeText(MainActivity.this, "Login Gagal", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
//                Toast.makeText(LoginUser.this, "Login Gagal", Toast.LENGTH_SHORT).show();
           }
        });
    }


}

//      PENGINGAT
//    Berat 1 itu cuci kering
//    Berat 2 itu cuci setrika
//    Berat 3 itu cuci basah
//    Berat 4 itu setrika

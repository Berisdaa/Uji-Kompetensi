package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.risda.washl.login.GetNewPassword;
import com.risda.washl.login.LoginEmail;
import com.risda.washl.login.LoginUser;
import com.risda.washl.login.NewPassword;
import com.risda.washl.rest.ApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LupaPasswordUser2 extends AppCompatActivity {

    EditText newPw, gmail;

    Button ok;

    LoginEmail getLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa_password_user2);

        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            getLogin = (LoginEmail) intent.getSerializableExtra("data");
//            gmail.setText(getLogin.getEmail());
//            paassword.setText(getLogin.getPassword());
        }

        ok = findViewById(R.id.resetPwUser);
        ok.setOnClickListener(v -> pw());
        gmail = findViewById(R.id.etLupaEmailUser);
        newPw = findViewById(R.id.etPwBaruUser);
    }

    private void pw() {
        NewPassword registerModel = new NewPassword();

        registerModel.setPassword(newPw.getText().toString());

        Register(registerModel);
    }

    private void Register(NewPassword newPassword) {
        Intent mIntent = getIntent();
        Integer id = getLogin.getId();
        Call<GetNewPassword> registerCall = ApiClient.getService().NewPassword(id,newPassword);
        registerCall.enqueue(new Callback<GetNewPassword>() {
            @Override
            public void onResponse(Call<GetNewPassword> call, Response<GetNewPassword> response) {
                if (response.isSuccessful()){
                    startActivity(new Intent(LupaPasswordUser2.this, LoginUser.class));
                    finish();

                }else{
                    String  pesan1 = "Harus Diisi!";
                    Toast.makeText(LupaPasswordUser2.this, pesan1, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<GetNewPassword> call, Throwable t) {
                Toast.makeText(LupaPasswordUser2.this, "Harus DiIsi", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
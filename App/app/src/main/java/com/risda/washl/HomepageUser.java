package com.risda.washl;

import com.risda.washl.login.LoginRequest;
import com.risda.washl.login.LoginResponse;
import com.risda.washl.modal.GetMenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.TextView;

import com.risda.washl.modal.Menu;
import com.risda.washl.rest.ApiClient;
import com.risda.washl.rest.ApiInterface;

import java.util.List;

import retrofit2.Callback;
import retrofit2.Call;
import retrofit2.Response;



public class HomepageUser extends AppCompatActivity {

    ApiInterface kApiInterface;
    private RecyclerView kRecyclerView;
    private RecyclerView.Adapter kAdapter;
    private RecyclerView.LayoutManager kLayoutManager;
    public static HomepageUser ma;

    LoginRequest loginRequest;

    TextView Email, User;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage_user);

        Email = findViewById(R.id.textView4);
        User = findViewById(R.id.textView6);

        Intent intent = getIntent();
        if (intent.getExtras() != null){
            loginRequest = (LoginRequest) intent.getSerializableExtra("data");
            Email.setText(loginRequest.getEmail());
            User.setText(loginRequest.getUsername());
            Log.e("TAG", "=====> "+loginRequest.getEmail());
        }




        ImageButton searchBar = findViewById(R.id.btnSearchBar);
        ImageButton history = findViewById(R.id.btnhistory);
        ImageButton basket = findViewById(R.id.btnbasket);
        ImageButton edit = findViewById(R.id.btnsettingprofile);

        searchBar.setOnClickListener(v -> openSearchBar());;
        history.setOnClickListener(v -> History());
        basket.setOnClickListener(v -> Shopping());
        edit.setOnClickListener(v -> SetProfile());


        kRecyclerView = findViewById(R.id.recyclerLaundryHome);
        kLayoutManager = new LinearLayoutManager(this);
        kRecyclerView.setLayoutManager(kLayoutManager);
        kApiInterface = ApiClient.getClient().create(ApiInterface.class);
        ma=this;
        panggilRetrofit();

        Intent mIntent = new Intent();
        mIntent.putExtra("data", intent.getExtras());

    }

    private void panggilRetrofit() {
        Call<GetMenu> MenuCall = kApiInterface.getMenu();
        MenuCall.enqueue(new Callback<GetMenu>() {
            @Override
            public void onResponse(Call<GetMenu> call, Response<GetMenu>
                    response) {
                List<Menu> MenuList = response.body().getData();
                Log.d("Retrofit Get", "Jumlah data Kontak: " +
                        String.valueOf(MenuList.size()));
                kAdapter = new laundryRecomAdapter(MenuList);
                kRecyclerView.setAdapter(kAdapter);
            }

            @Override
            public void onFailure(Call<GetMenu> call, Throwable t) {
                Log.e("Retrofit Get", t.toString());
            }
        });
    }



    private void SetProfile() {
        Intent s = new Intent(HomepageUser.this, ProfileUser.class);
        startActivity(s);
        finish();
    }

    private void Shopping() {
        Intent s = new Intent(HomepageUser.this, detailOrder.class);
        startActivity(s);
        finish();
    }

    private void History() {
        Intent s = new Intent(HomepageUser.this, HistoryUser.class);
        startActivity(s);
        finish();
    }



    private void openSearchBar() {
        Intent s = new Intent(HomepageUser.this, SearchBar.class);
        startActivity(s);
    }




}
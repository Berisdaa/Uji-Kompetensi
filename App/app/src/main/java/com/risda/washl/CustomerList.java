package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

import com.risda.washl.modal.GetPelanggan;
import com.risda.washl.modal.Pelanggan;
import com.risda.washl.rest.ApiClient;
import com.risda.washl.rest.ApiInterface;

import java.util.List;

import retrofit2.Callback;
import retrofit2.Call;
import retrofit2.Response;

public class CustomerList extends AppCompatActivity {

    ApiInterface cApiInterface;
    private RecyclerView cRecyclerView;
    private RecyclerView.Adapter cAdapter;
    private RecyclerView.LayoutManager cLayoutManager;
    public static CustomerList ma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_list);

        ImageButton home = findViewById(R.id.btnBackHome);
        home.setOnClickListener(v -> openHome());

        cRecyclerView = findViewById(R.id.recyclerCustomer);
        cLayoutManager = new LinearLayoutManager(this);
        cRecyclerView.setLayoutManager(cLayoutManager);
        cApiInterface = ApiClient.getClient().create(ApiInterface.class);
        ma=this;
        panggilRetrofit();

    }

    private void panggilRetrofit() {
        Call<GetPelanggan> PelangganCall = cApiInterface.getPelanggan();
        PelangganCall.enqueue(new Callback<GetPelanggan>() {
            @Override
            public void onResponse(Call<GetPelanggan> call, Response<GetPelanggan>
                    response) {
                List<Pelanggan> PelangganList = response.body().getData();
                Log.d("Retrofit Get", "pelanggan" +
                        String.valueOf(PelangganList.size()));
                cAdapter = new CustomerAdapter(PelangganList);
                cRecyclerView.setAdapter(cAdapter);
            }

                @Override
                public void onFailure(Call<GetPelanggan> call, Throwable t) {
                    Log.e("Retrofit Get", t.toString());
                }
            });
    }

    private void openHome() {
        Intent r = new Intent(CustomerList.this, HomepageOwner.class);
        startActivity(r);
    }



}
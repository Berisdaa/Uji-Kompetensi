package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

import com.risda.washl.modal.GetOrder;
import com.risda.washl.modal.Order;
import com.risda.washl.rest.ApiClient;
import com.risda.washl.rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Approval extends AppCompatActivity {

    ApiInterface hApiInterface;
    private RecyclerView hRecyclerView;
    private RecyclerView.Adapter hAdapter;
    private RecyclerView.LayoutManager hLayoutManager;
    public static Approval ma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_approval);

        ImageButton home = findViewById(R.id.btnBackHome3);
        home.setOnClickListener(v -> openHome());

        hRecyclerView = findViewById(R.id.recyclerOrder);
        hLayoutManager = new LinearLayoutManager(this);
        hRecyclerView.setLayoutManager(hLayoutManager);
        hApiInterface = ApiClient.getClient().create(ApiInterface.class);
        ma=this;
        panggilRetrofit();

    }

    private void panggilRetrofit() {
        Call<GetOrder> OrderCall = hApiInterface.getOrder();
        OrderCall.enqueue(new Callback<GetOrder>() {
            @Override
            public void onResponse(Call<GetOrder> call, Response<GetOrder>
                    response) {
                List<Order> OrderList3 = response.body().getData();
                Log.d("Retrofit Get","Jumlah data Kontak: " + String.valueOf(OrderList3.size()));
                hAdapter = new approvalAdapter(OrderList3);
                hRecyclerView.setAdapter(hAdapter);
            }

            @Override
            public void onFailure(Call<GetOrder> call, Throwable t) {
                Log.e("Retrofit Get", t.toString());
            }
        });
    }


    private void openHome() {
        Intent h = new Intent(Approval.this, HomepageOwner.class);
        startActivity(h);
        finish();
    }
}
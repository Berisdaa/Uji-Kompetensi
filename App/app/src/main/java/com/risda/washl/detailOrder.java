package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.risda.washl.modal.GetOrder;
import com.risda.washl.modal.Order;
import com.risda.washl.rest.ApiClient;
import com.risda.washl.rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class detailOrder extends AppCompatActivity {
;
    ApiInterface hApiInterface;
    private RecyclerView hRecyclerView;
    private RecyclerView.Adapter hAdapter;
    private RecyclerView.LayoutManager hLayoutManager;
    public static detailOrder ma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_order);

        Button pesanLagi = findViewById(R.id.btnPesanLagi);
        Button finishOrder = findViewById(R.id.btnFinishOrder);
        ImageButton back = findViewById(R.id.btnBack2);

        pesanLagi.setOnClickListener(v -> pesan());
        finishOrder.setOnClickListener(v -> selesai());
        back.setOnClickListener(v -> Back());



        hRecyclerView = findViewById(R.id.recyclerDetailOrder);
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
                List<Order> OrderList4 = response.body().getData();
                Log.d("Retrofit Get","Jumlah data Kontak: " + String.valueOf(OrderList4.size()));
                hAdapter = new detailOrderAdapter(OrderList4);
                hRecyclerView.setAdapter(hAdapter);
            }

            @Override
            public void onFailure(Call<GetOrder> call, Throwable t) {
                Log.e("Retrofit Get", t.toString());
            }
        });
    }

    private void Back() {
        Intent s = new Intent(detailOrder.this, displayLaundry.class);
        startActivity(s);
        finish();
    }

    private void selesai() {
        Intent s = new Intent(detailOrder.this, HomepageUser.class);
        startActivity(s);
        finish();
    }

    private void pesan() {
        Intent s = new Intent(detailOrder.this, displayLaundry.class);
        startActivity(s);
        finish();
    }
}
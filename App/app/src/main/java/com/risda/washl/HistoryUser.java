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

import retrofit2.Callback;
import retrofit2.Call;
import retrofit2.Response;

public class HistoryUser extends AppCompatActivity {

    ApiInterface hApiInterface;
    private RecyclerView hRecyclerView;
    private RecyclerView.Adapter hAdapter;
    private RecyclerView.LayoutManager hLayoutManager;
    public static HistoryUser ma;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_user);


        ImageButton home = findViewById(R.id.btnBackHistoryUser);
        home.setOnClickListener(v -> openHome());


        hRecyclerView = findViewById(R.id.recyclerHistoryUsr);
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
                List<Order> OrderList = response.body().getData();
                Log.d("Retrofit Get","Jumlah data Kontak: " + String.valueOf(OrderList.size()));
                hAdapter = new historyUserAdapter(OrderList);
                hRecyclerView.setAdapter(hAdapter);
            }

            @Override
            public void onFailure(Call<GetOrder> call, Throwable t) {
                Log.e("Retrofit Get", t.toString());
            }
        });
    }


    private void openHome() {
        Intent h = new Intent(HistoryUser.this, HomepageUser.class);
        startActivity(h);
    }
}
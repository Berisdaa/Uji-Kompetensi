package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.risda.washl.login.LoginRequest;
import com.risda.washl.login.LoginUser;

import static android.nfc.NfcAdapter.EXTRA_DATA;

public class displayLaundry extends AppCompatActivity {

//    GridView gridView;
//    String[] names = {"Cuci Kering","Cuci Basah","Cuci Setrika","Setrika"};

    TextView tv1, tv2, tv3, tv4, tv5;
    ImageView imgdetail;

    TextView user, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_laundry);

        user = findViewById(R.id.textView4);
        email = findViewById(R.id.textView6);

        Intent kIntent = getIntent();
        imgdetail = findViewById(R.id.imageView11);
        tv1 = findViewById(R.id.CuciKering);
        tv2 = findViewById(R.id.CuciBasah);
        tv3 = findViewById(R.id.CuciSetrika);
        tv4 = findViewById(R.id.Setrika);
        tv5 = findViewById(R.id.namaLaundry);
        getIntent().getParcelableExtra(EXTRA_DATA);

        tv1.setText(Integer.toString(kIntent.getIntExtra("harga",0)));
        tv2.setText(Integer.toString(kIntent.getIntExtra("harga2",0)));
        tv3.setText(Integer.toString(kIntent.getIntExtra("harga3",0)));
        tv4.setText(Integer.toString(kIntent.getIntExtra("harga4",0)));
        tv5.setText(kIntent.getStringExtra("nama"));
        Glide.with(displayLaundry.this)
                .load(""+kIntent.getStringExtra("gambar"))
                .into(imgdetail);

        Button ck = findViewById(R.id.ordCuciKering);
        Button cb = findViewById(R.id.ordCuciBasah);
        Button cs = findViewById(R.id.ordCuciSetrika);
        Button s = findViewById(R.id.ordCuciSetrika);
        
        ck.setOnClickListener(v -> Ck());
        cb.setOnClickListener(v -> Cb());
        cs.setOnClickListener(v -> Cs());
        s.setOnClickListener(v -> S());

    }

    private void Ck() {
        Intent mIntent = (HomepageUser.ma.getIntent());

        if(mIntent.getExtras() == null){
            Intent i = new Intent(displayLaundry.this, LoginUser.class);
            startActivity(i);
            finish();

        }else{
            Intent k = new Intent(displayLaundry.this, FormOrder.class);
            startActivity(k);
        }
    }

    private void Cb() {
        Intent mIntent = (HomepageUser.ma.getIntent());
        if(mIntent.getExtras() == null){
            Intent i = new Intent(displayLaundry.this, LoginUser.class);
            startActivity(i);
            finish();

        }else{
            Intent k = new Intent(displayLaundry.this, FormOrder.class);
            startActivity(k);
        }
    }

    private void Cs() {
        Intent mIntent = (HomepageUser.ma.getIntent());
        if(mIntent.getExtras() == null){
            Intent i = new Intent(displayLaundry.this, LoginUser.class);
            startActivity(i);
            finish();

        }else{
            Intent k = new Intent(displayLaundry.this, FormOrder.class);
            startActivity(k);
        }
    }

    private void S() {
        Intent mIntent = (HomepageUser.ma.getIntent());
        if(mIntent.getExtras() == null){
            Intent i = new Intent(displayLaundry.this, LoginUser.class);
            startActivity(i);
            finish();

        }else{
            Intent k = new Intent(displayLaundry.this, FormOrder.class);
            startActivity(k);
        }
    }


}
package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class HomepageUser extends AppCompatActivity {

    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage_user);

        ImageButton searchBar = findViewById(R.id.btnSearchBar);
        ImageButton more = findViewById(R.id.More);

        searchBar.setOnClickListener(v -> openSearchBar());
        more.setOnClickListener(v -> openMore());

        RecyclerView recyclerView = findViewById(R.id.recyclerLaundryHome);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        laundryRecomStr[] laundryRecomStrs = new laundryRecomStr[]{
                new laundryRecomStr("Pras Laundry","Candi Perum. Graha"),
            new laundryRecomStr("Jeje Laundry", "Pucang, Jl. Ambarawa"),
                new laundryRecomStr("Lara Laundry", "Gedangan, Ds. Kuningan"),
                new laundryRecomStr("Dune Laundry", "Porong, Ds. Kebon Agung")
        };

        laundryRecomAdapter LaundryRecomAdapter = new laundryRecomAdapter(laundryRecomStrs, HomepageUser.this);
        recyclerView.setAdapter(LaundryRecomAdapter);

    }

    private void openMore() {



        dialog = new Dialog(this);
        dialog.getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setContentView(R.layout.dialog);

        Button btneditUser = dialog.findViewById(R.id.btnEditUser);
        btneditUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(HomepageUser.this, "oke", Toast.LENGTH_SHORT).show();
        Intent e = new Intent(HomepageUser.this,ProfileUser.class);
        startActivity(e);
        finish();
            }
        });

        Button btnlogout = dialog.findViewById(R.id.btnLogoutUser);
        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(HomepageUser.this,AsUser.class);
                startActivity(l);
                finish();
            }
        });
        dialog.show();



    }


    private void openSearchBar() {
        Intent s = new Intent(HomepageUser.this, SearchBar.class);
        startActivity(s);
    }

    private void openHistory() {
        Intent h = new Intent(HomepageUser.this, HistoryUser.class);
        startActivity(h);
    }

    private void openStruk() {
        Intent s = new Intent(HomepageUser.this, Struk.class);
        startActivity(s);
    }

    public class rekomendasiAdapter extends BaseAdapter{
        private String[] imageNames;
        private int[] imagesPhoto;
        private Context context;
        private LayoutInflater layoutInflater;
        public rekomendasiAdapter(String[] imageNames, int[] imagesPhoto, Context context) {
            this.imageNames = imageNames;
            this.imagesPhoto = imagesPhoto;
            this.context = context;
            this.layoutInflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return imagesPhoto.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            if (view == null){
                view = layoutInflater.inflate(R.layout.row_rekomendasi, viewGroup, false);
            }

            TextView tvRecom = view.findViewById(R.id.tvLdrRecom);
            ImageView RecomLdr = view.findViewById(R.id.baseRecom);


            tvRecom.setText(imageNames[position]);
            RecomLdr.setImageResource(imagesPhoto[position]);
            return view;
        }
    }

}
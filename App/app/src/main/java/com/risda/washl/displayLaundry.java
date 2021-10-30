package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class displayLaundry extends AppCompatActivity {

    GridView gridView;

    String[] names = {"Cuci Kering","Cuci Basah","Cuci Setrika","Setrika"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_laundry);

        gridView = findViewById(R.id.gridDisplay);
        displayAdapter DisplayAdapter = new displayAdapter(names, this);
        gridView.setAdapter(DisplayAdapter);


    }



    public class displayAdapter extends BaseAdapter{
        private String[] laundryNames;
        private Context context;
        private LayoutInflater layoutInflater;

        public displayAdapter(String[] laundryNames, Context context) {
            this.laundryNames = laundryNames;
            this.context = context;
            this.layoutInflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return laundryNames.length;
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
                view = layoutInflater.inflate(R.layout.row_displaylaundry, viewGroup, false);
            }

            TextView tvJenisLdr= view.findViewById(R.id.tvJnsLdr);

            tvJenisLdr.setText(laundryNames[position]);


            return view;
        }
    }



}
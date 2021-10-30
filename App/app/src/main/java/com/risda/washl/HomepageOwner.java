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

public class HomepageOwner extends AppCompatActivity {

    GridView gridView;

    String[] jenis= {"Cuci Kering","Cuci Basah","Cuci Setrika","Setrika"};
    String[] hasil = {"20","10","5","15"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage_owner);

        ImageButton Ok = findViewById(R.id.btnOk);
        ImageButton CompletedOrder = findViewById(R.id.btnCompletedOrder);
        ImageButton CustomerList = findViewById(R.id.btnCustomerList);
        ImageButton SettingAcc = findViewById(R.id.btnSettingAcc);

        Ok.setOnClickListener(v -> openOk());
        CompletedOrder.setOnClickListener(v -> openCompletedOrder());
        CustomerList.setOnClickListener(v -> openCustomerList());
        SettingAcc.setOnClickListener(v -> openSettingAcc());

        gridView = findViewById(R.id.gridHasil);
        hasilAdapter HasilAdapter = new hasilAdapter(hasil, jenis, this);
        gridView.setAdapter(HasilAdapter);

    }

    public class hasilAdapter extends BaseAdapter{
        private String[] jenisCucian;
        private String[] hasilCucian;
        private Context context;
        private LayoutInflater layoutInflater;

        public hasilAdapter(String[] jenisCucian, String[] hasilCucian, Context context) {
            this.jenisCucian = jenisCucian;
            this.hasilCucian = hasilCucian;
            this.context = context;
            this.layoutInflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
        }


        @Override
        public int getCount() {
            return hasilCucian.length;
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
                view = layoutInflater.inflate(R.layout.row_hasil, viewGroup, false);
            }

            TextView tvJenisCucian = view.findViewById(R.id.tvHasil);
            TextView tvHasilCucian = view.findViewById(R.id.tvjeniscucian);


            tvJenisCucian.setText(jenisCucian[position]);
            tvHasilCucian.setText(hasilCucian[position]);

            return view;
        }
    }

    private void openOk() {
        Intent s = new Intent(HomepageOwner.this, Approval.class);
        startActivity(s);
    }

    private void openSettingAcc() {
        Intent s = new Intent(HomepageOwner.this, SettingProfileOwner.class);
        startActivity(s);
    }

    private void openCustomerList() {
        Intent c = new Intent(HomepageOwner.this, CustomerList.class);
        startActivity(c);
    }

    private void openCompletedOrder() {
        Intent o = new Intent(HomepageOwner.this, CompletedOrderOwner.class);
        startActivity(o);
    }



}
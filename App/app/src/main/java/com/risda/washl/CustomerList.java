package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomerList extends AppCompatActivity {

    Button button;
    GridView gridView;

    String[] names = {"Andi","Rudi","Sarah","Bella","Reno","Bianca","Yuki","Jaemin","Natasha","Jake"};
    int[] images = {R.drawable.filename,R.drawable.filename,R.drawable.filename,R.drawable.filename,R.drawable.filename,R.drawable.filename,R.drawable.filename,R.drawable.filename,R.drawable.filename,R.drawable.filename};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_list);

        ImageButton home = findViewById(R.id.btnBackHome);
        home.setOnClickListener(v -> openHome());

        gridView = findViewById(R.id.gridCustomer);

        customerAdapter CustomerAdapter = new customerAdapter(names, images, this);

        gridView.setAdapter(CustomerAdapter);

    }

    private void openHome() {
        Intent r = new Intent(CustomerList.this, HomepageOwner.class);
        startActivity(r);
    }

    public class customerAdapter extends BaseAdapter{
        private String[] imageNames;
        private int[] imagesPhoto;
        private Context context;
        private LayoutInflater layoutInflater;

        public customerAdapter(String[] imageNames, int[] imagesPhoto, Context context) {
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
                view = layoutInflater.inflate(R.layout.row_items, viewGroup, false);
            }

            TextView tvCustomer = view.findViewById(R.id.tvUserList);
            ImageView customerPic = view.findViewById(R.id.baseCustomer);


            tvCustomer.setText(imageNames[position]);
            customerPic.setImageResource(imagesPhoto[position]);

            return view;
        }
    }

}
package com.risda.washl;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.risda.washl.modal.Menu;


import java.util.List;

public class laundryRecomAdapter extends RecyclerView.Adapter<laundryRecomAdapter.ViewHolder> {

    //List<Kategori> KategoriList;
    List<Menu> MenuList;
    Context context;

    public laundryRecomAdapter(List <Menu> MenuList ) {
        this.MenuList = MenuList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View kView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem_laundryhome, parent, false);
        ViewHolder kViewHolder = new ViewHolder(kView);
        return kViewHolder;
    }

    @Override
    public void onBindViewHolder(laundryRecomAdapter.ViewHolder holder,int position) {
        holder.mTextViewNama.setText(MenuList.get(position).getMenu());
        holder.mTextViewAlamat1.setText(MenuList.get(position).getAlamat1());
        holder.getmTextViewAlamat2.setText(MenuList.get(position).getAlamat2());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), displayLaundry.class);
                intent.putExtra("nama", MenuList.get(position).getMenu());
                intent.putExtra("gambar", MenuList.get(position).getGambar());
                intent.putExtra("harga", MenuList.get(position).getHarga());
                intent.putExtra("harga2", MenuList.get(position).getHarga2());
                intent.putExtra("harga3", MenuList.get(position).getHarga3());
                intent.putExtra("harga4", MenuList.get(position).getHarga4());

                v.getContext().startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return MenuList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView mTextViewNama, mTextViewAlamat1, getmTextViewAlamat2;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextViewNama = itemView.findViewById(R.id.tvNama);
            mTextViewAlamat1 = itemView.findViewById(R.id.tvAlamat);
            getmTextViewAlamat2 = itemView.findViewById(R.id.tvAlamat2);
        }
        }
    }


package com.risda.washl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.risda.washl.modal.Order;
import com.risda.washl.modal.Pelanggan;

import java.util.List;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.ViewHolder>{

    List<Pelanggan> PelangganList;

    Context context;

    public CustomerAdapter(List <Pelanggan> PelangganList ) {
        this.PelangganList = PelangganList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View cView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem_customer, parent, false);
        ViewHolder cViewHolder = new ViewHolder(cView);
        return cViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.username.setText(PelangganList.get(position).getPelanggan());
        Glide.with(holder.itemView.getContext())
                .load(""+PelangganList.get(position).getAvauser())
                .into(holder.pp);
    }

    @Override
    public int getItemCount() {
        return PelangganList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView username;
        ImageView pp;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
           username = itemView.findViewById(R.id.usrCus);
            pp = itemView.findViewById(R.id.customerPP);
        }
    }
}

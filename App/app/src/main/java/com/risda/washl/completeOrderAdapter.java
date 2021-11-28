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

import java.util.List;

public class completeOrderAdapter extends RecyclerView.Adapter<completeOrderAdapter.ViewHolder> {

    List<Order> OrderList2;

    public completeOrderAdapter(List <Order> OrderList2){
        this.OrderList2 = OrderList2;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View hView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem_completeorder, parent, false);
        ViewHolder hViewHolder = new ViewHolder(hView);
        return hViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvalamatuser.setText(OrderList2.get(position).getAlamat());
        holder.tvnamauser.setText(OrderList2.get(position).getPelanggan());
        holder.tvjeniscucian1.setText(String.valueOf(OrderList2.get(position).getBerat1()));
        holder.tvjeniscucian2.setText(String.valueOf(OrderList2.get(position).getBerat2()));
        holder.tvjeniscucian3.setText(String.valueOf(OrderList2.get(position).getBerat3()));
        holder.tvjeniscucian4.setText(String.valueOf(OrderList2.get(position).getBerat4()));
        holder.tgl.setText(OrderList2.get(position).getTglorder());
        holder.totalPendapatan.setText(String.valueOf(OrderList2.get(position).getTotal()));


    }

    @Override
    public int getItemCount() {
        return OrderList2.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvnamauser;
        TextView tvalamatuser;
        TextView tvjeniscucian1;
        TextView tvjeniscucian2;
        TextView tvjeniscucian3;
        TextView tvjeniscucian4;
        TextView tgl;
        TextView totalPendapatan;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvnamauser = itemView.findViewById(R.id.tvUsernameLd);
            tvalamatuser = itemView.findViewById(R.id.tvAlamatLd);
            tvjeniscucian1 = itemView.findViewById(R.id.tvJenisCucianLd1);
            tvjeniscucian2 = itemView.findViewById(R.id.tvJenisCucianLd2);
            tvjeniscucian3 = itemView.findViewById(R.id.tvJenisCucianLd3);
            tvjeniscucian4 = itemView.findViewById(R.id.tvJenisCucianLd4);
            tgl = itemView.findViewById(R.id.tglHistoryOwnr);
            totalPendapatan = itemView.findViewById(R.id.totalHarga);

        }
    }
}

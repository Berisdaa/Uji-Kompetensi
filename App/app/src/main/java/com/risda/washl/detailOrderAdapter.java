package com.risda.washl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.risda.washl.modal.Order;

import java.util.List;

public class detailOrderAdapter extends RecyclerView.Adapter<detailOrderAdapter.ViewHolder> {

    List<Order> OrderList4;

    public detailOrderAdapter(List <Order> OrderList4){
        this.OrderList4 = OrderList4;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View hView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_detailorder, parent, false);
        ViewHolder hViewHolder = new ViewHolder(hView);
        return hViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull detailOrderAdapter.ViewHolder holder, int position) {
        if (OrderList4.get(position).getStatus() == 1) {
        holder.tvNamaLaundry.setText(OrderList4.get(position).getPelanggan());
        holder.tvHargaLaundry.setText(String.valueOf(OrderList4.get(position).getTotal()));
        holder.tvBeratLaundry1.setText(String.valueOf(OrderList4.get(position).getBerat1()));
        holder.tvBeratLaundry2.setText(String.valueOf(OrderList4.get(position).getBerat2()));
        holder.tvBeratLaundry3.setText(String.valueOf(OrderList4.get(position).getBerat3()));
        holder.tvBeratLaundry4.setText(String.valueOf(OrderList4.get(position).getBerat4()));
        holder.hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Pesanan Dihapus", Toast.LENGTH_SHORT).show();
            }
        });
        }else {
            holder.itemView.setVisibility(View.GONE);
            holder.itemView.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
        }

    }

    @Override
    public int getItemCount() {
        return OrderList4.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvNamaLaundry;


        TextView tvBeratLaundry1;
        TextView tvBeratLaundry2;
        TextView tvBeratLaundry3;
        TextView tvBeratLaundry4;
        TextView tvHargaLaundry;
        ImageButton hapus;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaLaundry = itemView.findViewById(R.id.tvNamaLaundry);
            tvBeratLaundry1 = itemView.findViewById(R.id.tvberatCucian1);
            tvBeratLaundry2 = itemView.findViewById(R.id.tvberatCucian2);
            tvBeratLaundry3 = itemView.findViewById(R.id.tvberatCucian4);
            tvBeratLaundry4 = itemView.findViewById(R.id.tvberatCucian4);
            tvHargaLaundry = itemView.findViewById(R.id.tvhargaCucian);
            hapus = itemView.findViewById(R.id.btnHapusOrder);
        }
    }
}

package com.risda.washl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.risda.washl.modal.Menu;
import com.risda.washl.modal.Order;

import java.util.List;


public class historyUserAdapter extends RecyclerView.Adapter<historyUserAdapter.ViewHolder> {

    List<Order> OrderList;

    Context context;

    public historyUserAdapter(List <Order> OrderList ) {
        this.OrderList = OrderList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View hView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem_historyuser, parent, false);
        ViewHolder hViewHolder = new ViewHolder(hView);
        return hViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull historyUserAdapter.ViewHolder holder, int position) {
        holder.tvusername.setText(OrderList.get(position).getPelanggan());
        holder.tvalamatLdr.setText(OrderList.get(position).getAlamat());
        holder.tvjeniscucian1.setText(String.valueOf(OrderList.get(position).getBerat1()));
        holder.tvjeniscucian2.setText(String.valueOf(OrderList.get(position).getBerat2()));
        holder.tvjeniscucian3.setText(String.valueOf(OrderList.get(position).getBerat3()));
        holder.tvjeniscucian4.setText(String.valueOf(OrderList.get(position).getBerat4()));
        holder.tglOrder.setText(OrderList.get(position).getTglorder());

    }

    @Override
    public int getItemCount() {
        return OrderList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvusername;
        TextView tvalamatLdr;
        TextView tvjeniscucian1;
        TextView tvjeniscucian2;
        TextView tvjeniscucian3;
        TextView tvjeniscucian4;
        TextView tglOrder;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvusername = itemView.findViewById(R.id.tvUsernameLdr);
            tvalamatLdr = itemView.findViewById(R.id.tvAlamatLdr);
            tvjeniscucian1 = itemView.findViewById(R.id.tvJenisCucian1);
            tvjeniscucian2 = itemView.findViewById(R.id.tvJenisCucian2);
            tvjeniscucian3 = itemView.findViewById(R.id.tvJenisCucian3);
            tvjeniscucian4 = itemView.findViewById(R.id.tvJenisCucian4);
            tglOrder = itemView.findViewById(R.id.tglHistoryUsr);

        }
    }

}

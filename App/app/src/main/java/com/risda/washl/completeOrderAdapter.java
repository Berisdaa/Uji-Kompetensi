package com.risda.washl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class completeOrderAdapter extends RecyclerView.Adapter<completeOrderAdapter.ViewHolder> {

    completeOrder[] completeOrders;
    Context contex;

    public completeOrderAdapter(completeOrder[] completeOrders, CompletedOrderOwner activity){
        this.completeOrders = completeOrders;
        this.contex = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.listitem_completeorder,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull completeOrderAdapter.ViewHolder holder, int position) {
        final completeOrder completeOrderList = completeOrders[position];
        holder.tvberatcucian.setText(completeOrderList.getBeratLd());
        holder.tvnamauser.setText(completeOrderList.getUsernameLd());
        holder.tvalamatuser.setText(completeOrderList.getAlamatLd());
        holder.tvjeniscucian.setText(completeOrderList.getJenisCucianLd());
    }

    @Override
    public int getItemCount() {
        return completeOrders.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvberatcucian;
        TextView tvnamauser;
        TextView tvalamatuser;
        TextView tvjeniscucian;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvberatcucian = itemView.findViewById(R.id.tvBeratLd);
            tvnamauser = itemView.findViewById(R.id.tvUsernameLd);
            tvalamatuser = itemView.findViewById(R.id.tvAlamatLd);
            tvjeniscucian = itemView.findViewById(R.id.tvJenisCucianLd);
        }
    }
}

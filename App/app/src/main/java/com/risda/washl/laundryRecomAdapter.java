package com.risda.washl;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class laundryRecomAdapter extends RecyclerView.Adapter<laundryRecomAdapter.ViewHolder> {

    laundryRecomStr[] laundryRecomStrs;
    Context context;

    public laundryRecomAdapter(laundryRecomStr[] laundryRecomStrs, HomepageUser activity) {
        this.laundryRecomStrs = laundryRecomStrs;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.listitem_laundryhome,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull laundryRecomAdapter.ViewHolder holder, int position) {
        final laundryRecomStr laundryRecomStrList = laundryRecomStrs[position];
        holder.tvLaundryHome.setText(laundryRecomStrList.getNamaLdrHome());
        holder.tvAlamat1Ldr.setText(laundryRecomStrList.getAlamat1Home());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, displayLaundry.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return laundryRecomStrs.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvLaundryHome;
        TextView tvAlamat1Ldr;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvLaundryHome = itemView.findViewById(R.id.laundryHome);
            tvAlamat1Ldr = itemView.findViewById(R.id.alamatOwnerHome);
        }
    }
}

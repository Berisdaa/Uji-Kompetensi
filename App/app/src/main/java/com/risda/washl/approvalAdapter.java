package com.risda.washl;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class approvalAdapter extends RecyclerView.Adapter<approvalAdapter.ViewHolder> {

    approvalStr[] approvalStrs;
    Context context;

    public approvalAdapter(approvalStr[] approvalStrs, Approval activity){
        this.approvalStrs = approvalStrs;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.listitem_approval,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull approvalAdapter.ViewHolder holder, int position) {
        final approvalStr approvalStrList = approvalStrs[position];
        holder.tvBeratOd.setText(approvalStrList.getBeratOrder());
        holder.tvUserOd.setText(approvalStrList.getUserOrder());
        holder.tvAlamatOd.setText(approvalStrList.getAlamatOrder());
        holder.tvCucianOd.setText(approvalStrList.getCucianOrder());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ApprovalOrder.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return approvalStrs.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
            TextView tvBeratOd;
            TextView tvUserOd;
            TextView tvAlamatOd;
            TextView tvCucianOd;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvBeratOd = itemView.findViewById(R.id.tvBeratOrder);
            tvUserOd = itemView.findViewById(R.id.tvUserOrder);
            tvAlamatOd = itemView.findViewById(R.id.tvAlamatOrder);
            tvCucianOd = itemView.findViewById(R.id.tvCucianOrder);
        }
    }
}

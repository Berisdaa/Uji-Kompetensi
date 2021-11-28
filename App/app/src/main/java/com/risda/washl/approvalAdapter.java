package com.risda.washl;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.risda.washl.modal.Order;

import java.util.List;

public class approvalAdapter extends RecyclerView.Adapter<approvalAdapter.ViewHolder> {

    Dialog myDialog;
    List<Order> OrderList3;
    Context context;
    public approvalAdapter(List <Order> OrderList3  ) {
        this.OrderList3 = OrderList3;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View hView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem_approval, parent, false);
        ViewHolder hViewHolder = new ViewHolder(hView);
        return hViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull approvalAdapter.ViewHolder holder, int position) {
        if (OrderList3.get(position).getStatus() == 0) {
            holder.tvUserOd.setText(OrderList3.get(position).getPelanggan());
            holder.tvAlamatOd.setText(OrderList3.get(position).getAlamat());
            holder.tvCucianOd1.setText(String.valueOf(OrderList3.get(position).getBerat1()));
            holder.tvCucianOd2.setText(String.valueOf(OrderList3.get(position).getBerat2()));
            holder.tvCucianOd3.setText(String.valueOf(OrderList3.get(position).getBerat3()));
            holder.tvCucianOd4.setText(String.valueOf(OrderList3.get(position).getBerat4()));
            holder.tgl.setText(OrderList3.get(position).getTglorder());
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    myDialog = new Dialog(v.getContext());
                    myDialog.setContentView(R.layout.dialog_approval);
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        myDialog.create();

                        Button btnNo = myDialog.findViewById(R.id.btnOrderTidak);
                        btnNo.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                myDialog.dismiss();
                            }
                        });

                        Button btnYes = myDialog.findViewById(R.id.btnOrderYa);
                        btnYes.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(v.getContext(), "Pesanan Diterima", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                    myDialog.show();

                }
            });
        }else {
            holder.itemView.setVisibility(View.GONE);
            holder.itemView.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
        }
    }

    @Override
    public int getItemCount() {
        return OrderList3.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
            TextView tvUserOd;
            TextView tvAlamatOd;
            TextView tvCucianOd1;
        TextView tvCucianOd2;
        TextView tvCucianOd3;
        TextView tvCucianOd4;
        TextView tgl;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvUserOd = itemView.findViewById(R.id.tvUserOrder);
            tvAlamatOd = itemView.findViewById(R.id.tvAlamatOrder);
            tvCucianOd1 = itemView.findViewById(R.id.tvCucianOrder1);
            tvCucianOd2 = itemView.findViewById(R.id.tvCucianOrder2);
            tvCucianOd3 = itemView.findViewById(R.id.tvCucianOrder3);
            tvCucianOd4 = itemView.findViewById(R.id.tvCucianOrder4);
            tgl = itemView.findViewById(R.id.tglApproval);
        }
    }
}

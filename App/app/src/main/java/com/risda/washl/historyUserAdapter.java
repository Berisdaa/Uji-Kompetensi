package com.risda.washl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class historyUserAdapter extends RecyclerView.Adapter<historyUserAdapter.ViewHolder> {

    historyUserStr[] historyUserStrs;
    Context context;

    public historyUserAdapter(historyUserStr[] historyUserStrs, HistoryUser activity){
        this.historyUserStrs = historyUserStrs;
        this.context = activity;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.listitem_historyuser,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull historyUserAdapter.ViewHolder holder, int position) {
        final historyUserStr historyUserStrList = historyUserStrs[position];
        holder.tvTotalLdr.setText(historyUserStrList.getBeratLdr());
        holder.tvusername.setText(historyUserStrList.getUsername());
        holder.tvalamatLdr.setText(historyUserStrList.getAlamatUsr());
        holder.tvjeniscucian.setText(historyUserStrList.getJenisCucian());
    }

    @Override
    public int getItemCount() {
        return historyUserStrs.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvTotalLdr;
        TextView tvusername;
        TextView tvalamatLdr;
        TextView tvjeniscucian;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTotalLdr = itemView.findViewById(R.id.tvBeratLdr);
            tvusername = itemView.findViewById(R.id.tvUsernameLdr);
            tvalamatLdr = itemView.findViewById(R.id.tvAlamatLdr);
            tvjeniscucian = itemView.findViewById(R.id.tvJenisCucianLdr);

        }
    }

}

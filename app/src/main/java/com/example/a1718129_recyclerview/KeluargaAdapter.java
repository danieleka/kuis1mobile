package com.example.a1718129_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KeluargaAdapter extends RecyclerView.Adapter<KeluargaAdapter.KeluargaViewHolder> {
    private ArrayList<Keluarga> dataList;

    public KeluargaAdapter(ArrayList<Keluarga> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public KeluargaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_keluarga, parent, false);
        return new KeluargaViewHolder(view);
    }

    public void onBindViewHolder(KeluargaViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtStts.setText(dataList.get(position).getStatus());
        holder.Vfoto.setImageResource(dataList.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class KeluargaViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtStts;
        private ImageView Vfoto;

        public KeluargaViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama_keluarga);
            txtStts = (TextView) itemView.findViewById(R.id.txt_status_keluarga);
            Vfoto = (ImageView) itemView.findViewById(R.id.viewfoto);
        }
    }
}

package com.TwentyFourTech.brainlimits.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.TwentyFourTech.brainlimits.R;
import com.TwentyFourTech.brainlimits.model.ModelSoal;

import java.util.List;

public class AdapterSoal extends android.support.v7.widget.RecyclerView.Adapter<AdapterSoal.MyViewHolder> {

    Context mContext;
    List<ModelSoal> mData;

    public AdapterSoal(Context mContext, List<ModelSoal> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v= LayoutInflater.from(mContext).inflate(R.layout.item_soal,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);


        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_tipee.setText(mData.get(position).getTipe());
        holder.tv_soall.setText(mData.get(position).getSoalBro());
        holder.tv_kunciia.setText(mData.get(position).getKuncijawabA());
        holder.tv_kunciib.setText(mData.get(position).getKuncijawabB());
        holder.tv_kunciic.setText(mData.get(position).getKuncijawabC());
        holder.tv_kunciid.setText(mData.get(position).getKuncijawabD());

        holder.img.setImageResource(mData.get(position).getPhoto());



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{


        private TextView tv_tipee;
        private TextView tv_soall;
        private TextView tv_kunciia;
        private TextView tv_kunciib;
        private TextView tv_kunciic;
        private TextView tv_kunciid;

        private ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_tipee = (TextView) itemView.findViewById(R.id.tipe_soal);
            tv_soall = (TextView)itemView.findViewById(R.id.soal);
            tv_kunciia = (TextView) itemView.findViewById(R.id.kunci_a);
            tv_kunciib = (TextView)itemView.findViewById(R.id.kunci_b);
            tv_kunciic = (TextView) itemView.findViewById(R.id.kunci_c);
            tv_kunciid = (TextView)itemView.findViewById(R.id.kunci_d);

            img = (ImageView) itemView.findViewById(R.id.img_soal);



        }
    }




}


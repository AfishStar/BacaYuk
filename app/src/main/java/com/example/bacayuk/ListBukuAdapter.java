package com.example.bacayuk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListBukuAdapter extends RecyclerView.Adapter<ListBukuAdapter.ListViewHolder> {

    private ArrayList<buku> listbuku;

    public ListBukuAdapter(ArrayList<buku>list)
    {
        this.listbuku=list;
    }
    
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_buku, viewGroup,false);
        return new ListViewHolder(view);
    }
    

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position)
    {
        buku buku=listbuku.get(position);
        Glide.with(holder.itemView.getContext())
                .load(buku.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(buku.getName());
        holder.tvDetail.setText(buku.getDetail());
    }

    @Override
    public int getItemCount()
    {
        return listbuku.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        ListViewHolder(View itemView)
        {
            super(itemView);
            imgPhoto=itemView.findViewById(R.id.img_item_photo);
            tvName=itemView.findViewById(R.id.tv_item_name);
            tvDetail=itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
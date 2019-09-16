package com.addindev.submission;

import android.content.Intent;
import android.util.Log;
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

public class ListContentAdapter extends RecyclerView.Adapter<ListContentAdapter.ListViewHolder> {
    private ArrayList<Content> listcontent;

    public ListContentAdapter(ArrayList<Content> list) {
        Log.d("IDN",list.get(0).getName());
        this.listcontent = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_content, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, final int position) {
        Content content = listcontent.get(position);

        Glide.with(holder.itemView.getContext())
                .load(content.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.tvName.setText(content.getName());
        holder.tvDetail.setText(content.getDetails());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveIntent = new Intent(view.getContext(), DetailContentAdapter.class);
                moveIntent.putExtra("objek", listcontent.get(position));
                view.getContext().startActivity(moveIntent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listcontent.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}


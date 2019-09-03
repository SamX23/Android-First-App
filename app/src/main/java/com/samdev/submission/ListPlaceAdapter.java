package com.samdev.submission;

import android.content.Intent;
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

public class ListPlaceAdapter extends RecyclerView.Adapter<ListPlaceAdapter.ListViewHolder> {
    private ArrayList<Place> listPlace;
    private OnItemClickCallback onItemClickCallback;

    ListPlaceAdapter(ArrayList<Place> list) {
        this.listPlace = list;
    }

    void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.place_list, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Place place = listPlace.get(position);

        Glide.with(holder.itemView.getContext())
                .load(place.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.tvName.setText(place.getName());
        holder.tvFrom.setText(place.getFrom());

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listPlace.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPlace.size();
    }


    public interface OnItemClickCallback {
        void onItemClicked(Place data);
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvFrom;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.place_photo);
            tvName = itemView.findViewById(R.id.place_name);
            tvFrom = itemView.findViewById(R.id.place_desc);
        }
    }

}

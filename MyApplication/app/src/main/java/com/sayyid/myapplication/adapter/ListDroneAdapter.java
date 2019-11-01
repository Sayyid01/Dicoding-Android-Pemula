package com.sayyid.myapplication.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.sayyid.myapplication.R;
import com.sayyid.myapplication.model.Drone;
import com.sayyid.myapplication.model.DroneData;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListDroneAdapter extends RecyclerView.Adapter<ListDroneAdapter.ListViewHolder> {
    ArrayList<Drone> arrDrone;

    public ListDroneAdapter(ArrayList<Drone> arrDrone) {
        this.arrDrone = arrDrone;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_drone, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, final int position) {
        Drone drone = arrDrone.get(position);
        Glide.with(holder.itemView.getContext())
                .load(drone.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(drone.getName());
        holder.tvDescription.setText(drone.getDescription());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetailDroneAdapter.class);

                intent.putExtra("droneImage", arrDrone.get(position).getPhoto());
                intent.putExtra("droneName", arrDrone.get(position).getName());
                intent.putExtra("droneDetail", arrDrone.get(position).getDetail());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrDrone.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDescription;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDescription = itemView.findViewById(R.id.tv_item_description);
        }
    }
}

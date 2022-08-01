package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecycleView extends RecyclerView.Adapter<AdapterRecycleView.ViewHolder> {

    private ArrayList<ItemModel> dataItem;

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtHead;
        TextView txtSubhead;
        ImageView imageIcon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtHead = itemView.findViewById(R.id.text_title);
            txtSubhead = itemView.findViewById(R.id.text_subtitle);
            imageIcon = itemView.findViewById(R.id.image1);
        }
    }

    AdapterRecycleView(ArrayList<ItemModel> dataItem) {
        this.dataItem = dataItem;
    }

    @NonNull
    @Override
    public AdapterRecycleView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecycleView.ViewHolder holder, int position) {

        TextView textHead = holder.txtHead;
        TextView txtSubhead = holder.txtSubhead;
        ImageView imageIcon = holder.imageIcon;

        textHead.setText(dataItem.get(position).getName());
        txtSubhead.setText(dataItem.get(position).getType());
        imageIcon.setImageResource(dataItem.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }
}

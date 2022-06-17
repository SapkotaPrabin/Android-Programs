package com.example.recycle_view;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    Activity context;
    ArrayList<DataModel>data;

    public RecyclerViewAdapter(Activity context, ArrayList<DataModel> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View listItem = layoutInflater.inflate(R.layout.list_items,parent,false);
        ViewHolder viewHolder = new ViewHolder(listItem) ;
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final DataModel current = data.get(position);
        holder.txtName.setText(current.getName());
        holder.txtDate.setText(current.getDate());
        holder.txtNo.setText(current.getNum());
        holder.txtPrice.setText(current.getPrice());
    }
    @Override
    public int getItemCount() {
        return data.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtName,txtDate,txtNo,txtPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtDate = itemView.findViewById(R.id.txtDate);
            txtNo = itemView.findViewById(R.id.txtNo);
            txtPrice = itemView.findViewById(R.id.txtPrice);
        }
    }

}

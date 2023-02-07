package com.example.displaydata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter <DataAdapter.MyViewholder> {

    ArrayList<Model> mList;
    Context context;

    public DataAdapter(Context context,ArrayList<Model> mList){
        this.mList = mList;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.data_items, parent, false);
        return new MyViewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MyViewholder holder, int position) {

        Model model = mList.get(position);
        holder.name.setText(model.getName());
        holder.number.setText(model.getNumber());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MyViewholder extends RecyclerView.ViewHolder{

        TextView name, number;

        public MyViewholder(@NonNull @NotNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name_text);
            number = itemView.findViewById(R.id.number_text);
        }
    }
}

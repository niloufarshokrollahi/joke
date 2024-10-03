package com.example.myjokeapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapterJoke extends RecyclerView.Adapter<viewHolderJoke>{
    private static List<ModelJoke> jokes=new ArrayList<>();
    public void addJoke(ModelJoke joke){
        jokes.add(0,joke);
        notifyItemInserted(0);
    }

    @NonNull
    @Override
    public viewHolderJoke onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.itemjoke,parent,false);
        return new viewHolderJoke(view);
    }
    @Override
    public void onBindViewHolder(@NonNull viewHolderJoke holder, int position) {
        holder.bind(jokes.get(position));
    }

    @Override
    public int getItemCount() {
        return jokes.size();
    }
}

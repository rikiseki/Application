package com.example.myapplication.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {
    private Activity activity;
    public ListAdapter(Activity activity){
        this.activity=activity;
    }

    @NonNull
    @Override
    public ListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater inflater=activity.getLayoutInflater();
        View view=null;
        if(i== R.layout.message_list_item_normal){
            view =inflater.inflate(R.layout.message_list_item_normal,parent,false);
        }
        MyViewHolder viewHolder=new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    @Override
    public int getItemViewType(int position) {
        return R.layout.message_list_item_normal;
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        public MyViewHolder(View itemView){
            super(itemView);
        }
    }
}

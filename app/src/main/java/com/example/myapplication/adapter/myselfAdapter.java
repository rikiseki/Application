package com.example.myapplication.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;

public class myselfAdapter extends RecyclerView.Adapter<myselfAdapter.MyViewHolder> {
    private Activity activity;
    public myselfAdapter(Activity activity){
        this.activity=activity;
    }

    @NonNull
    @Override
    public myselfAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater inflater=activity.getLayoutInflater();
        View view=null;
        if(i== R.layout.myself){
            view =inflater.inflate(R.layout.myself,parent,false);
        }
        MyViewHolder viewHolder=new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull myselfAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    @Override
    public int getItemViewType(int position) {
        return R.layout.myself;
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        public MyViewHolder(View itemView){
            super(itemView);
        }
    }
}

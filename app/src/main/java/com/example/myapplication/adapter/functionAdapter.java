package com.example.myapplication.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.input;

import java.util.List;
import java.util.Scanner;

public class functionAdapter extends RecyclerView.Adapter<functionAdapter.MyViewHolder> {
    private Activity activity;
    public functionAdapter(Activity activity){
        this.activity=activity;
    }

    @NonNull
    @Override
    public functionAdapter.MyViewHolder onCreateViewHolder(ViewGroup  parent, int viewType) {
        LayoutInflater inflater=activity.getLayoutInflater();
        View view =null;
        if(viewType== R.layout.function){
            view=inflater.inflate(R.layout.function,parent,false);
        }
        MyViewHolder viewHolder=new MyViewHolder(view);
        Button button=(Button) view.findViewById(R.id.button_func1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(activity,input.class);
                activity.startActivityForResult(intent,101);

            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(functionAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    @Override
    public int getItemViewType(int position) {
        return R.layout.function;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        public MyViewHolder(View itemView){
            super(itemView);
        }
    }

}

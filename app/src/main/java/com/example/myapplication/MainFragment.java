package com.example.myapplication;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

import com.example.myapplication.adapter.ListAdapter;
import com.example.myapplication.adapter.functionAdapter;
import com.example.myapplication.adapter.myselfAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    private ViewPager viewPager;
    private View listViews[] = {null, null, null};
    private TabLayout tabLayout;
    public MainFragment() {
        // Required empty public constructor


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //LinearLayoutManager layoutManager=new LinearLayoutManager(getContext());
        RecyclerView v1 = new RecyclerView(getContext());
        RecyclerView v2 = new RecyclerView(getContext());
        RecyclerView v3 = new RecyclerView(getContext());
        listViews[0] = v1;
        listViews[1] = v2;
        listViews[2] = v3;
        v1.setLayoutManager(new LinearLayoutManager(getContext()));
        v1.setAdapter(new ListAdapter(getActivity()));
        v2.setLayoutManager(new LinearLayoutManager(getContext()));
        v2.setAdapter(new functionAdapter(getActivity()));
        v3.setLayoutManager(new LinearLayoutManager(getContext()));
        v3.setAdapter(new myselfAdapter(getActivity()));
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        viewPager=(ViewPager) v.findViewById(R.id.viewPager);
        viewPager.setAdapter(new ViewPageAdapter());
        tabLayout=(TabLayout) v.findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
        return v;
    }


    class ViewPageAdapter extends PagerAdapter {
        ViewPageAdapter(){

        }

        @Override
        public int getCount() {
            return listViews.length;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
            return view == o;
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            View v=listViews[position];
            container.addView(v);
            return v;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView((View) object);
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            if(position==0) {
                return "列表";
            }else if(position==1){
                return "功能";
            }else if(position==2){
                return "个人";
            }
            return null;
        }

    }
}

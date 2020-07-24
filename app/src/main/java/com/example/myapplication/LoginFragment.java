package com.example.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class LoginFragment extends Fragment {
    EditText editTextName;
    EditText editTextPassword;
    View imageView ;
    RelativeLayout layout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //加载Fragment的界面
        View v = inflater.inflate(R.layout.fragment_login, container, false);
        //获取用户名和密码输入控件
        editTextName = (EditText) v.findViewById(R.id.editTextName);
        editTextPassword = (EditText) v.findViewById(R.id.editTextPassword);

        //用id找到用户输入控件
        editTextName = (EditText) v.findViewById(R.id.editTextName);
        //用代码设置它的提示
        editTextName.setHint("请输入用户名");
        //Button buttonLogin=(Button) v.findViewById(R.id.buttonLogin);
        /*buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar=Snackbar.make(v,"登录成功",Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });*/
        View buttonLogin=v.findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getActivity().getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                MainFragment f=new MainFragment();
                ft.replace(R.id.fragment_container,f);
                ft.addToBackStack("login");
                ft.commit();
            }
        });
        Button buttonRegister=(Button)v.findViewById(R.id.buttonRegister);
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getActivity().getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                RegisterFragment f=new RegisterFragment();
                ft.replace(R.id.fragment_container,f);
                ft.addToBackStack("login");
                ft.commit();
            }
        });
        return v;
    }
    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState){
        super.onViewStateRestored(savedInstanceState);
        MainActivity activity=(MainActivity)getActivity();
        if(activity!=null){
            if(activity.username!=null){
                editTextName.setText(activity.username);
            }
            if(activity.password!=null){
                editTextPassword.setText(activity.password);
            }
        }
    }
}

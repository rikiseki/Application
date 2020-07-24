package com.example.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends Fragment {


    public RegisterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view =inflater.inflate(R.layout.fragment_register,container,false);
        Button buttoncancel=(Button)view.findViewById(R.id.button_cancel);
        buttoncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getActivity().getSupportFragmentManager();
                fm.popBackStack();
            }
        });
        Button buttonok=(Button)view.findViewById(R.id.button_ok);
        buttonok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextName=(EditText)view.findViewById(R.id.editTextName);
                EditText editPassWord=(EditText)view.findViewById(R.id.editTextPass);
                EditText editTextEmail=(EditText)view.findViewById(R.id.editTextemail);
                EditText editTextPhone=(EditText)view.findViewById(R.id.editTextphone);
                String name=editTextName.getText().toString();
                String password=editPassWord.getText().toString();
                String phone=editTextPhone.getText().toString();
                String email=editTextEmail.getText().toString();
                MainActivity activity=(MainActivity)getActivity();
                if(activity!=null){
                    activity.username=name;
                    activity.password=password;
                }
                FragmentManager fm=getActivity().getSupportFragmentManager();
                fm.popBackStack();
            }
        });
        return view;
    }

}

package com.example.myapplication;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class input extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        Button buttoncancel=(Button) findViewById(R.id.button6);
        buttoncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(input.this,MainActivity.class);
                //setResult(1, intent);
                finish();
            }
        });
    }
}

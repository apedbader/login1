package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button_Register(View v){
        Intent intent= new Intent(MainActivity.this,SignUp.class);
        startActivity(intent);
    }

    public void button_login(View v){
        Intent intent= new Intent(MainActivity.this,HomePage.class);
        startActivity(intent);
    }

}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class firstActivity extends AppCompatActivity {


    public void changeActivity(View view){
        startActivity( new Intent( getApplicationContext(), secondActivity.class ) );
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_button_click );
    }
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MainActivity extends AppCompatActivity {

    float number1;
    float number2;


    EditText num1, num2;
    Button btn_add, btn_sub, btn_mul, btn_div;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        result = findViewById( R.id.result );

        num1 = findViewById( R.id.num1 );
        num2 = findViewById( R.id.num2 );

        btn_add = findViewById( R.id.btn_add );
        btn_sub = findViewById( R.id.btn_sub );
        btn_mul = findViewById( R.id.btn_mul );
        btn_div = findViewById( R.id.btn_div );


        btn_add.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1 = Float.parseFloat(num1.getText().toString());
                number2 = Float.parseFloat(num2.getText().toString());
                String output = String.valueOf( number1 + number2 );
                result.setText( output );
            }
        } );

        btn_sub.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1 = Float.parseFloat(num1.getText().toString());
                number2 = Float.parseFloat(num2.getText().toString());
                String output = String.valueOf( number1 - number2 );
                result.setText( output );
            }
        } );

        btn_mul.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1 = Float.parseFloat(num1.getText().toString());
                number2 = Float.parseFloat(num2.getText().toString());
                String output = String.valueOf( number1 * number2 );
                result.setText( output );
            }
        } );

        btn_div.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1 = Float.parseFloat(num1.getText().toString());
                number2 = Float.parseFloat(num2.getText().toString());
                String output = String.valueOf( number1 / number2 );
                result.setText( output );
            }
        } );

    }
}

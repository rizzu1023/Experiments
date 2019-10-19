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
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MainActivity extends AppCompatActivity {

    
    EditText data_field;
    Button write_btn, clear_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        data_field = findViewById( R.id.editText );
        write_btn = findViewById( R.id.write_btn );
        clear_btn = findViewById( R.id.clear_btn );
        
        write_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = data_field.getText().toString();

                try {
                    File f = new File( "/sdcard/data.txt" );
                    f.createNewFile();
                    FileOutputStream fout = new FileOutputStream( f );
                    fout.write( data.getBytes() );
                    fout.close();
                    Toast.makeText( MainActivity.this, "Data writen in SDCARD", Toast.LENGTH_SHORT ).show();
                }
                catch (Exception e){
                    Toast.makeText( MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT ).show();
                }
            }
        } );

        clear_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data_field.setText( "" );
            }
        } );


    }
}

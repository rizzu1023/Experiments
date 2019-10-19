package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        ImageView iv = findViewById( R.id.imageView );
        Bitmap bp = Bitmap.createBitmap( 720, 1200, Bitmap.Config.ARGB_8888 );

//        iv.setBackgroundDrawable( new BitmapDrawable( bp ) );

        iv.setBackground( new BitmapDrawable(getApplicationContext().getResources(), bp) );
        Canvas canvas = new Canvas( bp );

        Paint paint = new Paint( );
        paint.setColor( Color.BLUE);
        paint.setTextSize( 50 );

        canvas.drawText("Rectengle", 420, 150, paint);
        canvas.drawRect( 400, 200, 650, 700, paint );

        canvas.drawText( "Circle", 120, 150, paint );
        canvas.drawCircle( 200, 350, 50, paint );


    }
}

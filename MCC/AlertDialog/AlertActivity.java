package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AlertActivity extends AppCompatActivity {


    Button btn;
    EditText message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_alert );
        message = findViewById( R.id.editText );
        btn = findViewById( R.id.notify_button );

        btn.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                AlertDialog.Builder  alert_builder = new AlertDialog.Builder( AlertActivity.this );
                alert_builder.setMessage( "Do you want to close this app" )
                        .setCancelable( false )
                        .setPositiveButton( "Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        } ).setNegativeButton( "No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                } );

                AlertDialog alert = alert_builder.create();
                alert.setTitle( message.getText().toString() );
                alert.show();

            }
        } );

    }
}

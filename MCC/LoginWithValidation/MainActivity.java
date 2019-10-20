package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    EditText email , password;
    Button login_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        email = findViewById( R.id.editText );
        password = findViewById( R.id.editText2 );

        login_btn = findViewById( R.id.button );

        login_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail = email.getText().toString();

                String validEmail = String.format( "[a-zA-Z0-9\\+\\_\\-\\.\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,65}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})" );

                Matcher matcher = Pattern.compile(validEmail).matcher( mail );
                if(matcher.matches()){
                    Toast.makeText( MainActivity.this, "Succes", Toast.LENGTH_SHORT ).show();
                }
                else{
                    Toast.makeText( MainActivity.this, "Please Enter a valid Email Address", Toast.LENGTH_SHORT ).show();
                }

                if(password.getText().toString().equals("")){
                    password.setError( "Enter Password" );
                }

            }

        } );


    }
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText amount_field, tenure_field, interest_field;
    TextView result;
    Button btn_calculate;

    float amount,tenure,interest;
    float output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        amount_field = findViewById( R.id.amount_field );
        tenure_field = findViewById( R.id.tenure_field );
        interest_field = findViewById( R.id.interest_field );

        result = findViewById( R.id.result );

        btn_calculate = findViewById( R.id.btn_calculate );

        btn_calculate.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = Float.parseFloat( amount_field.getText().toString());
                tenure = Float.parseFloat( tenure_field.getText().toString());
                interest = Float.parseFloat( interest_field.getText().toString());

                float var = (interest * amount) / 100;
                output = (amount + var) / tenure;
                result.setText( "EMI : " + String.valueOf( output ) + " /per month" );
            }

        } );


    }
}

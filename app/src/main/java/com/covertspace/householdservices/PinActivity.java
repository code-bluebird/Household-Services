package com.covertspace.householdservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PinActivity extends AppCompatActivity {

    EditText pincode;
    Button pinbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);

        pincode = (EditText) findViewById(R.id.pincode);
        pinbtn = (Button) findViewById(R.id.pinbtn);

        pinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PinActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}

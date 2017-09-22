package com.example.josiah.loginsignup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    Button bCreateAccount;
    EditText firstname,lastname,email,password,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        firstname =(EditText) findViewById(R.id.firstname);
        lastname =(EditText) findViewById(R.id.lastname);
        email =(EditText) findViewById(R.id.email);
        password =(EditText) findViewById(R.id.password);
        phone =(EditText) findViewById(R.id.phone);

        final String fname = firstname.getText().toString();

        bCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendtoactivity = new Intent(Register.this,Homeactivity.class);
                startActivity(sendtoactivity);

            }
        });


    }

}

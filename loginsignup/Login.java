package com.example.josiah.loginsignup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    Button bLogin;
    TextView SignUplink;
    EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        bLogin = (Button) findViewById(R.id.bLogin);
        SignUplink = (TextView) findViewById(R.id.SignUplink);

        final String uname = (String)  username.getText().toString();

      bLogin.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent newce = new Intent(Login.this,Homeactivity.class);
              startActivity(newce);

              Intent senddata = new Intent(Login.this,Homeactivity.class);
              senddata.putExtra("unsernamevar",uname);
              startActivity(senddata);
          }
      });
    }

}

package com.example.fahad.login2application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txt_name, txt_email, txt_pass, txt_phone ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt_name = findViewById(R.id.tv_name) ;
        txt_email = findViewById(R.id.tv_email) ;
        txt_pass = findViewById(R.id.tv_password) ;
        txt_phone = findViewById(R.id.tv_phone) ;

        String name = getIntent().getStringExtra("Name") ;
        String email = getIntent().getStringExtra("Email") ;
        String password = getIntent().getStringExtra("Password") ;
        String phone = getIntent().getStringExtra("Phone") ;

        txt_name.setText(name);
        txt_email.setText(email);
        txt_pass.setText(password);
        txt_phone.setText(phone);
    }
}

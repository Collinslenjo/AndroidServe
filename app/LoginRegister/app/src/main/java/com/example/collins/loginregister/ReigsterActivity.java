package com.example.collins.loginregister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ReigsterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reigster);

        final EditText etUserName = (EditText) findViewById(R.id.etUserName);
        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        final EditText etPhoneNumber = (EditText) findViewById(R.id.etPhoneNumber);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button bRegister = (Button) findViewById(R.id.bRegister);
    }
}

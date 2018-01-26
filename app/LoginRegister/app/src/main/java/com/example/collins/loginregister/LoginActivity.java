package com.example.collins.loginregister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button bLogin = (Button) findViewById(R.id.bLogin);
        final TextView registerLink = (TextView) findViewById(R.id.tvRegister);

        registerLink.setOnClickListener(new view.OnClickListener() {
        	@Override
        	public void onClick(View v){
        		Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
        		LoginActivity.this.startActivity(registerIntent);
        	}
        });
    }
}

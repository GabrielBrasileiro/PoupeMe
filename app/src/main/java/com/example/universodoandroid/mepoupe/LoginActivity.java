package com.example.universodoandroid.mepoupe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private TextView mSenhaText;
    private TextView mEmailText;
    private Button mLoginButton;
    private Button mRegisterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mEmailText = (TextView) findViewById(R.id.activity_login_email_edit_text);
        mSenhaText = (TextView) findViewById(R.id.activity_login_senha_edit_text);

        mLoginButton = (Button) findViewById(R.id.activity_login_button);
        mRegisterButton = (Button) findViewById(R.id.activity_login_register_button);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = mEmailText.getText().toString().trim();

                Toast.makeText(getApplicationContext(), email, Toast.LENGTH_SHORT).show();
            }
        });

        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

    }

}

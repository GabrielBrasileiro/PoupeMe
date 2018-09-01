package com.example.universodoandroid.mepoupe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {

    private TextView mEmailText;
    private TextView mSenhaText;
    private FirebaseAuth mAuth;
    private Button mRegisterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mEmailText = (TextView) findViewById(R.id.activity_register_email_edit_text);
        mSenhaText = (TextView) findViewById(R.id.activity_register_senha_edit_text);
        mRegisterButton = (Button) findViewById(R.id.activity_register_button);

        mAuth = FirebaseAuth.getInstance();

        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAuth.createUserWithEmailAndPassword(
                        mEmailText.getText().toString(),
                        mSenhaText.getText().toString());
            }
        });
    }
}

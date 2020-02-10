package com.TwentyFourTech.brainlimits.Login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.TwentyFourTech.brainlimits.R;
import com.TwentyFourTech.brainlimits.BottomNav.BottomNav;
public class LoginActivity extends AppCompatActivity {
    SharedPrefManager sp;
    EditText nama, email;
    Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nama = findViewById(R.id.edt_nama);
        email = findViewById(R.id.edt_email);
        btnlogin = findViewById(R.id.btn_login);

        sp = new SharedPrefManager(this);
        ceklogin();
        login();
    }
    public void login() {
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nam = nama.getText().toString();
                String e = email.getText().toString();

                sp.saveSPString(SharedPrefManager.SP_NAMA, nam);
                sp.saveSPString(SharedPrefManager.SP_EMAIL, e);

                sp.saveSPBolean(SharedPrefManager.SP_SUDAH_LOGIN, true);

                startActivity(new Intent(LoginActivity.this, BottomNav.class));

                Toast.makeText(getApplicationContext(), "Success Login", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void ceklogin() {

        if (sp.Login()) {
            startActivity(new Intent(LoginActivity.this, BottomNav.class));
            finish();
        }
    }

}
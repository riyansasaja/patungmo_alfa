package com.example.patungmoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button btn_login, btn_contact_admin;
    EditText et_username, et_password;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login = findViewById(R.id.btn_login);
        btn_contact_admin = findViewById(R.id.btn_contact_admin);
        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);


    }


    public void buttonLogin(View view) {
        String isiusername = et_username.getText().toString();
        String isipassword = et_password.getText().toString();
        if (isiusername.equals("andika") && isipassword.equals("Tato")) {
            Log.d("Password", "True ");
            Intent gotodashboard = new Intent(LoginActivity.this, DashboardActivity.class);
            startActivity(gotodashboard);
        } else{
            Toast.makeText(this, "Username/Password Salah !", Toast.LENGTH_SHORT).show();
        }


    }


    public void buttonContactAdmin(View view) {
        String url  = "https://wa.me/+6282194702123?text=Mohon%20bantuannya%20untuk%20aplikasi%20PAtung MO%20Terimakasih";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
}
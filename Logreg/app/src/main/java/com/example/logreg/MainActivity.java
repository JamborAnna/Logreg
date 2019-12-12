package com.example.logreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public  AdatbazisSegito adatbazisSegito;
    private EditText FelhText,JelText;
    private Button bejelentkezes, regisztracio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        init();
        bejelentkezes.setOnClickListener({
                Intent intent = new Intent(MainActivity.this, LoggedInAvtivity.class);
        startActivities(intent);
        finish();
        });
        regisztracio.setOnClickListener({
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
        startActivities(intent);
        finish();
        });
    }
    public  void  init(){
        adatbazisSegito=new AdatbazisSegito(MainActivity.this);
        bejelentkezes=findViewById(R.id.bejelentkezes);
        regisztracio=findViewById(R.id.regisztracio);
        FelhText=findViewById(R.id.FelhText);
        JelText=findViewById(R.id.JelText);
    }
}

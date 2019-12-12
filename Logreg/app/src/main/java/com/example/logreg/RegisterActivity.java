package com.example.logreg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.net.IDN;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        AdatbazisSegito adatbazisSegito;
        private TextView emailT,felhT,jelszoT,teljesT;
        private Button regB, visszaB;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_main);
            init();
            regB.setOnClickListener({
                    Intent intent = new Intent(RegisterActivity.this, LoggedInAvtivity.class);
            startActivities(intent);
            finish();
        });
            visszaB.setOnClickListener({
                    Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
            startActivities(intent);
            finish();
        });
        }
        public  void  init(){
            adatbazisSegito=new AdatbazisSegito(update.this);
            emailT=findViewById(R.id.emailT);
            felhT=findViewById(R.id.felhT);
            jelszoT=findViewById(R.id.jelszoT);
            teljesT=findViewById(R.id.teljesT);
            regB=findViewById(R.id.regB);
            visszaB=findViewById(R.id.visszaB);
        }




    }
}

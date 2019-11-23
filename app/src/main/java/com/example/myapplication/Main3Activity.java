package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;

import java.util.TimerTask;

public class Main3Activity extends AppCompatActivity {
    Button cancelBut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        cancelBut = findViewById(R.id.cancelbut);
        cancelBut.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View v){
                Intent cancel = new Intent(Main3Activity.this,MainActivity.class);
                startActivity(cancel);
        }
        }
        );

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Main3Activity.this, Main4Activity.class);
                startActivity(i);
                finish();
            }
        }, 5000);

    }
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView hello;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hello = findViewById(R.id.hello);
        button1 = findViewById(R.id.button);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                hello.setText("Hi world!!");
            }
        });


        //hello.setText("Hi world!!");
    }
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button medicBut,crimeBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        medicBut = findViewById(R.id.medicbut);
        crimeBut = findViewById(R.id.crimebut);


        medicBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Medic Button Clicked", Toast.LENGTH_SHORT).show();
                Intent med = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(med);
            }
        });
       crimeBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Crime Button Clicked", Toast.LENGTH_SHORT).show();
                Intent cri = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(cri);
            }

        });


    }
}

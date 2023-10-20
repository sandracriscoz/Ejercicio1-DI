package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button jugador = (Button) findViewById(R.id.button2);
        jugador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botonPlayer();
            }
        });

    }
        public void botonPlayer() {
            Intent i = new Intent(this, NewPlayer.class);
            startActivity(i);
        }

    }
package com.example.metro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Linea1Estaciones extends AppCompatActivity {

    private Button buttonMapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linea1_estaciones);

        buttonMapa = findViewById(R.id.mapab);
        buttonMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Linea1Estaciones.this, Pag4.class);
                startActivity(intent);
                finish();
            }

        });
    }
}
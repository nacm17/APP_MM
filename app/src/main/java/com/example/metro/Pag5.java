package com.example.metro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pag5 extends AppCompatActivity {

    private Button buttonR1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag5);

        buttonR1 = findViewById(R.id.Recorrido1);
        buttonR1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pag5.this, Linea1Estaciones.class);
                startActivity(intent);
                finish();
            }

        });
    }
}
package com.example.metro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pag3 extends AppCompatActivity {

    private Button buttonLinea1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag3);

        buttonLinea1 = findViewById(R.id.linea1);
        buttonLinea1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pag3.this, Pag4.class);
                startActivity(intent);
                finish();
            }

        });
    }
}
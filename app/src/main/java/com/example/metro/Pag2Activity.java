package com.example.metro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pag2Activity extends AppCompatActivity {

    private Button buttonLinea1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag2);

        buttonLinea1 = findViewById(R.id.lineafav5);
        buttonLinea1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pag2Activity.this, Pag5.class);
                startActivity(intent);
                finish();
            }

        });
    }
}
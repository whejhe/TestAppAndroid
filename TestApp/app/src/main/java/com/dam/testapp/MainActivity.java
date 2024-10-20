package com.dam.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonComenzar = findViewById(R.id.boton_comenzar);
        botonComenzar.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Pregunta1Activity.class);
            startActivity(intent);
        });
    }
}
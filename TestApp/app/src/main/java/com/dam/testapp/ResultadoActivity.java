package com.dam.testapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        TextView textoResultado = findViewById(R.id.texto_resultado);

        // Obtener las respuestas
        String respuesta1 = getIntent().getStringExtra("respuesta1");
        String respuesta2 = getIntent().getStringExtra("respuesta2");
        String respuesta3 = getIntent().getStringExtra("respuesta3");

        // Mostrar resultado
        String resultado = "Respuestas del test:\n\n" +
                "Pregunta 1: " + respuesta1 + "\n" +
                "Pregunta 2: " + respuesta2 + "\n" +
                "Pregunta 3: " + respuesta3;

        textoResultado.setText(resultado);
    }
}
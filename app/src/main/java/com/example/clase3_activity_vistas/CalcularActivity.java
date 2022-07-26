package com.example.clase3_activity_vistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CalcularActivity extends AppCompatActivity {

    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular);

        Intent intent3 = getIntent();
        String valorFinal1 = intent3.getStringExtra("valor1");
        String valorFinal2 = intent3.getStringExtra("valor2");
        String operacionFinal = intent3.getStringExtra("operacion");

        resultado = findViewById(R.id.textViewResultado);

        int valor1 = Integer.parseInt(valorFinal1);
        int valor2 = Integer.parseInt(valorFinal2);

        if(operacionFinal.equals("sumar")) {
            resultado.setText(String.valueOf(valor1 + valor2));
        } else if (operacionFinal.equals("restar")) {
            resultado.setText(String.valueOf(valor1 - valor2));
        } else if (operacionFinal.equals("multiplicar")) {
            resultado.setText(String.valueOf(valor1 * valor2));
        } else {
            resultado.setText(String.valueOf(valor1 / valor2));
        }
    }
}
package com.example.clase3_activity_vistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class OperacionesActivity extends AppCompatActivity {

    TextView tvNum1, tvNum2;
    Button buttonContinuar;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);

        Intent intent2 = getIntent();
        String valor1 = intent2.getStringExtra("valor1");
        String valor2 = intent2.getStringExtra("valor2");

        iniciarUI();
        crearAdapter();

        tvNum1.setText(valor1);
        tvNum2.setText(valor2);

        buttonContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String seleccionSpinner = spinner.getSelectedItem().toString();
                Intent intent = new Intent(OperacionesActivity.this, CalcularActivity.class);
                intent.putExtra("valor1", valor1);
                intent.putExtra("valor2", valor2);
                intent.putExtra("operacion", seleccionSpinner);
                startActivity(intent);
            }
        });
    }

    private void crearAdapter() {
        String [] opciones = {"sumar", "restar", "multiplicar", "dividir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item, opciones);
        spinner.setAdapter(adapter);
    }

    private void iniciarUI() {
        tvNum1 = findViewById(R.id.textViewNum1);
        tvNum2 = findViewById(R.id.textViewNum2);
        buttonContinuar = findViewById(R.id.buttonOperaciones);
        spinner = findViewById(R.id.spinnerOperaciones);
    }
}
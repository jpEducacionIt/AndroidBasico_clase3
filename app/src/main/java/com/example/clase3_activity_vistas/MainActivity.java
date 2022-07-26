package com.example.clase3_activity_vistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonContinuar;
    EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("ESTADOS", "onCreate: ");

        buttonContinuar = findViewById(R.id.buttonIrOperaciones);
        et1 = findViewById(R.id.editTextNumber1);
        et2 = findViewById(R.id.editTextNumber2);

        buttonContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero1 = et1.getText().toString();
                String numero2 = et2.getText().toString();

                if(numero1.equals("") || numero2.equals("")) {
                    Toast.makeText(MainActivity.this, "debe agregar 2 valores", Toast.LENGTH_LONG).show();
                } else {
                    Intent intento1 = new Intent(MainActivity.this, OperacionesActivity.class);
                    intento1.putExtra("valor1", numero1);
                    intento1.putExtra("valor2", numero2);
                    startActivity(intento1);
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ESTADOS", "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ESTADOS", "onResume ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ESTADOS", "onPause ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ESTADOS", "onStop ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ESTADOS", "onDestroy ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ESTADOS", "onRestart: ");
    }
}

package com.example.logintarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText usuario,clave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = (EditText) findViewById(R.id.editUusario);
        clave = (EditText) findViewById(R.id.editClave);

    }
    public void onclick(View view) {

        if (usuario.getText().toString().equals("lili") && clave.getText().toString().equals("liliana")) {
            Intent i = new Intent(this, Main2Activity.class);
            i.putExtra("usuario", usuario.getText().toString());
            startActivity(i);
        } else {
            Toast.makeText(getApplicationContext(), "Ingresar usuario valido", Toast.LENGTH_SHORT).show();
        }
    }
}

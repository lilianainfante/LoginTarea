package com.example.logintarea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView txt_dato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt_dato = (TextView) findViewById(R.id.text_dato);

        String valor = getIntent().getStringExtra("usuario");

        txt_dato.setText("Bienvenido : " + valor);
    }

    public void onclick(View view) {
        finish();
    }


}

package com.example.aplicacinreporterosindependientesconandroid_arica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Usuario> usuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuarios = (ArrayList<Usuario>) getIntent().getSerializableExtra("usuarios");

    }

    public void CrearNoticia(View view) {

        Intent intento = new Intent(this, Activity_CrearNoticia.class);
        intento.putExtra("usuarios",usuarios);

        startActivity(intento);
    }
}
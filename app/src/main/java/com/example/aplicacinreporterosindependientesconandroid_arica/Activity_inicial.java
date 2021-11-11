package com.example.aplicacinreporterosindependientesconandroid_arica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class Activity_inicial extends AppCompatActivity {

    private ArrayList<Usuario> usuarios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);

        usuarios = new ArrayList<Usuario>();
        Usuario usuario = new Usuario("test","test");
        usuarios.add(usuario);

    }

    public void Entrar(View view) {
        Intent intento = new Intent(this, ActivityPrincipal.class);
        intento.putExtra("usuarios", usuarios);
        startActivity(intento);
    }
}
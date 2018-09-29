package com.example.alejandro.audiolibro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.alejandro.audiolibro.fragments.PreferenciasFragment;

public class PreferenciasActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportFragmentManager().beginTransaction().replace(android.R.id.
                content, new PreferenciasFragment()).commit();
    }
}

package com.ceuacessivel.gabriel.aplicativoacessibilidade;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CartaMaioOeste extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carta_maio_oeste);
    }

    public void cartaNorteMaio(View view){
        Intent it = new Intent(this, CartaMaioNorte.class);
        startActivity(it);
    }
    public void cartaSulMaio(View view){
        Intent it = new Intent(this, CartaMaioSul.class);
        startActivity(it);
    }

    public void cartaLesteMaio(View view){
        Intent it = new Intent(this, CartaMaioLeste.class);
        startActivity(it);
    }
    public void cartaOesteMaio(View view){
        Intent it = new Intent(this, CartaMaioOeste.class);
        startActivity(it);
    }
}

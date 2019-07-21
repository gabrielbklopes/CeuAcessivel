package com.ceuacessivel.gabriel.aplicativoacessibilidade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CartaMarcoOeste extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carta_marco_oeste);
    }
    public void cartaSulMarco(View view){
        Intent it = new Intent(this, CartaMarcoSul.class);
        startActivity(it);
    }
    public void cartaNorteMarco(View view){
        Intent it = new Intent(this, CartaMarcoNorte.class);
        startActivity(it);
    }
}

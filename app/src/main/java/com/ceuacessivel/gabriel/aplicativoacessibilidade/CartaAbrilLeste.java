package com.ceuacessivel.gabriel.aplicativoacessibilidade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CartaAbrilLeste extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carta_abril_leste);
    }

    public void cartaNorteAbril(View view){
        Intent it = new Intent(this, CartaAbrilNorte.class);
        startActivity(it);
    }
    public void cartaSulAbril(View view){
        Intent it = new Intent(this, CartaAbrilSul.class);
        startActivity(it);
    }

    public void cartaLesteAbril(View view){
        Intent it = new Intent(this, CartaAbrilLeste.class);
        startActivity(it);
    }
    public void cartaOesteAbril(View view){
        Intent it = new Intent(this, CartaAbrilOeste.class);
        startActivity(it);
    }

}

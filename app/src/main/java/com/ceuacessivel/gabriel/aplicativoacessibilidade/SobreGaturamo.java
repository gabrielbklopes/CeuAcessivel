package com.ceuacessivel.gabriel.aplicativoacessibilidade;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SobreGaturamo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre_gaturamo);
    }
    public void telaInicial(View view){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }
}

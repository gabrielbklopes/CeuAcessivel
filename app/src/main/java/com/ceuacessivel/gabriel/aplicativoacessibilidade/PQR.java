package com.ceuacessivel.gabriel.aplicativoacessibilidade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PQR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pqr);
    }
    public void telaGlossario(View view){
        Intent it = new Intent(this, Main2Activity.class);
        startActivity(it);
    }
}

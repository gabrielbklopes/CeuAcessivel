package com.ceuacessivel.gabriel.aplicativoacessibilidade;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       /* Desativa a ação ao clicar na cartinha de e-mail
       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }

    public void proximaTela(View view){
        Intent it = new Intent(this, Main2Activity.class);
        startActivity(it);
    }
    public void proximaTela2(View view){
        Intent it = new Intent(this, Main3Activity.class);
        startActivity(it);
    }
    public void proximaTela3(View view){
        Intent it = new Intent(this, Main4Activity.class);
        startActivity(it);
    }
    public void proximaTela4(View view){
        Intent it = new Intent(this, Main5Activity.class);
        startActivity(it);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    /*Oculta menu Settings
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_sobreapp) {
            Intent it = new Intent(this, SobreApp.class);
            startActivity(it);

        } else if (id == R.id.nav_descinterf) {
            Intent it = new Intent(this, DescricaoInterface.class);
            startActivity(it);

        } else if (id == R.id.nav_sobregat) {
            Intent it = new Intent(this, SobreGaturamo.class);
            startActivity(it);

        } else if (id == R.id.nav_refbiblio) {
            Intent it = new Intent(this, RefBiblio.class);
            startActivity(it);

        } else if (id == R.id.nav_artigos) {
            Intent it = new Intent(this, ArtigosCientificos.class);
            startActivity(it);

        } else if (id == R.id.nav_equipe) {
            Intent it = new Intent(this, Equipe.class);
            startActivity(it);

        }        else if (id == R.id.nav_email) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:appceuacessivel@gmail.com"));
            startActivity(browserIntent);

        } else if (id == R.id.nav_form) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdoTVWyXooLKoBXBGBbIXd78CjNMJAVhuV9dgTZ5XygunnI9Q/viewform"));
            startActivity(browserIntent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

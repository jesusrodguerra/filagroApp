package com.filagro.app.correctorph;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.filagro.app.correctorph.FragmentsPrincipales.ADF_fragment;
import com.filagro.app.correctorph.FragmentsPrincipales.BlankFragment;
import com.filagro.app.correctorph.FragmentsPrincipales.Calculadora;
import com.filagro.app.correctorph.FragmentsPrincipales.Productos;
import com.filagro.app.correctorph.FragmentsPrincipales.Verificacion;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setIcon(R.mipmap.ic_launcher);

            BottomNavigationView bnv = findViewById(R.id.navigationView);
            bnv.setOnNavigationItemSelectedListener(navListener);

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Inicio()).commit();


        }

        private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selectedfragment = null;

                switch (menuItem.getItemId()){

                    case R.id.adf_navigation:
                        selectedfragment = new ADF_fragment();
                        break;

                    case R.id.home_navigation:
                        selectedfragment = new Inicio();
                        break;

                    case R.id.verificacion_navigation:
                        selectedfragment = new Verificacion();
                        break;

                    case R.id.productos_navigation:
                        selectedfragment = new Productos();
                        break;

                }

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedfragment).commit();

                return true;
            }
        };

    }

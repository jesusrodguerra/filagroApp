package com.filagro.app.correctorph;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class Inicio extends Fragment {


    public Inicio() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vista = inflater.inflate(R.layout.fragment_inicio, container, false);
        
        TabLayout mtab = vista.findViewById(R.id.mytab);
        mtab.addTab(mtab.newTab().setText("Kit"));
        mtab.addTab(mtab.newTab().setText("Analisis"));

        final ViewPager mviewpager = vista.findViewById(R.id.myviewpager);
        AdapterPager adapter = new AdapterPager(getFragmentManager(), mtab.getTabCount());

        mviewpager.setAdapter(adapter);
        mviewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mtab));
        mtab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                mviewpager.setCurrentItem(position);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return vista;
    }


}

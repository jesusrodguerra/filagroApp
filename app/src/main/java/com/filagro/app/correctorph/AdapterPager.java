package com.filagro.app.correctorph;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.filagro.app.correctorph.FragmentsPrincipales.BlankFragment;
import com.filagro.app.correctorph.FragmentsPrincipales.Calculadora;

public class AdapterPager extends FragmentStatePagerAdapter {

    private int TabNumber;

    public AdapterPager(FragmentManager fm, int TabNumber) {
        super(fm);
        this.TabNumber = TabNumber;
    }

    @Override
    public Fragment getItem(int i) {

        switch (i){
            case 0:
                return new Calculadora();

            case 1:
                return new BlankFragment();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return TabNumber;
    }
}

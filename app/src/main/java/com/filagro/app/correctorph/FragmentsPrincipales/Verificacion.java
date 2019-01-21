package com.filagro.app.correctorph.FragmentsPrincipales;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.filagro.app.correctorph.R;
import com.filagro.app.correctorph.DataSet.contenido_verificacion;

import java.util.List;


public class Verificacion extends Fragment {


    public Verificacion() {
        // Required empty public constructor
    }


    private List<contenido_verificacion> contenido;
    private RecyclerView mrecycler;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mlayoutManager;
    View vista;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        vista = inflater.inflate(R.layout.fragment_verificacion,container, false);

        /**
        contenido = this.getAllname();

        mrecycler = vista.findViewById(R.id.recyclerverificacion);
        mlayoutManager = new LinearLayoutManager(vista.getContext());

        mAdapter = new AdapterVerificacion(contenido, R.layout.recycler_verificacion, new AdapterVerificacion.OnItemClickListener() {
            @Override
            public void onItemClick(contenido_verificacion contenido, int position) {

            }
        });

        mrecycler.setLayoutManager(mlayoutManager);
        mrecycler.setAdapter(mAdapter);

         */
        return vista;
    }

    /**
    private List<contenido_verificacion>getAllname(){
        return new ArrayList<contenido_verificacion>(){{
            add(new contenido_verificacion(R.string.tvph7, "pH 7.0", R.color.colorph7));
            add(new contenido_verificacion(R.string.tvph6, "pH 6.0", R.color.colorph6));
            add(new contenido_verificacion(R.string.tvph5_5, "pH 5.5", R.color.colorph5_5));
            add(new contenido_verificacion(R.string.tvph5, "pH 5.0", R.color.colorph5));
            add(new contenido_verificacion(R.string.tvph4, "pH 4.0", R.color.colorph4));
            add(new contenido_verificacion(R.string.tvph2, "pH 2.0", R.color.colorph2));
        }};
    }
     */
}

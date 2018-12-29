package com.filagro.app.correctorph;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


public class Productos extends Fragment {


    private List<ContenidoProductos> contenido;
    private RecyclerView mrecycler;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mlayoutManager;

    View vista;
    Button btn_vw;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        vista = inflater.inflate(R.layout.fragment_productos, container, false);


        contenido = this.getAllnames();

        mrecycler = vista.findViewById(R.id.recyclerproductos);
        mlayoutManager = new LinearLayoutManager(vista.getContext());

        mAdapter = new AdapterProductos(contenido, R.layout.recycler_productos, new AdapterProductos.OnItemClickListener() {
            @Override
            public void onItemClick(ContenidoProductos contenido, int position) {

            }
        });

        btn_vw = vista.findViewById(R.id.btn_vistaweb);
        btn_vw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), activityprueba.class);
                startActivity(i);
            }
        });

        mrecycler.setLayoutManager(mlayoutManager);
        mrecycler.setAdapter(mAdapter);

        return vista;

    }

    private List<ContenidoProductos>getAllnames(){
        return new ArrayList<ContenidoProductos>(){{
            add(new ContenidoProductos(R.string.tv_descripcionph7, "Productos a ph 7.0"));
            add(new ContenidoProductos(R.string.tv_descripcionph6, "Productos a ph 6.0"));
            add(new ContenidoProductos(R.string.tv_descripcionph5_5, "Productos a ph 5.5"));
            add(new ContenidoProductos(R.string.tv_descripcionph5, "Productos a ph 5.0"));
            add(new ContenidoProductos(R.string.tv_descripcionph4, "Productos a ph 4.0"));
            add(new ContenidoProductos(R.string.tv_descripcionph2, "pH 2.0 se recomienda para:"));
        }};
    }
}
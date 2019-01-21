package com.filagro.app.correctorph.DataSet;

import java.sql.Array;
import java.util.ArrayList;

public class ContenidoProductos {

    private int productos;
    private String titulo;


    public ContenidoProductos(int jproductos, String titulo){
        this.productos = jproductos;
        this.titulo = titulo;

    }

    public int getProductos() {
        return productos;
    }

    public void setProductos(int productos) {
        this.productos = productos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
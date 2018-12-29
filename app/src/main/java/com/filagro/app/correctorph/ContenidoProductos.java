package com.filagro.app.correctorph;

public class ContenidoProductos {

    private int productos;
    private String titulo;

    public ContenidoProductos(int productos, String titulo){
        this.productos = productos;
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

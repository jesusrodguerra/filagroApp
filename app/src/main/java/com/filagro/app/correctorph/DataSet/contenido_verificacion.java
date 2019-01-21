package com.filagro.app.correctorph.DataSet;

public class contenido_verificacion {

    private int verificacion;
    private String titulo;
    private int color;

    public contenido_verificacion(){

    }

    public contenido_verificacion(int verificacion, String titulo, int color){

        this.verificacion = verificacion;
        this.titulo = titulo;
        this.color = color;
    }

    public int getVerificacion() {
        return verificacion;
    }

    public void setVerificacion(int verificacion) {
        this.verificacion = verificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}

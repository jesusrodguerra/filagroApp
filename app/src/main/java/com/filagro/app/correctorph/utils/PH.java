package com.filagro.app.correctorph.utils;

public class PH {

    private static final int Bicarbonato = 4;

    private static final int Carbonato = 8;

    private static final Double ToMilimol = 0.09;


    public static Double CalcularPh(Double et1, Double et2, int LtsAgua, Double ph) {
        return (((et1 * Carbonato) + (et2 * Bicarbonato) - ph) * ToMilimol * LtsAgua);
    }

    public static Double LimitarDecimales(Double resultado) {
        return ((double) Math.round(resultado * 100d) / 100d);
    }

    public static String ImprimirResultado(Double resultado, String cantidadAgua) {
        return resultado + " mililitros de pHplus, o PREMIUM en " + cantidadAgua + " lts de agua";
    }

    public static Double CalcularDescripcionMinimol(Double et1, Double et2, Double ph) {
        return (((((((et1 * Carbonato) + (et2 * Bicarbonato) - ph) * ToMilimol) * 1000) / 1000) / 1000) * 9293.3499);
    }

    public static Double LimitarDecimalesmmol(Double resultado) {
        return ((double) Math.round(resultado * 1000d) / 1000d);

    }

    public static Double Calcularmgl(Double et1, Double et2, Double ph) {
        return (((((((et1 * Carbonato) + (et2 * Bicarbonato) - ph) * ToMilimol) * 1000) / 1000) / 1000) * 9293.3499) * 14.0067;
    }

    public static Double Calcularporcentaje(Double et1, Double et2, Double ph) {
        return (((((((et1 * Carbonato) + (et2 * Bicarbonato) - ph) * ToMilimol) * 1000) / 1000) / 1000) * 9293.3499) / 10000;

    }

    public static Double Calcularkgha(Double et1, Double et2, Double ph){
      return (((((((((et1 * Carbonato) + (et2 * Bicarbonato) - ph) * ToMilimol) * 1000) / 1000) / 1000) * 9293.3499) * 14.0067 * 100) / 1000000);
    }

    public static Double LimitarDecimalesporcentaje(Double resultado) {
        return ((double) Math.round(resultado * 10000d) / 10000d);
    }

    //Metodos para calculos de AGUA

    public static Double CalcularpHAgua(Double et1, Double et2, Double ph, int LtsAgua){
        return ((et1 + et2) - ph) * ToMilimol * LtsAgua;
    }

    public static Double CalcularMilimolAgua(Double et1, Double et2, Double ph) {
        return (((((((et1 + et2) - ph) * ToMilimol) * 1000) / 1000) / 1000) * 9293.3499);
    }

    public static Double CalcularmglAgua(Double et1, Double et2, Double ph) {
        return (((((((et1 + et2) - ph) * ToMilimol) * 1000) / 1000) / 1000) * 9293.3499) * 14.0067;
    }

    public static Double CalcularporcentajeAgua(Double et1, Double et2, Double ph) {
        return (((((((et1 + et2) - ph) * ToMilimol) * 1000) / 1000) / 1000) * 9293.3499) / 10000;

    }

    public static Double CalcularkghaAgua(Double et1, Double et2, Double ph) {
        return (((((((((et1 + et2) - ph) * ToMilimol) * 1000) / 1000) / 1000) * 9293.3499) * 14.0067 * 100) / 1000000);

    }

}


package com.filagro.app.correctorph.FragmentsPrincipales;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.filagro.app.correctorph.R;
import com.filagro.app.correctorph.utils.PH;


public class Calculadora extends Fragment {

    public Calculadora() {
        // Required empty public constructor
    }

    private View view;
    private Button btn7, btn6, btn5_5, btn5, btn4, btn2;
    private EditText et1, et2;
    private TextView tv600, tv400, tv200, tv20, tvlitro, tvmmol, tvmgl, tvporcentaje, tvkgha;

    private static Double PH7 = 2.0;
    private static Double PH6 = 1.0;
    private static Double PH5_5 = 0.5;
    private static Double PH5 = 0.0;
    private static Double PH4 = -18.0;
    private static Double PH2 = -28.0;

    protected void CalcularPh(Double et1, Double et2, Double ph) {
        double resultado600 = ValoresPositivos(PH.LimitarDecimales(PH.CalcularPh(et1, et2, 600, ph)));
        tv600.setText(PH.ImprimirResultado(resultado600, "600"));

        double resultado400 = ValoresPositivos(PH.LimitarDecimales(PH.CalcularPh(et1, et2, 400, ph)));
        tv400.setText(PH.ImprimirResultado(resultado400, "400"));

        double resultado200 = ValoresPositivos(PH.LimitarDecimales(PH.CalcularPh(et1, et2, 200, ph)));
        tv200.setText(PH.ImprimirResultado(resultado200, "200"));

        double resultado20 = ValoresPositivos(PH.LimitarDecimales(PH.CalcularPh(et1, et2, 20, ph)));
        tv20.setText(PH.ImprimirResultado(resultado20, "20"));

        double resultadolitro = ValoresPositivos(PH.LimitarDecimales(PH.CalcularPh(et1, et2, 1, ph)));
        tvlitro.setText(PH.ImprimirResultado(resultadolitro, "1"));

        double resultadommol = ValoresPositivos(PH.CalcularDescripcionMinimol(et1, et2, ph));
        tvmmol.setText(PH.LimitarDecimales(resultadommol) + " mmol/L de nitrógeno");

        double resultadomgl = ValoresPositivos(resultadommol * 14.0067);
        tvmgl.setText(PH.LimitarDecimales(resultadomgl) + " mg/L o g/m3 de nitrógeno");

        double resultadoporcentaje = ValoresPositivos(resultadommol / 10000);
        tvporcentaje.setText(PH.LimitarDecimalesporcentaje(resultadoporcentaje) + " % de nitrógeno");

        double resultadokgha = ValoresPositivos((resultadomgl * 100) / 1000000);
        tvkgha.setText(PH.LimitarDecimalesmmol(resultadokgha) + " kg/ha de nitrógeno");

    }

    protected boolean ValidarValoresVacios(Editable et1, Editable et2) {

        if (et1.length() == 0 && et2.length() == 0) {
            Toast.makeText(getActivity(), "Debes Ingresar un valor", Toast.LENGTH_SHORT).show();
            return false;

        } else {

            return true;

        }
    }

    @SuppressLint("ClickableViewAccessibility")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_calculadora, container, false);

        btn7 = (Button) view.findViewById(R.id.btn7);
        btn6 = (Button) view.findViewById(R.id.btn6);
        btn5_5 = (Button) view.findViewById(R.id.btn5_5);
        btn5 = (Button) view.findViewById(R.id.btn5);
        btn4 = (Button) view.findViewById(R.id.btn4);
        btn2 = (Button) view.findViewById(R.id.btn2);
        et1 = (EditText) view.findViewById(R.id.et_carbonatos);
        et2 = (EditText) view.findViewById(R.id.et_bicarbonatos);
        tv600 = (TextView) view.findViewById(R.id.tv_600);
        tv400 = (TextView) view.findViewById(R.id.tv_400);
        tv200 = (TextView) view.findViewById(R.id.tv_200);
        tv20 = (TextView) view.findViewById(R.id.tv_20);
        tvlitro = view.findViewById(R.id.tv_litro);
        tvmmol = (TextView) view.findViewById(R.id.tv_mmol);
        tvmgl = (TextView) view.findViewById(R.id.tv_mgl);
        tvporcentaje = (TextView) view.findViewById(R.id.tv_porcentaje);
        tvkgha = (TextView) view.findViewById(R.id.tv_kgha);

        btn7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                boolean respuestaboton = ValidarValoresVacios(et1.getText(), et2.getText());
                if (respuestaboton) {

                    double et1Valor = Double.parseDouble(et1.getText().toString());
                    double et2Valor = Double.parseDouble(et2.getText().toString());

                    btn7.setPressed(true);

                    CalcularPh(et1Valor, et2Valor, PH7);

                    btn6.setPressed(false);
                    btn5_5.setPressed(false);
                    btn5.setPressed(false);
                    btn4.setPressed(false);
                    btn2.setPressed(false);

                }

                return respuestaboton;
            }

        });

        btn6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                boolean respuestaboton = ValidarValoresVacios(et1.getText(), et2.getText());
                if(respuestaboton) {

                    double et1Valor = Double.parseDouble(et1.getText().toString());
                    double et2Valor = Double.parseDouble(et2.getText().toString());

                    btn6.setPressed(true);

                    CalcularPh(et1Valor, et2Valor, PH6);

                    btn7.setPressed(false);
                    btn5_5.setPressed(false);
                    btn5.setPressed(false);
                    btn4.setPressed(false);
                    btn2.setPressed(false);

                }
                return respuestaboton;
            }
        });

        btn5_5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                boolean respuestaboton = ValidarValoresVacios(et1.getText(), et2.getText());
                if(respuestaboton) {

                    double et1Valor = Double.parseDouble(et1.getText().toString());
                    double et2Valor = Double.parseDouble(et2.getText().toString());

                    btn5_5.setPressed(true);

                    CalcularPh(et1Valor, et2Valor, PH5_5);

                    btn6.setPressed(false);
                    btn7.setPressed(false);
                    btn5.setPressed(false);
                    btn4.setPressed(false);
                    btn2.setPressed(false);

                }
                return respuestaboton;
            }
        });

        btn5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                boolean respuestaboton = ValidarValoresVacios(et1.getText(), et2.getText());
                if(respuestaboton) {

                    double et1Valor = Double.parseDouble(et1.getText().toString());
                    double et2Valor = Double.parseDouble(et2.getText().toString());

                    btn5.setPressed(true);

                    CalcularPh(et1Valor, et2Valor, PH5);

                    btn6.setPressed(false);
                    btn5_5.setPressed(false);
                    btn7.setPressed(false);
                    btn4.setPressed(false);
                    btn2.setPressed(false);

                }
                return respuestaboton;
            }
        });

        btn4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                boolean respuestaboton = ValidarValoresVacios(et1.getText(), et2.getText());
                if(respuestaboton) {

                    double et1Valor = Double.parseDouble(et1.getText().toString());
                    double et2Valor = Double.parseDouble(et2.getText().toString());

                    btn4.setPressed(true);

                    CalcularPh(et1Valor, et2Valor, PH4);

                    btn6.setPressed(false);
                    btn5_5.setPressed(false);
                    btn5.setPressed(false);
                    btn7.setPressed(false);
                    btn2.setPressed(false);

                }
                return respuestaboton;
            }
        });

        btn2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                boolean respuestaboton = ValidarValoresVacios(et1.getText(), et2.getText());
                if (respuestaboton) {

                    Double et1Valor = Double.parseDouble(et1.getText().toString());
                    Double et2Valor = Double.parseDouble(et2.getText().toString());

                    btn2.setPressed(true);

                    double resultado600 = PH.LimitarDecimales(PH.CalcularPh(et1Valor, et2Valor, 1000, PH2));
                    tv600.setText(PH.LimitarDecimales(resultado600) + " mililitros de pHplus o PREMIUM 4/5 por cada 1000 litros de agua");
                    tv400.setText("");
                    tv200.setText("");
                    tv20.setText("");

                    double resultadommol = PH.CalcularDescripcionMinimol(et1Valor, et2Valor, PH2);
                    tvmmol.setText(PH.LimitarDecimales(resultadommol) + " mmol/L de nitrogeno");

                    double resultadomgl = resultadommol * 14.0067;
                    tvmgl.setText(PH.LimitarDecimales(resultadomgl) + " mg/L o g/m3 de nitrogeno");

                    double resultadoporcentaje = resultadommol / 10000;
                    tvporcentaje.setText(PH.LimitarDecimalesporcentaje(resultadoporcentaje) + " % de nitrogeno");

                    double resultadokghaph2 = (resultadomgl * (6 * 10000) / 1000000);
                    tvkgha.setText(PH.LimitarDecimalesmmol(resultadokghaph2) + " kg/ha de nitrogeno, equivalente a lo aplicado con la asperjadora, en 100 litros de agua por héctarea.");


                    btn6.setPressed(false);
                    btn5_5.setPressed(false);
                    btn5.setPressed(false);
                    btn4.setPressed(false);
                    btn7.setPressed(false);

                }
                return respuestaboton;
            }
        });

        return view;

    }

    public static Double ValoresPositivos(Double valorpositivo){
        if (valorpositivo < 0) {
            return 0.0;
        }
        return valorpositivo;
    }

}

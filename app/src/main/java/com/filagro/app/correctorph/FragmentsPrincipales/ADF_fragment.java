package com.filagro.app.correctorph.FragmentsPrincipales;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.filagro.app.correctorph.Facebook;
import com.filagro.app.correctorph.Imagenphplus;
import com.filagro.app.correctorph.Imagenphpremium;
import com.filagro.app.correctorph.Instagram;
import com.filagro.app.correctorph.R;
import com.filagro.app.correctorph.Twitter;


public class ADF_fragment extends Fragment {

    WebView view;
    View vista;
    Button btn_instagram, btn_facebook, btn_email, btn_twitter;
    ImageView imageview;
    ImageButton btn_phplus1, btn_phpremium2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        vista = inflater.inflate(R.layout.fragment_adf, container, false);
        btn_twitter = vista.findViewById(R.id.btn_twitter);
        btn_instagram = (Button) vista.findViewById(R.id.btn_instagram);
        btn_facebook = (Button) vista.findViewById(R.id.btn_facebook);
        btn_email = (Button) vista.findViewById(R.id.btn_email);
        btn_phplus1 = vista.findViewById(R.id.btn_phplus);
        btn_phpremium2 = vista.findViewById(R.id.btn_phpremium);

        //LOGICA BOTONES

        btn_twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Twitter.class);
                getActivity().startActivity(i);
            }
        });

        btn_instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getActivity(), Instagram.class);
                getActivity().startActivity(a);
            }
        });

        btn_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(getActivity(), Facebook.class);
                getActivity().startActivity(b);
            }
        });

        btn_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] TO = {"filagro01@gmail.com"}; //Direcciones email  a enviar.

                Intent emailIntent = new Intent(Intent.ACTION_SEND);

                emailIntent.setData(Uri.parse("filagro01@gmail.com"));
                emailIntent.setType("text/plain");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
                emailIntent.putExtra(Intent.EXTRA_TEXT, ""); // * configurar email aquí!

                try {
                    startActivity(Intent.createChooser(emailIntent, "Enviar email."));
                    Log.i("EMAIL", "Enviando email...");
                } catch (android.content.ActivityNotFoundException e) {
                    Toast.makeText(getActivity(), "", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_phplus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(getActivity(), Imagenphplus.class);
                getActivity().startActivity(c);
            }
        });

        btn_phpremium2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(getActivity(), Imagenphpremium.class);
                getActivity().startActivity(d);
            }
        });



        return vista;
    }

}
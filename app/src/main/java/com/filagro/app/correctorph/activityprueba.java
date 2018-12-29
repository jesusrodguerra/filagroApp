package com.filagro.app.correctorph;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class activityprueba extends AppCompatActivity {

    WebView vistaweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityprueba);

        vistaweb = findViewById(R.id.vistaweb);

        vistaweb.getSettings().setJavaScriptEnabled(true);
        vistaweb.setWebViewClient(new WebViewClient());
        vistaweb.loadUrl("https://sitem.herts.ac.uk/aeru/ppdb/en/atoz.htm");

    }
}

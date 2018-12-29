package com.filagro.app.correctorph;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Facebook extends AppCompatActivity {

    WebView wfacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);

        wfacebook = findViewById(R.id.facebook_layout);

        wfacebook.getSettings().setJavaScriptEnabled(true);
        wfacebook.setWebViewClient(new WebViewClient());
        wfacebook.loadUrl("https://www.facebook.com/filagro1/");

    }
}

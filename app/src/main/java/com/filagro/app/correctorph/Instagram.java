package com.filagro.app.correctorph;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Instagram extends AppCompatActivity {

    WebView winstagram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);

        winstagram = findViewById(R.id.instagram_layout);

        winstagram.getSettings().setJavaScriptEnabled(true);
        winstagram.setWebViewClient(new WebViewClient());
        winstagram.loadUrl("https://www.instagram.com/filagro/");

    }
}

package com.filagro.app.correctorph;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Twitter extends AppCompatActivity {

    WebView wtwitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);

        wtwitter = findViewById(R.id.twitter_layout);

        wtwitter.getSettings().setJavaScriptEnabled(true);
        wtwitter.setWebViewClient(new WebViewClient());
        wtwitter.loadUrl("https://twitter.com/Filagro1");

    }
}

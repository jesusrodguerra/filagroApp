package com.filagro.app.correctorph;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class Imagenphplus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagenphplus);

        PhotoView photoView = (PhotoView) findViewById(R.id.iv_phplus);
        photoView.setImageResource(R.drawable.prod2);

    }
}

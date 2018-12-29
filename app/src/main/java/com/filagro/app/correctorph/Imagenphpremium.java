package com.filagro.app.correctorph;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class Imagenphpremium extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagenphpremium);

        PhotoView photo = findViewById(R.id.iv_phpremium);
        photo.setImageResource(R.drawable.prod1);

    }
}

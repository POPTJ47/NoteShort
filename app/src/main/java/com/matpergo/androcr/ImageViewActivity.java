package com.matpergo.androcr;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;

/**
 * Created by acer on 10/1/2015.
 */
public class ImageViewActivity extends Activity{
    private ImageView imageView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imageview);

        imageView = (ImageView) findViewById(R.id.imageView);


    }
}

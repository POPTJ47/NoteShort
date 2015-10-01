package com.matpergo.androcr;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;


public class WebViewActivity extends Activity {

    private WebView webView;
    private Button mindmapButton;
    private Button mindmapToggler;
    private ProgressBar spinner;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        webView = (WebView) findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://www.smmry.com");

        mindmapButton = (Button) findViewById(R.id.button_mindmap);
        mindmapButton.setVisibility(View.INVISIBLE);
        spinner=(ProgressBar)findViewById(R.id.progressBar);
        spinner.setVisibility(View.INVISIBLE);
        mindmapToggler = (Button) findViewById(R.id.buttonToggler);

        mindmapButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                spinner.setVisibility(View.VISIBLE);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent myIntent = new Intent(WebViewActivity.this,
                                ImageViewActivity.class);
                        startActivity(myIntent);
                    }

                }, 15000);
                // Start NewActivity.class

        }});

            mindmapToggler.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

        mindmapButton.setVisibility(View.VISIBLE);    }
        });
    }
}

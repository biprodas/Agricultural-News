package com.example.nazmulhossain.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class feedback extends AppCompatActivity {

    WebView feedWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        String url = "https://goo.gl/EmmL6P";
        feedWeb = (WebView) findViewById(R.id.feedweb);
        feedWeb.getSettings().setJavaScriptEnabled(true);
        feedWeb.loadUrl(url);
        feedWeb.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(feedWeb.canGoBack()){
            feedWeb.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}

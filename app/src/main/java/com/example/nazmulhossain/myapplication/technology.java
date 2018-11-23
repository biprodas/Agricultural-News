package com.example.nazmulhossain.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Nazmul Hossain on 4/2/2017.
 */

public class technology extends AppCompatActivity {
    WebView techWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.technolog);

        String url = "http://www.agroinfobd.com/agrotool";
        techWeb = (WebView) findViewById(R.id.techweb);
        techWeb.getSettings().setJavaScriptEnabled(true);
        techWeb.loadUrl(url);
        techWeb.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(techWeb.canGoBack()){
            techWeb.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}

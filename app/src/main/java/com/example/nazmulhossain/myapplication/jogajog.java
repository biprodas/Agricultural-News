package com.example.nazmulhossain.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class jogajog extends AppCompatActivity {

    WebView jogagojWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogajog);

        String url = "https://goo.gl/5GJcwP";
        jogagojWeb = (WebView) findViewById(R.id.jogajogweb);
        jogagojWeb.getSettings().setJavaScriptEnabled(true);
        jogagojWeb.loadUrl(url);
        jogagojWeb.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(jogagojWeb.canGoBack()){
            jogagojWeb.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}

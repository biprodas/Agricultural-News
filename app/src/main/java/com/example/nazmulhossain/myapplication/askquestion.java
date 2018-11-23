package com.example.nazmulhossain.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class askquestion extends AppCompatActivity {
    WebView askquestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_askquestion);

        String url = "https://goo.gl/tkwS11";
        askquestion = (WebView) findViewById(R.id.askquestion);
        askquestion.getSettings().setJavaScriptEnabled(true);
        askquestion.loadUrl(url);
        askquestion.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(askquestion.canGoBack()){
            askquestion.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}

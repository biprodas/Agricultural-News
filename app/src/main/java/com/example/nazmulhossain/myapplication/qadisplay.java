package com.example.nazmulhossain.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class qadisplay extends AppCompatActivity {
    WebView qadisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qadisplay);

        String url = "http://agriculturalnewscrops.blogspot.com/";
        qadisplay = (WebView) findViewById(R.id.qadisplay);
        qadisplay.getSettings().setJavaScriptEnabled(true);
        qadisplay.loadUrl(url);
        qadisplay.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(qadisplay.canGoBack()){
            qadisplay.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}

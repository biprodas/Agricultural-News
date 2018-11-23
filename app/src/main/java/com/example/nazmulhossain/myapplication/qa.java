package com.example.nazmulhossain.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

/**
 * Created by Nazmul Hossain on 4/2/2017.
 */

public class qa extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qa);
    }

    public void click(View view){
        String crops;
        crops = ((Button) view).getText().toString();
        if(crops.equals("প্রশ্ন উত্তর দেখুন")){
            Intent intent = new Intent(this,qadisplay.class);
            startActivity(intent);
        }
        else if(crops.equals("প্রশ্ন করুন")){
            Intent intent = new Intent(this,askquestion.class);
            startActivity(intent);
        }
        else if(crops.equals("কৃষি জিজ্ঞাসা")){
            Intent intent = new Intent(this,askkrishi.class);
            startActivity(intent);
        }
    }
}

package com.example.nazmulhossain.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Scroller;
import android.widget.TextView;

/**
 * Created by Nazmul Hossain on 4/18/2017.
 */

public class dana extends AppCompatActivity{
    public  static final String  ExtraMessage = "com.example.nazmulhossain.myapplication.dana";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dana);
    }

    public  void onClick(View view){
        String button;
        button = ((Button) view).getText().toString();
        if(button.equals("ধান")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "dhan";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("গম")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "gom";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("বারলি")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "barli";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("কাউন")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "caun";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("চিনা")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "cina";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("ভুট্টা")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "vutta";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
    }
}

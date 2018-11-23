package com.example.nazmulhossain.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Nazmul Hossain on 8/1/2017.
 */

public class masala extends AppCompatActivity {
    public  static final String  ExtraMessage = "com.example.nazmulhossain.myapplication.masala";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.masala);
    }

    public void onClick(View view){
        String button;
        button = ((Button) view).getText().toString();
        if(button.equals("পেয়েজ")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "peaj";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("রসুন")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "rosun";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("আদা")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "ala";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("হলুদ")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "holud";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("ধনিয়া")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "dhonia";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
    }
}

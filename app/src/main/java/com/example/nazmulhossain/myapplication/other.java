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

public class other extends AppCompatActivity{
    public  static final String  ExtraMessage = "com.example.nazmulhossain.myapplication.other";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other);
    }

    public void onClick(View view){
        String button;
        button = ((Button) view).getText().toString();
        if(button.equals("ইক্ষু")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "akh";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("পাট")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "pat";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("তুলা")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "tula";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
    }
}

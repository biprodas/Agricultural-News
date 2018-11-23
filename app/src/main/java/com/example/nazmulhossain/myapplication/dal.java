package com.example.nazmulhossain.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Nazmul Hossain on 7/31/2017.
 */

public class dal extends AppCompatActivity {
    public  static final String  ExtraMessage = "com.example.nazmulhossain.myapplication.dal";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dal);
    }

    public void onClick(View view){
        String button;
        button = ((Button) view).getText().toString();
        if(button.equals("মটর")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "motor";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("মুসুর")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "musur";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("মুগ")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "mug";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("মাসকলাই")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "maskolai";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("ছোলা")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "chola";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
    }
}

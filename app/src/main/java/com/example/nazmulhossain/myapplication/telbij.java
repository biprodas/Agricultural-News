package com.example.nazmulhossain.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Nazmul Hossain on 7/31/2017.
 */

public class telbij extends AppCompatActivity{
    public  static final String  ExtraMessage = "com.example.nazmulhossain.myapplication.telbij";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telbij);
    }

    public void onClick(View view){
        String button;
        button = ((Button) view).getText().toString();
        if(button.equals("তিল")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "til";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("বাদাম")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "badam";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("সরিষা")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "sorisha";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("সূর্যমুখী")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "surjomukhi";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("সয়াবীন")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "soyabin";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
    }
}

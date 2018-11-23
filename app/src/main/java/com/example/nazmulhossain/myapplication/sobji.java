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

public class sobji extends AppCompatActivity {
    public  static final String  ExtraMessage = "com.example.nazmulhossain.myapplication.sobji";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sobji);
    }

    //লালশাক পুইশাক বেগুন পটল ঢেঁড়স টমেটো  মরিচ
    public void onClick(View view){
        String button;
        button = ((Button) view).getText().toString();
        if(button.equals("লালশাক")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "lalsak";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("পুইশাক")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "puisak";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("বেগুন")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "begun";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("পটল")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "potol";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("ঢেঁড়স")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "daros";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("টমেটো")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "tomato";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("মরিচ")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "moris";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
    }
}

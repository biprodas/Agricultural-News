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

public class kondal extends AppCompatActivity {
    public  static final String  ExtraMessage = "com.example.nazmulhossain.myapplication.kondal";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kondal);
    }

    public void onClick(View view){
        String button;
        button = ((Button) view).getText().toString();
        if(button.equals("আলু")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "alu";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("মিষ্টিআলু")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "mistialu";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("পানিকচু")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "panikocu";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
        else if(button.equals("মুখীকচু")){
            Intent intent = new Intent(this,tab_display.class);
            String message = "mukhikocu";
            intent.putExtra(ExtraMessage,message);
            startActivity(intent);
        }
    }

}

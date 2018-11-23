package com.example.nazmulhossain.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Nazmul Hossain on 4/2/2017.
 */

public class crops extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crops);
    }

    public  void  openCrops(View view){
        String crops;
        crops = ((Button) view).getText().toString();
        if(crops.equals("দানা ফসল")){
            Intent intent = new Intent(this,dana.class);
            startActivity(intent);
        }
        else if (crops.equals("ডাল ফসল")){
            Intent intent = new Intent(this,dal.class);
            startActivity(intent);
        }
        else if (crops.equals("তৈলবীজ")){
            Intent intent = new Intent(this,telbij.class);
            startActivity(intent);
        }
        else if (crops.equals("সবজি ফসল")){
            Intent intent = new Intent(this,sobji.class);
            startActivity(intent);
        }
        else if (crops.equals("কন্দাল ফসল")){
            Intent intent = new Intent(this,kondal.class);
            startActivity(intent);
        }
        else if (crops.equals("মসলা")){
            Intent intent = new Intent(this,masala.class);
            startActivity(intent);
        }
        else if (crops.equals("অন্যান্য")){
            Intent intent = new Intent(this,other.class);
            startActivity(intent);
        }
    }
}

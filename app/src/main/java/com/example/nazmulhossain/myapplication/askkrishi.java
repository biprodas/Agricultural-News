package com.example.nazmulhossain.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class askkrishi extends AppCompatActivity {
    //Button blask, blbus, gpask, krishisheba, ekrishok;
    public static final String extra="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_askkrishi);

    }

    public void calldet (View view){
        String call;
        call = ((Button) view).getText().toString();

        if(call.equals("বাংলালিংক কৃষি জিজ্ঞাসা")){
            Intent intent = new Intent(this,calldetails.class);
            intent.putExtra(extra,"blask");
            startActivity(intent);
        }
        else if(call.equals("বাংলালিংক ব্যাবসা জিজ্ঞাসা")){
            Intent intent = new Intent(this,calldetails.class);
            intent.putExtra(extra,"blbus");
            startActivity(intent);
        }
        else if(call.equals("গ্রামীণফোন কৃষি সেবা")){
            Intent intent = new Intent(this,calldetails.class);
            intent.putExtra(extra,"gpask");
            startActivity(intent);
        }
        else if(call.equals("কৃষি সেবা")){
            Intent intent = new Intent(this,calldetails.class);
            intent.putExtra(extra,"krishiseba");
            startActivity(intent);
        }
        else if(call.equals("ই-কৃষক")){
            Intent intent = new Intent(this,calldetails.class);
            intent.putExtra(extra,"ekrishok");
            startActivity(intent);
        }
    }
}

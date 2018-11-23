package com.example.nazmulhossain.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Nazmul Hossain on 4/2/2017.
 */

public class contact extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);
    }

    public void onClick(View view){
        String con;
        con = ((Button) view).getText().toString();

        if(con.equals("যোগাযোগ")){
            Intent intent = new Intent(this,jogajog.class);
            startActivity(intent);
        }
        else if(con.equals("ফিডব্যাক")){
            Intent intent = new Intent(this,feedback.class);
            startActivity(intent);
        }
    }
}

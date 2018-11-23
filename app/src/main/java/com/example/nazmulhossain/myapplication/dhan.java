package com.example.nazmulhossain.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Nazmul Hossain on 4/12/2017.
 */

public class dhan extends Activity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dhan);
        //display();
    }

    public  void  display(){
        TextView tv;
        tv = (TextView) findViewById(R.id.process);
        tv.setText("sdfsdfsdfsdfsdf");
    }
}

package com.example.nazmulhossain.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void crops(View view){
        String crops;
        crops = ((Button) view).getText().toString();
        if(crops.equals("ফসল")){
            Intent intent = new Intent(this,crops.class);
            startActivity(intent);
        }

    }

    public void technology(View view){
        String technology;
        technology = ((Button) view).getText().toString();
        if(technology.equals("কৃষি প্রযুক্তি")){
            Intent intent = new Intent(this,technology.class);
            startActivity(intent);
        }

    }

    public void news(View view){
        String news;
        news = ((Button) view).getText().toString();
        if(news.equals("কৃষি সংবাদ")){
            Intent intent = new Intent(this,news.class);
            startActivity(intent);
        }

    }

    public void qa(View view){
        String qa;
        qa = ((Button) view).getText().toString();
        if(qa.equals("প্রশ্ন/উত্তর")){
            Intent intent = new Intent(this,qa.class);
            startActivity(intent);
        }

    }

    public void contact(View view){
        String contact;
        contact = ((Button) view).getText().toString();
        if(contact.equals("যোগাযোগ")){
            Intent intent = new Intent(this,contact.class);
            startActivity(intent);
        }

    }


}

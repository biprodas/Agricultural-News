package com.example.nazmulhossain.myapplication;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

/**
 * Created by Nazmul Hossain on 8/1/2017.
 */

public class daldisplay extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daldisplay);
        display();
    }

    public void display(){
        Intent intent = getIntent();
        String s = intent.getStringExtra(dal.ExtraMessage);

        ImageView iv = (ImageView)findViewById(R.id.dalimg);

        if(s.equals("motor")){
            iv.setImageResource(R.drawable.motor);
            displayProcess(1,7);
            displayDiseases(2,7);
        }
        else if(s.equals("musur")){
            iv.setImageResource(R.drawable.musur);
            displayProcess(1,8);
            displayDiseases(2,8);
        }
        else if(s.equals("mug")){
            iv.setImageResource(R.drawable.mug);
            displayProcess(1,9);
            displayDiseases(2,9);
        }
        else if(s.equals("maskolai")){
            iv.setImageResource(R.drawable.maskolai);
            displayProcess(1,10);
            displayDiseases(2,10);
        }
        else if(s.equals("chola")){
            iv.setImageResource(R.drawable.chola);
            displayProcess(1,11);
            displayDiseases(2,11);
        }
    }

    //file
    public void displayProcess(int c, int r){
        try{
            AssetManager am = getAssets();
            InputStream is = am.open("data sheet.xls");
            Workbook wb = Workbook.getWorkbook(is);
            Sheet s = wb.getSheet(0);
            int row = s.getRows();
            int col = s.getColumns();
            String ss="";
            Cell z = s.getCell(c,r);
            ss = ss + z.getContents();
            TextView tp = (TextView)findViewById(R.id.dalprocess);
            tp.setText(ss);
        }
        catch (Exception e){

        }
    }

    public void displayDiseases(int c, int r){
        try{
            AssetManager am = getAssets();
            InputStream is = am.open("data sheet.xls");
            Workbook wb = Workbook.getWorkbook(is);
            Sheet s = wb.getSheet(0);
            int row = s.getRows();
            int col = s.getColumns();
            String ss="";
            Cell z = s.getCell(c,r);
            ss = ss + z.getContents();
            TextView td = (TextView)findViewById(R.id.daldiseases);
            td.setText(ss);
        }
        catch (Exception e){

        }
    }
}

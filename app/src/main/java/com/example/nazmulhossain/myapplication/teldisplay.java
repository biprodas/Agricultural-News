package com.example.nazmulhossain.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

/**
 * Created by Nazmul Hossain on 8/1/2017.
 */

public class teldisplay extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teldisplay);
        display();
    }


    public void display(){
        Intent intent = getIntent();
        String s = intent.getStringExtra(telbij.ExtraMessage);

        ImageView iv = (ImageView)findViewById(R.id.telimg);

        if(s.equals("til")){
            iv.setImageResource(R.drawable.til);
            displayProcess(1,12);
            displayDiseases(2,12);
        }
        else if(s.equals("badam")){
            iv.setImageResource(R.drawable.badam);
            displayProcess(1,13);
            displayDiseases(2,13);
        }
        else if(s.equals("sorisha")){
            iv.setImageResource(R.drawable.sorisha);
            displayProcess(1,14);
            displayDiseases(2,14);
        }
        else if(s.equals("surjomukhi")){
            iv.setImageResource(R.drawable.surjomukhi);
            displayProcess(1,15);
            displayDiseases(2,15);
        }
        else if(s.equals("soyabin")){
            iv.setImageResource(R.drawable.soyabin);
            displayProcess(1,16);
            displayDiseases(2,16);
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
            TextView tp = (TextView)findViewById(R.id.telprocess);
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
            TextView td = (TextView)findViewById(R.id.teldiseases);
            td.setText(ss);
        }
        catch (Exception e){

        }
    }
}
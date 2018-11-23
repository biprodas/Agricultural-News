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

public class sobjidisplay extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sobjidisplay);
        display();
    }


    public void display(){
        Intent intent = getIntent();
        String s = intent.getStringExtra(sobji.ExtraMessage);

        ImageView iv = (ImageView)findViewById(R.id.sobjiimg);

        if(s.equals("lalsak")){
            iv.setImageResource(R.drawable.lalsak);
            displayProcess(1,17);
            displayDiseases(2,17);
        }
        else if(s.equals("puisak")){
            iv.setImageResource(R.drawable.puisak);
            displayProcess(1,18);
            displayDiseases(2,18);
        }
        else if(s.equals("begun")){
            iv.setImageResource(R.drawable.begun);
            displayProcess(1,19);
            displayDiseases(2,19);
        }
        else if(s.equals("potol")){
            iv.setImageResource(R.drawable.potol);
            displayProcess(1,20);
            displayDiseases(2,20);
        }
        else if(s.equals("daros")){
            iv.setImageResource(R.drawable.daros);
            displayProcess(1,21);
            displayDiseases(2,21);
        }
        else if(s.equals("tomato")){
            iv.setImageResource(R.drawable.tomato);
            displayProcess(1,22);
            displayDiseases(2,22);
        }
        else if(s.equals("moris")){
            iv.setImageResource(R.drawable.moris);
            displayProcess(1,23);
            displayDiseases(2,23);
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
            TextView tp = (TextView)findViewById(R.id.sobjiprocess);
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
            TextView td = (TextView)findViewById(R.id.sobjidiseases);
            td.setText(ss);
        }
        catch (Exception e){

        }
    }
}

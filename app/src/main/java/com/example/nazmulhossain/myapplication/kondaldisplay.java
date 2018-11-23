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

public class kondaldisplay extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kondaldisplay);
        display();
    }

    public void display(){
        Intent intent = getIntent();
        String s = intent.getStringExtra(kondal.ExtraMessage);

        ImageView iv = (ImageView)findViewById(R.id.imageView);
        if(s.equals("alu")){
            iv.setImageResource(R.drawable.alu);
            displayProcess(1,24);
            displayDiseases(2,24);
        }
        else if(s.equals("mistialu")){
            iv.setImageResource(R.drawable.mistialu);
            displayProcess(1,25);
            displayDiseases(2,25);
        }
        else if(s.equals("panikocu")){
            iv.setImageResource(R.drawable.panikocu);
            displayProcess(1,26);
            displayDiseases(2,26);
        }
        else if(s.equals("mukhikocu")){
            iv.setImageResource(R.drawable.mukhikocu);
            displayProcess(1,27);
            displayDiseases(2,27);
        }
    }

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
            TextView tProcess = (TextView)findViewById(R.id.process);
            tProcess.setText(ss);
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
            TextView tDiseases = (TextView)findViewById(R.id.diseases);
            tDiseases.setText(ss);
        }
        catch (Exception e){

        }
    }
}

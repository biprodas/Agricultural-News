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

public class otherdisplay extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otherdisplay);
        display();
    }

    public void display(){
        Intent intent = getIntent();
        String s = intent.getStringExtra(other.ExtraMessage);

        ImageView iv = (ImageView)findViewById(R.id.imageView);
        if(s.equals("akh")){
            iv.setImageResource(R.drawable.akh);
            displayProcess(1,33);
            displayDiseases(2,33);
        }
        else if(s.equals("pat")){
            iv.setImageResource(R.drawable.pat);
            displayProcess(1,34);
            displayDiseases(2,34);
        }
        else if(s.equals("tula")){
            iv.setImageResource(R.drawable.tula);
            displayProcess(1,35);
            displayDiseases(2,35);
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

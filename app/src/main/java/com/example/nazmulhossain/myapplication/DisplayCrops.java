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
 * Created by Nazmul Hossain on 5/5/2017.
 */

public class DisplayCrops extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displaycrops);
        display();
    }

    public void display(){
        Intent intent = getIntent();
        String s = intent.getStringExtra(dana.ExtraMessage);

        ImageView iv = (ImageView)findViewById(R.id.imageView);
        if(s.equals("dhan")){
            iv.setImageResource(R.drawable.dhan);
            displayProcess(1,1);
            displayDiseases(2,1);
        }
        else if(s.equals("gom")){
            iv.setImageResource(R.drawable.gom);
            displayProcess(1,2);
            displayDiseases(2,2);
        }
        else if(s.equals("barli")){
            iv.setImageResource(R.drawable.barli);
            displayProcess(1,3);
            displayDiseases(2,3);
        }
        else if(s.equals("caun")){
            iv.setImageResource(R.drawable.caun);
            displayProcess(1,4);
            displayDiseases(2,4);
        }
        else if(s.equals("cina")){
            iv.setImageResource(R.drawable.cina);
            displayProcess(1,5);
            displayDiseases(2,5);
        }
        else if(s.equals("vutta")){
            iv.setImageResource(R.drawable.vutta);
            displayProcess(1,6);
            displayDiseases(2,6);
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

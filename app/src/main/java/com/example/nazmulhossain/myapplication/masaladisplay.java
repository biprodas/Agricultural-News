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

public class masaladisplay extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.masaladisplay);
        display();
    }

    public void display(){
        Intent intent = getIntent();
        String s = intent.getStringExtra(masala.ExtraMessage);

        ImageView iv = (ImageView)findViewById(R.id.imageView);
        if(s.equals("peaj")){
            iv.setImageResource(R.drawable.peaj);
            displayProcess(1,28);
            displayDiseases(2,28);
        }
        else if(s.equals("rosun")){
            iv.setImageResource(R.drawable.rosun);
            displayProcess(1,29);
            displayDiseases(2,29);
        }
        else if(s.equals("ada")){
            iv.setImageResource(R.drawable.ada);
            displayProcess(1,30);
            displayDiseases(2,30);
        }
        else if(s.equals("holud")){
            iv.setImageResource(R.drawable.holud);
            displayProcess(1,31);
            displayDiseases(2,31);
        }
        else if(s.equals("dhonia")){
            iv.setImageResource(R.drawable.dhonia);
            displayProcess(1,32);
            displayDiseases(2,32);
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

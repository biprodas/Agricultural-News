package com.example.nazmulhossain.myapplication;

import android.app.Activity;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.widget.TextView;

import java.io.InputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

/**
 * Created by Nazmul Hossain on 8/9/2017.
 */

public class GetInfo extends Activity{

    /*String ss = "চাষাবাদ , সার ব্যবস্থাপনা , সেচ ব্যবস্থাপনা , রোগবালাই দমন , ফসল সংগ্রহ";
    String ci = "";

    public String getinfo(String sc){
        if(sc.equals("dhan")){
            try {
                AssetManager am = getAssets();
                InputStream is = am.open("data sheet.xls");
                Workbook wb = Workbook.getWorkbook(is);
                Sheet s = wb.getSheet(0);
                int row = s.getRows();
                int col = s.getColumns();
                ss = "";
                Cell z = s.getCell(2, 1);
                return z.getContents();
            }
            catch (Exception e){

            }
        }
        return  null;
    }*/
}
package com.example.nazmulhossain.myapplication;

import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.InputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class calldetails extends AppCompatActivity {
    Button call;
    String s1, s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calldetails);

        //get data from intent
        final String cl = getIntent().getStringExtra(askkrishi.extra);

        TextView callC, callS;
        callC = (TextView) findViewById(R.id.calltitle);
        callS = (TextView) findViewById(R.id.calldes);

        if(cl.equals("blask")){
            s1 = getInfo(0,0);
            callC.setText(s1);
            s2 = getInfo(1,0);
            callS.setText(s2);
        }
        else if (cl.equals("blbus")){
            s1 = getInfo(0,1);
            callC.setText(s1);
            s2 = getInfo(1,1);
            callS.setText(s2);
        }
        else if (cl.equals("gpask")){
            s1 = getInfo(0,2);
            callC.setText(s1);
            s2 = getInfo(1,2);
            callS.setText(s2);
        }
        else if (cl.equals("krishiseba")){
            s1 = getInfo(0,3);
            callC.setText(s1);
            s2 = getInfo(1,3);
            callS.setText(s2);
        }
        else if (cl.equals("ekrishok")){
            s1 = getInfo(0,4);
            callC.setText(s1);
            s2 = getInfo(1,4);
            callS.setText(s2);
        }

        call = (Button) findViewById(R.id.callkorun);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                if(cl.equals("blask")){
                    callIntent.setData(Uri.parse("tel:7676"));
                }
                else if (cl.equals("blbus")){
                    callIntent.setData(Uri.parse("tel:7677"));
                }
                else if (cl.equals("gpask")){
                    callIntent.setData(Uri.parse("tel:27676"));
                }
                else if (cl.equals("krishiseba")){
                    callIntent.setData(Uri.parse("tel:16123"));
                }
                else if (cl.equals("ekrishok")){
                    callIntent.setData(Uri.parse("tel:16250"));
                }
                startActivity(callIntent);
            }
        });
    }


    // getInfo
    public String getInfo(int c, int r){
        try{
            AssetManager am = getAssets();
            InputStream is = am.open("calldata.xls");
            Workbook wb = Workbook.getWorkbook(is);
            Sheet s = wb.getSheet(0);
            int row = s.getRows();
            int col = s.getColumns();
            Cell z = s.getCell(c,r);
            String ss = "";
            ss = ss + z.getContents();
            return ss;
        }
        catch (Exception e){

        }
        return null;
    }
}

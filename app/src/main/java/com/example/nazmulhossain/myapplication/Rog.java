package com.example.nazmulhossain.myapplication;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

/**
 * Created by Nazmul Hossain on 8/11/2017.
 */

public class Rog extends Fragment {
    String s1,s2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.rog, container, false);

        //
        String s = getActivity().getIntent().getStringExtra(dana.ExtraMessage);
        s+="";
        String sd = getActivity().getIntent().getStringExtra(dal.ExtraMessage);
        sd+="";

        String tl = getActivity().getIntent().getStringExtra(telbij.ExtraMessage);
        tl+="";

        String sb = getActivity().getIntent().getStringExtra(sobji.ExtraMessage);
        sb += "";

        String kn = getActivity().getIntent().getStringExtra(kondal.ExtraMessage);
        kn += "";

        String ms = getActivity().getIntent().getStringExtra(masala.ExtraMessage);
        ms += "";

        String ot = getActivity().getIntent().getStringExtra(other.ExtraMessage);
        ot += "";

        ImageView iv = (ImageView) v.findViewById(R.id.culimg);
        //ImageView iv2 = (ImageView) v.findViewById(R.id.culimg2);
        TextView tv = (TextView) v.findViewById(R.id.culdes);
        //TextView tv2 = (TextView) v.findViewById(R.id.culdes2);

        if( !s.equals("null") || s.equals("dhan") || s.equals("gom") || s.equals("barli") || s.equals("caun") || s.equals("cina") || s.equals("vutta")){
            if(s.equals("dhan")){
                iv.setImageResource(R.drawable.dhanrog);
                s1 = getInfo(5,1);
                tv.setText(s1);
            }
            else if (s.equals("gom")){
                iv.setImageResource(R.drawable.gomrog);
                s1 = getInfo(5,2);
                tv.setText(s1);
            }
            else if (s.equals("barli")){
                iv.setImageResource(R.drawable.barlirog);
                s1 = getInfo(5,3);
                tv.setText(s1);
            }
            else if (s.equals("caun")){
                iv.setImageResource(R.drawable.caunrog);
                s1 = getInfo(5,4);
                tv.setText(s1);
            }
            else if (s.equals("cina")){
                iv.setImageResource(R.drawable.caunrog2);
                s1 = getInfo(5,5);
                tv.setText(s1);
            }
            else if (s.equals("vutta")){
                iv.setImageResource(R.drawable.vuttarog);
                s1 = getInfo(5,6);
                tv.setText(s1);
            }
        }
        else if( !sd.equals("null") || sd.equals("motor") || sd.equals("musur") || sd.equals("mug") || sd.equals("maskolai") || sd.equals("chola")){
            if(sd.equals("motor")){
                iv.setImageResource(R.drawable.motorrog);
                s1 = getInfo(5,7);
                tv.setText(s1);
            }
            else if (sd.equals("musur")){
                iv.setImageResource(R.drawable.musurrog);
                s1 = getInfo(5,8);
                tv.setText(s1);
            }
            else if (sd.equals("mug")){
                iv.setImageResource(R.drawable.musurrogg);
                s1 = getInfo(5,9);
                tv.setText(s1);
            }
            else if (sd.equals("maskolai")){
                iv.setImageResource(R.drawable.musurrog);
                s1 = getInfo(5,10);
                tv.setText(s1);
            }
            else if (sd.equals("chola")){
                iv.setImageResource(R.drawable.motorrog);
                s1 = getInfo(5,11);
                tv.setText(s1);
            }
        }
        else if( !tl.equals("null") || tl.equals("til") || tl.equals("badam") || tl.equals("sorisha") || tl.equals("surjomukhi") || tl.equals("soyabin")){
            if(tl.equals("til")){
                iv.setImageResource(R.drawable.til);
                s1 = getInfo(5,12);
                tv.setText(s1);
            }
            else if (tl.equals("badam")){
                iv.setImageResource(R.drawable.badamrog);
                s1 = getInfo(5,13);
                tv.setText(s1);
            }
            else if (tl.equals("sorisha")){
                iv.setImageResource(R.drawable.sorisarog);
                s1 = getInfo(5,14);
                tv.setText(s1);
            }
            else if (tl.equals("surjomukhi")){
                iv.setImageResource(R.drawable.surjomukhirog);
                s1 = getInfo(5,15);
                tv.setText(s1);
            }
            else if (tl.equals("soyabin")){
                iv.setImageResource(R.drawable.soyabinrog);
                s1 = getInfo(5,16);
                tv.setText(s1);
            }
        }
        else if( !sb.equals("null") || sb.equals("lalsak") || sb.equals("puisak") || sb.equals("begun") || sb.equals("potol") || sb.equals("daros") || sb.equals("tomato") || sb.equals("moris")){
            if(sb.equals("lalsak")){
                iv.setImageResource(R.drawable.lalsakrog);
                s1 = getInfo(5,17);
                tv.setText(s1);
            }
            else if (sb.equals("puisak")){
                iv.setImageResource(R.drawable.puisakrog);
                s1 = getInfo(5,18);
                tv.setText(s1);
            }
            else if (sb.equals("begun")){
                iv.setImageResource(R.drawable.begunrog);
                s1 = getInfo(5,19);
                tv.setText(s1);
            }
            else if (sb.equals("potol")){
                iv.setImageResource(R.drawable.potol);
                s1 = getInfo(5,20);
                tv.setText(s1);
            }
            else if (sb.equals("daros")){
                iv.setImageResource(R.drawable.darosrog);
                s1 = getInfo(5,21);
                tv.setText(s1);
            }
            else if (sb.equals("tomato")){
                iv.setImageResource(R.drawable.tomatorog);
                s1 = getInfo(5,22);
                tv.setText(s1);
            }
            else if (sb.equals("moris")){
                iv.setImageResource(R.drawable.ses);
                s1 = getInfo(5,23);
                tv.setText(s1);
            }
        }
        else if( !kn.equals("null") || kn.equals("alu") || kn.equals("mistialu") || kn.equals("mukhikocu") || kn.equals("panikocu")){
            if(kn.equals("alu")){
                iv.setImageResource(R.drawable.alurog);
                s1 = getInfo(5,24);
                tv.setText(s1);
            }
            else if (kn.equals("mistialu")){
                iv.setImageResource(R.drawable.mistialurog);
                s1 = getInfo(5,25);
                tv.setText(s1);
            }
            else if (kn.equals("mukhikocu")){
                iv.setImageResource(R.drawable.mukhikocu);
                s1 = getInfo(5,26);
                tv.setText(s1);
            }
            else if (kn.equals("panikocu")){
                iv.setImageResource(R.drawable.panikocu);
                s1 = getInfo(5,27);
                tv.setText(s1);
            }
        }
        else if( !ms.equals("null") || ms.equals("peaj") || ms.equals("rosun") || ms.equals("ada") || ms.equals("holud") || ms.equals("dhonia")){
            if(ms.equals("peaj")){
                iv.setImageResource(R.drawable.peajrog);
                s1 = getInfo(5,28);
                tv.setText(s1);
            }
            else if (ms.equals("rosun")){
                iv.setImageResource(R.drawable.rosunrog);
                s1 = getInfo(5,29);
                tv.setText(s1);
            }
            else if (ms.equals("ada")){
                iv.setImageResource(R.drawable.adarog);
                s1 = getInfo(5,30);
                tv.setText(s1);
            }
            else if (ms.equals("holud")){
                iv.setImageResource(R.drawable.holudrog);
                s1 = getInfo(5,31);
                tv.setText(s1);
            }
            else if (ms.equals("dhonia")){
                iv.setImageResource(R.drawable.dhoniaagasa);
                s1 = getInfo(5,32);
                tv.setText(s1);
            }
        }
        else if( !ot.equals("null") || ot.equals("akh") || ot.equals("pat") || ot.equals("tula")){
            if(ot.equals("akh")){
                iv.setImageResource(R.drawable.akh);
                s1 = getInfo(2,33);
                tv.setText(s1);
            }
            else if (ot.equals("pat")){
                iv.setImageResource(R.drawable.patrog);
                s1 = getInfo(5,34);
                tv.setText(s1);
            }
            else if (ot.equals("tula")){
                iv.setImageResource(R.drawable.tularog);
                s1 = getInfo(5,35);
                tv.setText(s1);
            }
        }
        //

        return v;
    }


    //getInfo
    public String getInfo(int c, int r){
        try{
            AssetManager am = getActivity().getAssets();
            InputStream is = am.open("data sheet.xls");
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

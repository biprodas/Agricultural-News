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

public class Harv extends Fragment {
    String s1,s2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.harv, container, false);

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
                iv.setImageResource(R.drawable.dhanharv);
                s1 = getInfo(6,1);
                tv.setText(s1);
            }
            else if (s.equals("gom")){
                iv.setImageResource(R.drawable.gomharv);
                s1 = getInfo(6,2);
                tv.setText(s1);
            }
            else if (s.equals("barli")){
                iv.setImageResource(R.drawable.gomharv2);
                s1 = getInfo(6,3);
                tv.setText(s1);
            }
            else if (s.equals("caun")){
                iv.setImageResource(R.drawable.gomharv);
                s1 = getInfo(6,4);
                tv.setText(s1);
            }
            else if (s.equals("cina")){
                iv.setImageResource(R.drawable.cinacul);
                s1 = getInfo(6,5);
                tv.setText(s1);
            }
            else if (s.equals("vutta")){
                iv.setImageResource(R.drawable.vuttaharv);
                s1 = getInfo(6,6);
                tv.setText(s1);
            }
        }
        else if( !sd.equals("null") || sd.equals("motor") || sd.equals("musur") || sd.equals("mug") || sd.equals("maskolai") || sd.equals("chola")){
            if(sd.equals("motor")){
                iv.setImageResource(R.drawable.motorharv);
                s1 = getInfo(6,7);
                tv.setText(s1);
            }
            else if (sd.equals("musur")){
                iv.setImageResource(R.drawable.musurharv);
                s1 = getInfo(6,8);
                tv.setText(s1);
            }
            else if (sd.equals("mug")){
                iv.setImageResource(R.drawable.mugharv);
                s1 = getInfo(6,9);
                tv.setText(s1);
            }
            else if (sd.equals("maskolai")){
                iv.setImageResource(R.drawable.musurharv);
                s1 = getInfo(6,10);
                tv.setText(s1);
            }
            else if (sd.equals("chola")){
                iv.setImageResource(R.drawable.chola);
                s1 = getInfo(6,11);
                tv.setText(s1);
            }
        }
        else if( !tl.equals("null") || tl.equals("til") || tl.equals("badam") || tl.equals("sorisha") || tl.equals("surjomukhi") || tl.equals("soyabin")){
            if(tl.equals("til")){
                iv.setImageResource(R.drawable.tilharv);
                s1 = getInfo(6,12);
                tv.setText(s1);
            }
            else if (tl.equals("badam")){
                iv.setImageResource(R.drawable.badamharv1);
                s1 = getInfo(6,13);
                tv.setText(s1);
            }
            else if (tl.equals("sorisha")){
                iv.setImageResource(R.drawable.sorishaharv);
                s1 = getInfo(6,14);
                tv.setText(s1);
            }
            else if (tl.equals("surjomukhi")){
                iv.setImageResource(R.drawable.surjomukhiharv);
                s1 = getInfo(6,15);
                tv.setText(s1);
            }
            else if (tl.equals("soyabin")){
                iv.setImageResource(R.drawable.soyabinharv);
                s1 = getInfo(6,16);
                tv.setText(s1);
            }
        }
        else if( !sb.equals("null") || sb.equals("lalsak") || sb.equals("puisak") || sb.equals("begun") || sb.equals("potol") || sb.equals("daros") || sb.equals("tomato") || sb.equals("moris")){
            if(sb.equals("lalsak")){
                iv.setImageResource(R.drawable.lalsakharv);
                s1 = getInfo(6,17);
                tv.setText(s1);
            }
            else if (sb.equals("puisak")){
                iv.setImageResource(R.drawable.puisakharv);
                s1 = getInfo(6,18);
                tv.setText(s1);
            }
            else if (sb.equals("begun")){
                iv.setImageResource(R.drawable.begunharv);
                s1 = getInfo(6,19);
                tv.setText(s1);
            }
            else if (sb.equals("potol")){
                iv.setImageResource(R.drawable.potolharv);
                s1 = getInfo(6,20);
                tv.setText(s1);
            }
            else if (sb.equals("daros")){
                iv.setImageResource(R.drawable.darosharv);
                s1 = getInfo(6,21);
                tv.setText(s1);
            }
            else if (sb.equals("tomato")){
                iv.setImageResource(R.drawable.tomatoharv);
                s1 = getInfo(6,22);
                tv.setText(s1);
            }
            else if (sb.equals("moris")){
                iv.setImageResource(R.drawable.morisharv);
                s1 = getInfo(6,23);
                tv.setText(s1);
            }
        }
        else if( !kn.equals("null") || kn.equals("alu") || kn.equals("mistialu") || kn.equals("mukhikocu") || kn.equals("panikocu")){
            if(kn.equals("alu")){
                iv.setImageResource(R.drawable.aluharv);
                s1 = getInfo(6,24);
                tv.setText(s1);
            }
            else if (kn.equals("mistialu")){
                iv.setImageResource(R.drawable.mistialuharv);
                s1 = getInfo(6,25);
                tv.setText(s1);
            }
            else if (kn.equals("mukhikocu")){
                iv.setImageResource(R.drawable.kochuharv);
                s1 = getInfo(6,26);
                tv.setText(s1);
            }
            else if (kn.equals("panikocu")){
                iv.setImageResource(R.drawable.kochuharv);
                s1 = getInfo(6,27);
                tv.setText(s1);
            }
        }
        else if( !ms.equals("null") || ms.equals("peaj") || ms.equals("rosun") || ms.equals("ada") || ms.equals("holud") || ms.equals("dhonia")){
            if(ms.equals("peaj")){
                iv.setImageResource(R.drawable.peajharv);
                s1 = getInfo(6,28);
                tv.setText(s1);
            }
            else if (ms.equals("rosun")){
                iv.setImageResource(R.drawable.rosunharv);
                s1 = getInfo(6,29);
                tv.setText(s1);
            }
            else if (ms.equals("ada")){
                iv.setImageResource(R.drawable.adaharv);
                s1 = getInfo(6,30);
                tv.setText(s1);
            }
            else if (ms.equals("holud")){
                iv.setImageResource(R.drawable.holudharv);
                s1 = getInfo(6,31);
                tv.setText(s1);
            }
            else if (ms.equals("dhonia")){
                iv.setImageResource(R.drawable.dhoniaharv);
                s1 = getInfo(6,32);
                tv.setText(s1);
            }
        }
        else if( !ot.equals("null") || ot.equals("akh") || ot.equals("pat") || ot.equals("tula")){
            if(ot.equals("akh")){
                iv.setImageResource(R.drawable.akhharv);
                s1 = getInfo(6,33);
                tv.setText(s1);
            }
            else if (ot.equals("pat")){
                iv.setImageResource(R.drawable.patharv);
                s1 = getInfo(6,34);
                tv.setText(s1);
            }
            else if (ot.equals("tula")){
                iv.setImageResource(R.drawable.tulaharv);
                s1 = getInfo(6,35);
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

package com.example.nazmulhossain.myapplication;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
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
 * Created by Nazmul Hossain on 8/7/2017.
 */

public class Cultivate extends android.support.v4.app.Fragment{
    //String ss = "";
    String s1,s2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //try
        View v = inflater.inflate(R.layout.cultivate, container, false);
        //String s = getActivity().getClass().getSimpleName();
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
        ImageView iv2 = (ImageView) v.findViewById(R.id.culimg2);
        TextView tv = (TextView) v.findViewById(R.id.culdes);
        TextView tv2 = (TextView) v.findViewById(R.id.culdes2);

        if( !s.equals("null") || s.equals("dhan") || s.equals("gom") || s.equals("barli") || s.equals("caun") || s.equals("cina") || s.equals("vutta")){
            if(s.equals("dhan")){
                iv.setImageResource(R.drawable.dhancul2);
                iv2.setImageResource(R.drawable.dhancul1);
                s1 = getInfo(1,1);
                tv.setText(s1);
                s2 = getInfo(2,1);
                tv2.setText(s2);
            }
            else if (s.equals("gom")){
                iv.setImageResource(R.drawable.gomcul1);
                iv2.setImageResource(R.drawable.gomcul2);
                s1 = getInfo(1,2);
                tv.setText(s1);
                s2 = getInfo(2,2);
                tv2.setText(s2);
            }
            else if (s.equals("barli")){
                iv.setImageResource(R.drawable.barlicul1);
                iv2.setImageResource(R.drawable.barlicul2);
                s1 = getInfo(1,3);
                tv.setText(s1);
                s2 = getInfo(2,3);
                tv2.setText(s2);
            }
            else if (s.equals("caun")){
                iv.setImageResource(R.drawable.cauncul1);
                iv2.setImageResource(R.drawable.cauncul2);
                s1 = getInfo(1,4);
                tv.setText(s1);
                s2 = getInfo(2,4);
                tv2.setText(s2);
            }
            else if (s.equals("cina")){
                iv.setImageResource(R.drawable.cinacul);
                iv2.setImageResource(R.drawable.cina);
                s1 = getInfo(1,5);
                tv.setText(s1);
                s2 = getInfo(2,5);
                tv2.setText(s2);
            }
            else if (s.equals("vutta")){
                iv.setImageResource(R.drawable.vutta);
                iv2.setImageResource(R.drawable.vuttacul);
                s1 = getInfo(1,6);
                tv.setText(s1);
                s2 = getInfo(2,6);
                tv2.setText(s2);
            }
        }
        else if( !sd.equals("null") || sd.equals("motor") || sd.equals("musur") || sd.equals("mug") || sd.equals("maskolai") || sd.equals("chola")){
            if(sd.equals("motor")){
                iv.setImageResource(R.drawable.motorcul);
                iv2.setImageResource(R.drawable.motor);
                s1 = getInfo(1,7);
                tv.setText(s1);
                s2 = getInfo(2,7);
                tv2.setText(s2);
            }
            else if (sd.equals("musur")){
                iv.setImageResource(R.drawable.musurcul);
                iv2.setImageResource(R.drawable.musur);
                s1 = getInfo(1,8);
                tv.setText(s1);
                s2 = getInfo(2,8);
                tv2.setText(s2);
            }
            else if (sd.equals("mug")){
                iv.setImageResource(R.drawable.mugcul);
                iv2.setImageResource(R.drawable.mug);
                s1 = getInfo(1,9);
                tv.setText(s1);
                s2 = getInfo(2,9);
                tv2.setText(s2);
            }
            else if (sd.equals("maskolai")){
                iv.setImageResource(R.drawable.mugcul);
                iv2.setImageResource(R.drawable.maskolai);
                s1 = getInfo(1,10);
                tv.setText(s1);
                s2 = getInfo(2,10);
                tv2.setText(s2);
            }
            else if (sd.equals("chola")){
                iv.setImageResource(R.drawable.cholacul);
                iv2.setImageResource(R.drawable.cholacul1);
                s1 = getInfo(1,11);
                tv.setText(s1);
                s2 = getInfo(2,11);
                tv2.setText(s2);
            }
        }
        else if( !tl.equals("null") || tl.equals("til") || tl.equals("badam") || tl.equals("sorisha") || tl.equals("surjomukhi") || tl.equals("soyabin")){
            if(tl.equals("til")){
                iv.setImageResource(R.drawable.tilcul);
                iv2.setImageResource(R.drawable.til);
                s1 = getInfo(1,12);
                tv.setText(s1);
                s2 = getInfo(2,12);
                tv2.setText(s2);
            }
            else if (tl.equals("badam")){
                iv.setImageResource(R.drawable.badamcul);
                iv2.setImageResource(R.drawable.badam);
                s1 = getInfo(1,13);
                tv.setText(s1);
                s2 = getInfo(2,13);
                tv2.setText(s2);
            }
            else if (tl.equals("sorisha")){
                iv.setImageResource(R.drawable.sorishacul);
                iv2.setImageResource(R.drawable.sorisha);
                s1 = getInfo(1,14);
                tv.setText(s1);
                s2 = getInfo(2,14);
                tv2.setText(s2);
            }
            else if (tl.equals("surjomukhi")){
                iv.setImageResource(R.drawable.surjomukhicul);
                iv2.setImageResource(R.drawable.surjomukhi);
                s1 = getInfo(1,15);
                tv.setText(s1);
                s2 = getInfo(2,15);
                tv2.setText(s2);
            }
            else if (tl.equals("soyabin")){
                iv.setImageResource(R.drawable.soyabincul);
                iv2.setImageResource(R.drawable.soyabin);
                s1 = getInfo(1,16);
                tv.setText(s1);
                s2 = getInfo(2,16);
                tv2.setText(s2);
            }
        }
        else if( !sb.equals("null") || sb.equals("lalsak") || sb.equals("puisak") || sb.equals("begun") || sb.equals("potol") || sb.equals("daros") || sb.equals("tomato") || sb.equals("moris")){
            if(sb.equals("lalsak")){
                iv.setImageResource(R.drawable.lalsakcul);
                iv2.setImageResource(R.drawable.lalsak);
                s1 = getInfo(1,17);
                tv.setText(s1);
                s2 = getInfo(2,17);
                tv2.setText(s2);
            }
            else if (sb.equals("puisak")){
                iv.setImageResource(R.drawable.puisakcul);
                iv2.setImageResource(R.drawable.badam);
                s1 = getInfo(1,18);
                tv.setText(s1);
                s2 = getInfo(2,18);
                tv2.setText(s2);
            }
            else if (sb.equals("begun")){
                iv.setImageResource(R.drawable.beguncul);
                iv2.setImageResource(R.drawable.begun);
                s1 = getInfo(1,19);
                tv.setText(s1);
                s2 = getInfo(2,19);
                tv2.setText(s2);
            }
            else if (sb.equals("potol")){
                iv.setImageResource(R.drawable.potolcul);
                iv2.setImageResource(R.drawable.potol);
                s1 = getInfo(1,20);
                tv.setText(s1);
                s2 = getInfo(2,20);
                tv2.setText(s2);
            }
            else if (sb.equals("daros")){
                iv.setImageResource(R.drawable.daroscul);
                iv2.setImageResource(R.drawable.daros);
                s1 = getInfo(1,21);
                tv.setText(s1);
                s2 = getInfo(2,21);
                tv2.setText(s2);
            }
            else if (sb.equals("tomato")){
                iv.setImageResource(R.drawable.tomatocul);
                iv2.setImageResource(R.drawable.tomato);
                s1 = getInfo(1,22);
                tv.setText(s1);
                s2 = getInfo(2,22);
                tv2.setText(s2);
            }
            else if (sb.equals("moris")){
                iv.setImageResource(R.drawable.moriscul);
                iv2.setImageResource(R.drawable.moris);
                s1 = getInfo(1,23);
                tv.setText(s1);
                s2 = getInfo(2,23);
                tv2.setText(s2);
            }
        }
        else if( !kn.equals("null") || kn.equals("alu") || kn.equals("mistialu") || kn.equals("mukhikocu") || kn.equals("panikocu")){
            if(kn.equals("alu")){
                iv.setImageResource(R.drawable.alucul);
                iv2.setImageResource(R.drawable.alu);
                s1 = getInfo(1,24);
                tv.setText(s1);
                s2 = getInfo(2,24);
                tv2.setText(s2);
            }
            else if (kn.equals("mistialu")){
                iv.setImageResource(R.drawable.mistialucul);
                iv2.setImageResource(R.drawable.mistialu);
                s1 = getInfo(1,25);
                tv.setText(s1);
                s2 = getInfo(2,25);
                tv2.setText(s2);
            }
            else if (kn.equals("mukhikocu")){
                iv.setImageResource(R.drawable.mukhikocucul);
                iv2.setImageResource(R.drawable.mukhikocu);
                s1 = getInfo(1,26);
                tv.setText(s1);
                s2 = getInfo(2,26);
                tv2.setText(s2);
            }
            else if (kn.equals("panikocu")){
                iv.setImageResource(R.drawable.mukhikocucul);
                iv2.setImageResource(R.drawable.panikocu);
                s1 = getInfo(1,27);
                tv.setText(s1);
                s2 = getInfo(2,27);
                tv2.setText(s2);
            }
        }
        else if( !ms.equals("null") || ms.equals("peaj") || ms.equals("rosun") || ms.equals("ada") || ms.equals("holud") || ms.equals("dhonia")){
            if(ms.equals("peaj")){
                iv.setImageResource(R.drawable.peajcul);
                iv2.setImageResource(R.drawable.peaj);
                s1 = getInfo(1,28);
                tv.setText(s1);
                s2 = getInfo(2,28);
                tv2.setText(s2);
            }
            else if (ms.equals("rosun")){
                iv.setImageResource(R.drawable.rosuncul);
                iv2.setImageResource(R.drawable.rosun);
                s1 = getInfo(1,29);
                tv.setText(s1);
                s2 = getInfo(2,29);
                tv2.setText(s2);
            }
            else if (ms.equals("ada")){
                iv.setImageResource(R.drawable.adacul);
                iv2.setImageResource(R.drawable.ada);
                s1 = getInfo(1,30);
                tv.setText(s1);
                s2 = getInfo(2,30);
                tv2.setText(s2);
            }
            else if (ms.equals("holud")){
                iv.setImageResource(R.drawable.holudcul);
                iv2.setImageResource(R.drawable.holud);
                s1 = getInfo(1,31);
                tv.setText(s1);
                s2 = getInfo(2,31);
                tv2.setText(s2);
            }
            else if (ms.equals("dhonia")){
                iv.setImageResource(R.drawable.dhoniacul);
                iv2.setImageResource(R.drawable.dhonia);
                s1 = getInfo(1,32);
                tv.setText(s1);
                s2 = getInfo(2,32);
                tv2.setText(s2);
            }
        }
        else if( !ot.equals("null") || ot.equals("akh") || ot.equals("pat") || ot.equals("tula")){
            if(ot.equals("akh")){
                iv.setImageResource(R.drawable.akh);
                s1 = getInfo(1,33);
                tv.setText(s1);
            }
            else if (ot.equals("pat")){
                iv.setImageResource(R.drawable.patcul);
                iv2.setImageResource(R.drawable.pat);
                s1 = getInfo(1,34);
                tv.setText(s1);
                s2 = getInfo(2,34);
                tv2.setText(s2);
            }
            else if (ot.equals("tula")){
                iv.setImageResource(R.drawable.tulacul);
                iv2.setImageResource(R.drawable.tula);
                s1 = getInfo(1,35);
                tv.setText(s1);
                s2 = getInfo(2,35);
                tv2.setText(s2);
            }
        }

        //if(sd.equals("motor")) iv.setImageResource(R.drawable.motor);

        //return fragment
        return v;




        //return super.onCreateView(inflater, container, savedInstanceState);
        //return inflater.inflate(R.layout.cultivate,container,false);
    }

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

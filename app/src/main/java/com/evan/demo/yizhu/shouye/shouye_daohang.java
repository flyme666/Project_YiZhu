package com.evan.demo.yizhu.shouye;

import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.evan.demo.yizhu.R;

public class shouye_daohang extends AppCompatActivity {

    private int flag1 = 0;
    private int flag2 = 0;
    private int flag3 = 0;
    private int flag4 = 0;
    private int flag5 = 0;
    private int flag6 = 0;
    private Button myHome;
    private Button canting;
    private Button jianshenfang;
    private Button xiyifang;
    private Button huiyishi;
    private Button qiantai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shouye_daohang);
        ImageButton back = (ImageButton)findViewById(R.id.daohang_back);
        TextView off_daohang = (TextView)findViewById(R.id.daohang_off);
        TextView myHome_id = (TextView)findViewById(R.id.myHome_id);
        myHome = (Button)findViewById(R.id.button_myHome);
        canting = (Button)findViewById(R.id.button_canting);
        jianshenfang = (Button)findViewById(R.id.button_jianshenfang);
        xiyifang = (Button)findViewById(R.id.button_xiyifang);
        huiyishi = (Button)findViewById(R.id.button_huiyishi);
        qiantai = (Button)findViewById(R.id.button_qiantai);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shouye_daohang.this.finish();
            }
        });
        off_daohang.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        myHome_id.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);


        if(flag1 == 0){
            myHome.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_off));
            myHome.setTextColor(Color.rgb(64,147,74));
        }else {
            myHome.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_on));
            myHome.setTextColor(Color.rgb(255,255,255));
        }
        myHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag1 == 1){
                    myHome.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_off));
                    myHome.setTextColor(Color.rgb(64,147,74));
                    flag1 = 0;
                }else {
                    myHome.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_on));
                    myHome.setTextColor(Color.rgb(255,255,255));
                    flag1 = 1;
                }
            }
        });

        if(flag2 == 0){
            canting.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_off));
            canting.setTextColor(Color.rgb(64,147,74));
        }else {
            canting.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_on));
            canting.setTextColor(Color.rgb(255,255,255));
        }
        canting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag2 == 1){
                    canting.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_off));
                    canting.setTextColor(Color.rgb(64,147,74));
                    flag2 = 0;
                }else {
                    canting.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_on));
                    canting.setTextColor(Color.rgb(255,255,255));
                    flag2 = 1;
                }
            }
        });
        if(flag3 == 0){
            jianshenfang.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_off));
            jianshenfang.setTextColor(Color.rgb(64,147,74));
        }else {
            jianshenfang.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_on));
            jianshenfang.setTextColor(Color.rgb(255,255,255));
        }
        jianshenfang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag3 == 1){
                    jianshenfang.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_off));
                    jianshenfang.setTextColor(Color.rgb(64,147,74));
                    flag3 = 0;
                }else {
                    jianshenfang.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_on));
                    jianshenfang.setTextColor(Color.rgb(255,255,255));
                    flag3 = 1;
                }
            }
        });
        if(flag4 == 0){
            xiyifang.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_off));
            xiyifang.setTextColor(Color.rgb(64,147,74));
        }else {
            xiyifang.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_on));
            xiyifang.setTextColor(Color.rgb(255,255,255));
        }
        xiyifang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag4 == 1){
                    xiyifang.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_off));
                    xiyifang.setTextColor(Color.rgb(64,147,74));
                    flag4 = 0;
                }else {
                    xiyifang.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_on));
                    xiyifang.setTextColor(Color.rgb(255,255,255));
                    flag4 = 1;
                }
            }
        });
        if(flag5 == 0){
            huiyishi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_off));
            huiyishi.setTextColor(Color.rgb(64,147,74));
        }else {
            huiyishi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_on));
            huiyishi.setTextColor(Color.rgb(255,255,255));
        }
        huiyishi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag5 == 1){
                    huiyishi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_off));
                    huiyishi.setTextColor(Color.rgb(64,147,74));
                    flag5 = 0;
                }else {
                    huiyishi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_on));
                    huiyishi.setTextColor(Color.rgb(255,255,255));
                    flag5 = 1;
                }
            }
        });
        if(flag6 == 0){
            qiantai.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_off));
            qiantai.setTextColor(Color.rgb(64,147,74));
        }else {
            qiantai.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_on));
            qiantai.setTextColor(Color.rgb(255,255,255));
        }
        qiantai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag6 == 1){
                    qiantai.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_off));
                    qiantai.setTextColor(Color.rgb(64,147,74));
                    flag6 = 0;
                }else {
                    qiantai.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_on));
                    qiantai.setTextColor(Color.rgb(255,255,255));
                    flag6 = 1;
                }
            }
        });

    }
}

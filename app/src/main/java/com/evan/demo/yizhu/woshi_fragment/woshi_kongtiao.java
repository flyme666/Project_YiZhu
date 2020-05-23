package com.evan.demo.yizhu.woshi_fragment;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.evan.demo.yizhu.R;


public class woshi_kongtiao extends Fragment {
    private View rootView;
    private TextView wendu;
    private Typeface mFace;

    private ImageButton woshi_zhileng;
    private ImageButton woshi_chuchen;
    private ImageButton woshi_zhire;
    private ImageButton woshi_tongfeng;
    private ImageButton woshi_button;

    private Button woshi_fengxiang;
    private Button woshi_fengsu;
    private Button woshi_dingshi;
    private Button woshi_jieneng;

    private int flag = 0;
    private int flag1 = 0;
    private int flag2 = 0;
    private int flag3 = 0;
    private int flag4 = 0;
    private int flag5 = 0;
    private int flag6= 0;
    private int flag7 = 0;
    private int flag8 = 0;
    @Override
    public void onAttach(Context context){
        super.onAttach(context);
    }


    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.fragment_woshi_kongtiao,container,false);
        initUi();
        return rootView;
    }

    private void initUi(){
        //这里写加载布局的代码
        wendu = (TextView)rootView.findViewById(R.id.woshi_wendu);
        woshi_zhileng = (ImageButton)rootView.findViewById(R.id.woshi_zhileng);
        woshi_chuchen = (ImageButton)rootView.findViewById(R.id.woshi_chuchen);
        woshi_zhire = (ImageButton)rootView.findViewById(R.id.woshi_zhire);
        woshi_tongfeng = (ImageButton)rootView.findViewById(R.id.woshi_tongfeng);
        woshi_button = (ImageButton)rootView.findViewById(R.id.woshi_kaiguan);

        woshi_fengxiang = (Button)rootView.findViewById(R.id.woshi_fengxiang);
        woshi_fengsu = (Button)rootView.findViewById(R.id.woshi_fengsu);
        woshi_dingshi = (Button)rootView.findViewById(R.id.woshi_dingshi);
        woshi_jieneng = (Button)rootView.findViewById(R.id.woshi_jieneng);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        //这里写逻辑代码
        mFace = Typeface.createFromAsset(rootView.getContext().getAssets(), "fonts/sitka.ttc");
        wendu.setTypeface(mFace);

        if(flag == 0 ){
            woshi_fengxiang.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            woshi_fengxiang.setTextColor(Color.rgb(64,147,74));
        }
        else {
            woshi_fengxiang.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            woshi_fengxiang.setTextColor(Color.WHITE);
        }
        woshi_fengxiang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag == 0 ){
                    woshi_fengxiang.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    woshi_fengxiang.setTextColor(Color.WHITE);
                    flag = 1;
                }
                else {
                    woshi_fengxiang.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    woshi_fengxiang.setTextColor(Color.rgb(64,147,74));
                    flag = 0;
                }
            }
        });

        if(flag1 == 0 ){
            woshi_fengsu.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            woshi_fengsu.setTextColor(Color.rgb(64,147,74));
        }
        else {
            woshi_fengsu.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            woshi_fengsu.setTextColor(Color.WHITE);
        }
        woshi_fengsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag1 == 0 ){
                    woshi_fengsu.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    woshi_fengsu.setTextColor(Color.WHITE);
                    flag1 = 1;
                }
                else {
                    woshi_fengsu.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    woshi_fengsu.setTextColor(Color.rgb(64,147,74));
                    flag1 = 0;
                }

            }
        });

        if(flag2 == 0 ){
            woshi_dingshi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            woshi_dingshi.setTextColor(Color.rgb(64,147,74));
        }
        else {
            woshi_dingshi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            woshi_dingshi.setTextColor(Color.WHITE);
        }
        woshi_dingshi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag2 == 0 ){
                    woshi_dingshi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    woshi_dingshi.setTextColor(Color.WHITE);
                    flag2 = 1;
                }
                else {
                    woshi_dingshi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    woshi_dingshi.setTextColor(Color.rgb(64,147,74));
                    flag2 = 0;
                }
            }
        });

        if(flag3 == 0 ){
            woshi_jieneng.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            woshi_jieneng.setTextColor(Color.rgb(64,147,74));
        }
        else {
            woshi_jieneng.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            woshi_jieneng.setTextColor(Color.WHITE);
        }
        woshi_jieneng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag3 == 0 ){
                    woshi_jieneng.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    woshi_jieneng.setTextColor(Color.WHITE);
                    flag3 = 1;
                }
                else {
                    woshi_jieneng.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    woshi_jieneng.setTextColor(Color.rgb(64,147,74));
                    flag3 = 0;
                }
            }
        });

        if(flag4 == 0 ){
            woshi_zhileng.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            woshi_zhileng.setImageDrawable(getResources().getDrawable(R.drawable.xue));
        }
        else {
            woshi_zhileng.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            woshi_zhileng.setImageDrawable(getResources().getDrawable(R.drawable.xue_white));
        }
        woshi_zhileng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag4 == 0 ){
                    woshi_zhileng.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    woshi_zhileng.setImageDrawable(getResources().getDrawable(R.drawable.xue_white));
                    flag4 = 1;
                }
                else {
                    woshi_zhileng.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    woshi_zhileng.setImageDrawable(getResources().getDrawable(R.drawable.xue));
                    flag4 = 0;
                }

            }
        });

        if(flag5 == 0 ){
            woshi_chuchen.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));

        }
        else {
            woshi_chuchen.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));

        }
        woshi_chuchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag5 == 0 ){
                    woshi_chuchen.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));

                    flag5 = 1;
                }
                else {
                    woshi_chuchen.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));

                    flag5 = 0;
                }
            }
        });

        if(flag6 == 0 ){
            woshi_zhire.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));

        }
        else {
            woshi_zhire.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));

        }
        woshi_zhire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag6 == 0 ){
                    woshi_zhire.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));

                    flag6 = 1;
                }
                else {
                    woshi_zhire.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    flag6 = 0;
                }
            }
        });

        if(flag7 == 0 ){
            woshi_tongfeng.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
        }
        else {
            woshi_tongfeng.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
        }
        woshi_tongfeng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag7 == 0 ){
                    woshi_tongfeng.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    flag7 = 1;
                }
                else {
                    woshi_tongfeng.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    flag7 = 0;
                }

            }
        });

        if(flag8 == 0 ){
            woshi_button.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            woshi_button.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }
        else {
            woshi_button.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            woshi_button.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }
        woshi_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag8 == 0 ){
                    woshi_button.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    woshi_button.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    flag8 = 1;
                }
                else {
                    woshi_button.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    woshi_button.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    flag8 = 0;
                }
            }
        });

    }
}


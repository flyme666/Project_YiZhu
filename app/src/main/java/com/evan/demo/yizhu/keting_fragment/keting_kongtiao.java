package com.evan.demo.yizhu.keting_fragment;

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


public class keting_kongtiao extends Fragment {
    private View rootView;
    private TextView wendu;
    private Typeface mFace;

    private ImageButton keting_zhileng;
    private ImageButton keting_chuchen;
    private ImageButton keting_zhire;
    private ImageButton keting_tongfeng;
    private ImageButton keting_button;

    private Button keting_fengxiang;
    private Button keting_fengsu;
    private Button keting_dingshi;
    private Button keting_jieneng;

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
    public void onAttach(Context context) {
        super.onAttach(context);
    }


    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_keting_kongtiao, container, false);
        initUi();
        return rootView;
    }

    private void initUi() {
        //这里写加载布局的代码
        wendu = (TextView)rootView.findViewById(R.id.kongtiao_wendu);
        keting_zhileng = (ImageButton)rootView.findViewById(R.id.keting_zhileng);
        keting_chuchen = (ImageButton)rootView.findViewById(R.id.keting_chuchen);
        keting_zhire = (ImageButton)rootView.findViewById(R.id.keting_zhire);
        keting_tongfeng = (ImageButton)rootView.findViewById(R.id.keting_tongfeng);
        keting_button = (ImageButton)rootView.findViewById(R.id.keting_kaiguan);

        keting_fengxiang = (Button)rootView.findViewById(R.id.keting_fengxiang);
        keting_fengsu = (Button)rootView.findViewById(R.id.keting_fengsu);
        keting_dingshi = (Button)rootView.findViewById(R.id.keting_dingshi);
        keting_jieneng = (Button)rootView.findViewById(R.id.keting_jieneng);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //这里写逻辑代码
        mFace = Typeface.createFromAsset(rootView.getContext().getAssets(), "fonts/sitka.ttc");
        wendu.setTypeface(mFace);

        if(flag == 0 ){
            keting_fengxiang.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            keting_fengxiang.setTextColor(Color.rgb(64,147,74));
        }
        else {
            keting_fengxiang.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            keting_fengxiang.setTextColor(Color.WHITE);
        }
        keting_fengxiang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag == 0 ){
                    keting_fengxiang.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    keting_fengxiang.setTextColor(Color.WHITE);
                    flag = 1;
                }
                else {
                    keting_fengxiang.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    keting_fengxiang.setTextColor(Color.rgb(64,147,74));
                    flag = 0;
                }
            }
        });

        if(flag1 == 0 ){
            keting_fengsu.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            keting_fengsu.setTextColor(Color.rgb(64,147,74));
        }
        else {
            keting_fengsu.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            keting_fengsu.setTextColor(Color.WHITE);
        }
        keting_fengsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag1 == 0 ){
                    keting_fengsu.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    keting_fengsu.setTextColor(Color.WHITE);
                    flag1 = 1;
                }
                else {
                    keting_fengsu.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    keting_fengsu.setTextColor(Color.rgb(64,147,74));
                    flag1 = 0;
                }

            }
        });

        if(flag2 == 0 ){
            keting_dingshi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            keting_dingshi.setTextColor(Color.rgb(64,147,74));
        }
        else {
            keting_dingshi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            keting_dingshi.setTextColor(Color.WHITE);
        }
        keting_dingshi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag2 == 0 ){
                    keting_dingshi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    keting_dingshi.setTextColor(Color.WHITE);
                    flag2 = 1;
                }
                else {
                    keting_dingshi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    keting_dingshi.setTextColor(Color.rgb(64,147,74));
                    flag2 = 0;
                }
            }
        });

        if(flag3 == 0 ){
            keting_jieneng.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            keting_jieneng.setTextColor(Color.rgb(64,147,74));
        }
        else {
            keting_jieneng.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            keting_jieneng.setTextColor(Color.WHITE);
        }
        keting_jieneng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag3 == 0 ){
                    keting_jieneng.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    keting_jieneng.setTextColor(Color.WHITE);
                    flag3 = 1;
                }
                else {
                    keting_jieneng.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    keting_jieneng.setTextColor(Color.rgb(64,147,74));
                    flag3 = 0;
                }
            }
        });

        if(flag4 == 0 ){
            keting_zhileng.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            keting_zhileng.setImageDrawable(getResources().getDrawable(R.drawable.xue));
        }
        else {
            keting_zhileng.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            keting_zhileng.setImageDrawable(getResources().getDrawable(R.drawable.xue_white));
        }
        keting_zhileng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag4 == 0 ){
                    keting_zhileng.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    keting_zhileng.setImageDrawable(getResources().getDrawable(R.drawable.xue_white));
                    flag4 = 1;
                }
                else {
                    keting_zhileng.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    keting_zhileng.setImageDrawable(getResources().getDrawable(R.drawable.xue));
                    flag4 = 0;
                }

            }
        });

        if(flag5 == 0 ){
            keting_chuchen.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));

        }
        else {
            keting_chuchen.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));

        }
        keting_chuchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag5 == 0 ){
                    keting_chuchen.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));

                    flag5 = 1;
                }
                else {
                    keting_chuchen.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));

                    flag5 = 0;
                }
            }
        });

        if(flag6 == 0 ){
            keting_zhire.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));

        }
        else {
            keting_zhire.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));

        }
        keting_zhire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag6 == 0 ){
                    keting_zhire.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));

                    flag6 = 1;
                }
                else {
                    keting_zhire.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    flag6 = 0;
                }
            }
        });

        if(flag7 == 0 ){
            keting_tongfeng.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
        }
        else {
            keting_tongfeng.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
        }
        keting_tongfeng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag7 == 0 ){
                    keting_tongfeng.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    flag7 = 1;
                }
                else {
                    keting_tongfeng.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    flag7 = 0;
                }

            }
        });

        if(flag8 == 0 ){
            keting_button.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            keting_button.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }
        else {
            keting_button.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            keting_button.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }
        keting_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag8 == 0 ){
                    keting_button.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    keting_button.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    flag8 = 1;
                }
                else {
                    keting_button.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    keting_button.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    flag8 = 0;
                }
            }
        });

    }
}

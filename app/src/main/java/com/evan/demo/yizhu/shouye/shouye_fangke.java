package com.evan.demo.yizhu.shouye;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.evan.demo.yizhu.R;

public class shouye_fangke extends AppCompatActivity {
    private int mPreFragmentFlag = 0;
    private int flag1 = 1;
    private int flag2 = 0;
    private int flag3 = 0;
    Button btn_all ;
    Button btn_shengqing;
    Button btn_yichuli ;
    Fragment[] mFragments =new Fragment[3];
    private void initFragment() {
        mFragments[0] = new fangkejilu_all();
        mFragments[1] = new fangkejilu_shenqing();
        mFragments[2] = new fangkejilu_yichuli();
        initLoadFragment(R.id.fangkejilu_frame, 0, mFragments);
    }
    private void initLoadFragment(int containerId, int showFragment, Fragment... fragments) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        for (int i = 0; i < fragments.length; i++) {
            transaction.add(containerId, fragments[i], fragments[i].getClass().getName());
            if (i != showFragment)
                transaction.hide(fragments[i]);
        }
        transaction.commitAllowingStateLoss();
    }
    private void showAndHideFragment(Fragment show, Fragment hide) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (show != hide)
            transaction.show(show).hide(hide).commitAllowingStateLoss();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shouye_fangke);
        ImageButton back = (ImageButton)findViewById(R.id.fangke_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shouye_fangke.this.finish();
            }
        });
        initFragment();
        btn_all = (Button)findViewById(R.id.all);
        btn_shengqing = (Button)findViewById(R.id.shengqing);
        btn_yichuli = (Button)findViewById(R.id.yichuli);
        btn_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAndHideFragment(mFragments[0], mFragments[mPreFragmentFlag]);
                mPreFragmentFlag = 0;
                if(flag1 == 1){
                    btn_all.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_off));
                    btn_all.setTextColor(Color.rgb(64,147,74));
                    flag1 = 0;
                }
                else {
                    btn_all.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_on));
                    btn_all.setTextColor(Color.rgb(255,255,255));
                    btn_shengqing.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_off));
                    btn_shengqing.setTextColor(Color.rgb(64,147,74));
                    btn_yichuli.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_off));
                    btn_yichuli.setTextColor(Color.rgb(64,147,74));
                    flag1 = 1;
                    flag2 = 0;
                    flag3 = 0;
                }
            }
        });
        btn_shengqing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAndHideFragment(mFragments[1], mFragments[mPreFragmentFlag]);
                mPreFragmentFlag = 1;
                if(flag2 == 1){
                    btn_shengqing.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_off));
                    btn_shengqing.setTextColor(Color.rgb(64,147,74));
                    flag2 = 0;
                }
                else {
                    btn_shengqing.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_on));
                    btn_shengqing.setTextColor(Color.rgb(255,255,255));
                    btn_all.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_off));
                    btn_all.setTextColor(Color.rgb(64,147,74));
                    btn_yichuli.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_off));
                    btn_yichuli.setTextColor(Color.rgb(64,147,74));
                    flag2 = 1;
                    flag1 = 0;
                    flag3 = 0;
                }
            }
        });
        btn_yichuli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAndHideFragment(mFragments[2], mFragments[mPreFragmentFlag]);
                mPreFragmentFlag = 2;
                if(flag3 == 1){
                    btn_yichuli.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_off));
                    btn_yichuli.setTextColor(Color.rgb(64,147,74));
                    flag3 = 0;
                }
                else {
                    btn_yichuli.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_on));
                    btn_yichuli.setTextColor(Color.rgb(255,255,255));
                    btn_all.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_off));
                    btn_all.setTextColor(Color.rgb(64,147,74));
                    btn_shengqing.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_off));
                    btn_shengqing.setTextColor(Color.rgb(64,147,74));
                    flag3 = 1;
                    flag1 = 0;
                    flag2 = 0;
                }
            }
        });

    }
}

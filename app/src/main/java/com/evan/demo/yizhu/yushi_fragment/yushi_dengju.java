package com.evan.demo.yizhu.yushi_fragment;

import android.content.Context;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.evan.demo.yizhu.R;


public class yushi_dengju extends Fragment {
    private View rootView;
    private ImageButton zhu;
    private ImageButton jing;
    private ImageButton yushi;
    private ImageButton nuan;
    private ImageButton ye;

    private int flag = 0;
    private int flag1 = 0;
    private int flag2 = 0;
    private int flag3 = 0;
    private int flag4 = 0;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }


    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_yushi_dengju, container, false);
        initUi();
        return rootView;
    }

    private void initUi() {
        //这里写加载布局的代码
        zhu = (ImageButton)rootView.findViewById(R.id.zhudeng);
        jing = (ImageButton)rootView.findViewById(R.id.jingdeng);
        yushi = (ImageButton)rootView.findViewById(R.id.yushideng);
        nuan = (ImageButton)rootView.findViewById(R.id.nuandeng);
        ye = (ImageButton)rootView.findViewById(R.id.yedeng);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //这里写逻辑代码
        if(flag == 0 ){
            zhu.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            zhu.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }
        else {
            zhu.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            zhu.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }
        zhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag == 0 ){
                    zhu.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    zhu.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    flag = 1;
                }
                else {
                    zhu.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    zhu.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    flag = 0;
                }

            }
        });
        if(flag1 == 0 ){
            jing.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            jing.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }
        else {
            jing.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            jing.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }
        jing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag1 == 0 ){
                    jing.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    jing.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    flag1 = 1;
                }
                else {
                    jing.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    jing.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    flag1 = 0;
                }

            }
        });
        if(flag2 == 0 ){
            yushi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            yushi.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }
        else {
            yushi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            yushi.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }
        yushi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag2 == 0 ){
                    yushi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    yushi.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    flag2 = 1;
                }
                else {
                    yushi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    yushi.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    flag2 = 0;
                }

            }
        });
        if(flag3 == 0 ){
            nuan.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            nuan.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }
        else {
            nuan.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            nuan.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }
        nuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag3 == 0 ){
                    nuan.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    nuan.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    flag3 = 1;
                }
                else {
                    nuan.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    nuan.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    flag3 = 0;
                }

            }
        });
        if(flag4 == 0 ){
            ye.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            ye.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }
        else {
            ye.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            ye.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }
        ye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag4 == 0 ){
                    ye.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    ye.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    flag4 = 1;
                }
                else {
                    ye.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    ye.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    flag4 = 0;
                }

            }
        });
    }
}

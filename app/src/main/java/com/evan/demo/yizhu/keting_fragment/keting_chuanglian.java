package com.evan.demo.yizhu.keting_fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.evan.demo.yizhu.R;


public class keting_chuanglian extends Fragment {
    private View rootView;
    private ImageButton open;
    private ImageButton close;
    private ImageButton stop;

    private int flag = 0;
    private int flag1 = 0;
    private int flag2 = 0;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }


    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_keting_chuanglian, container, false);
        initUi();
        return rootView;
    }

    private void initUi() {
        //这里写加载布局的代码
        open = (ImageButton)rootView.findViewById(R.id.keting_open_chuanglian);
        close = (ImageButton)rootView.findViewById(R.id.keting_close_chuanglian);
        stop = (ImageButton)rootView.findViewById(R.id.keting_stop_chuanglian);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //这里写逻辑代码
        if(flag == 0 ){
            open.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            open.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }
        else {
            open.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            open.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag == 0 ){
                    open.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    open.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    flag = 1;
                }
                else {
                    open.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    open.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    flag = 0;
                }

            }
        });


        if(flag1 == 0 ){
            close.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            close.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }
        else {
            close.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            close.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag1 == 0 ){
                    close.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    close.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    flag1 = 1;
                }
                else {
                    close.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    close.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    flag1 = 0;
                }

            }
        });

        if(flag2 == 0 ){
            stop.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            stop.setImageDrawable(getResources().getDrawable(R.drawable.juxing));
        }
        else {
            stop.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            stop.setImageDrawable(getResources().getDrawable(R.drawable.juxing_white));
        }
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag2 == 0 ){
                    stop.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    stop.setImageDrawable(getResources().getDrawable(R.drawable.juxing_white));
                    flag2 = 1;
                }
                else {
                    stop.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    stop.setImageDrawable(getResources().getDrawable(R.drawable.juxing));
                    flag2 = 0;
                }

            }
        });
    }
}

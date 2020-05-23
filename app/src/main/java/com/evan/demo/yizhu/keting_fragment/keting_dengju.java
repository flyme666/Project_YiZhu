package com.evan.demo.yizhu.keting_fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.evan.demo.yizhu.R;
import com.evan.demo.yizhu.VerticalProgressBar;


public class keting_dengju extends Fragment {
    private View rootView;
    private ImageButton dianshi;
    private ImageButton ding;
    private ImageButton bi;
    private VerticalProgressBar vpProgressBar;
    private TextView liangdu;

    private Handler mhandler;

    private int flag = 0;
    private int flag1 = 0;
    private int flag2 = 0;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }


    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_keting_dengju, container, false);
        initUi();
        return rootView;
    }

    private void initUi() {
        //这里写加载布局的代码
        dianshi = (ImageButton)rootView.findViewById(R.id.dianshideng_keting);
        ding = (ImageButton)rootView.findViewById(R.id.dingdeng_keting);
        bi = (ImageButton)rootView.findViewById(R.id.bideng_keting);
        vpProgressBar = (VerticalProgressBar) rootView.findViewById(R.id.vp_progress_keting);
        liangdu = (TextView)rootView.findViewById(R.id.liangdu_keting);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //这里写逻辑代码
//        run();
//        mhandler = new Handler() {
//
//            //handleMessage为处理消息的方法
//            public void handleMessage (Message msg){
//                super.handleMessage(msg);
//                if (true) {
//                    liangdu.setText(msg.arg1 + "%");
//                }
//            }
//        };
        vpProgressBar.setProgress(75);
        liangdu.setText("75%");
        if(flag == 0 ){
            dianshi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            dianshi.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }
        else {
            dianshi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            dianshi.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }
        dianshi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag == 0 ){
                    dianshi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    dianshi.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    flag = 1;
                }
                else {
                    dianshi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    dianshi.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    flag = 0;
                }

            }
        });


        if(flag1 == 0 ){
            ding.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            ding.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }
        else {
            ding.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            ding.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }
        ding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag1 == 0 ){
                    ding.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    ding.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    flag1 = 1;
                }
                else {
                    ding.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    ding.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    flag1 = 0;
                }

            }
        });

        if(flag2 == 0 ){
            bi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            bi.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }
        else {
            bi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            bi.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }
        bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag2 == 0 ){
                    bi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    bi.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    flag2 = 1;
                }
                else {
                    bi.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    bi.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    flag2 = 0;
                }

            }
        });
    }
    private void run() {
        new Thread(){
            public void run() {
                try {
                    for (int i= 0;i<=100;i++) {
                        Thread.sleep(500);//休息50毫秒
                        vpProgressBar.setProgress(i);//更新进度条进度
                        Message msg = Message.obtain();
                        msg.arg1 = i;//Message类有属性字段arg1、arg2、what...
                        mhandler.sendMessage(msg);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
        }.start();
    }

}

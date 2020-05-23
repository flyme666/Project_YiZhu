package com.evan.demo.yizhu.woshi_fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.evan.demo.yizhu.R;


public class woshi_dianshi extends Fragment {
    private View rootView;
    private ImageButton dianshiButton;
    private  int flag = 0;

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
    }


    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.fragment_woshi_dianshi,container,false);
        initUi();
        return rootView;
    }

    private void initUi(){
        //这里写加载布局的代码
        dianshiButton = (ImageButton)rootView.findViewById(R.id.dianshiButton);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        //这里写逻辑代码
        if(flag == 0 ){
            dianshiButton.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            dianshiButton.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }
        else {
            dianshiButton.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            dianshiButton.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }
        dianshiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag == 0 ){
                    dianshiButton.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    dianshiButton.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    flag = 1;
                }
                else {
                    dianshiButton.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    dianshiButton.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    flag = 0;
                }

            }
        });
    }
}

package com.evan.demo.yizhu.yushi_fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.evan.demo.yizhu.R;


public class yushi_paifengshan extends Fragment {
    private View rootView;
    private ImageButton paifengshan;
    private int flag = 0;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }


    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_yushi_paifengshan, container, false);
        initUi();
        return rootView;
    }

    private void initUi() {
        //这里写加载布局的代码
        paifengshan = (ImageButton)rootView.findViewById(R.id.paifengshan);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //这里写逻辑代码
        if(flag == 0 ){
            paifengshan.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
            paifengshan.setImageDrawable(getResources().getDrawable(R.drawable.paifengshan_off));
        }
        else {
            paifengshan.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
            paifengshan.setImageDrawable(getResources().getDrawable(R.drawable.paifengshan_on));
        }
        paifengshan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag == 0 ){
                    paifengshan.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_isselect));
                    paifengshan.setImageDrawable(getResources().getDrawable(R.drawable.paifengshan_on));
                    flag = 1;
                }
                else {
                    paifengshan.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_circle_notselect));
                    paifengshan.setImageDrawable(getResources().getDrawable(R.drawable.paifengshan_off));
                    flag = 0;
                }

            }
        });
    }
}

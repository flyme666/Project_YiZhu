package com.evan.demo.yizhu.shouye;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.evan.demo.yizhu.R;



public class fangkejilu_shenqing extends Fragment {
    private View rootView;

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
    }


    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.fragment_fangkejilu_shenqing,container,false);
        initUi();
        return rootView;
    }

    private void initUi(){
        //这里写加载布局的代码

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        //这里写逻辑代码

    }

}

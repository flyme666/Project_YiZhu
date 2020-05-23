package com.evan.demo.yizhu.shouye;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.evan.demo.yizhu.R;
import com.evan.demo.yizhu.keting;
import com.evan.demo.yizhu.yushi;

import java.util.ArrayList;


public class fangkejilu_all extends Fragment {
    private View rootView;

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
    }


    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.fragment_fangkejilu_all,container,false);
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

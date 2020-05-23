package com.evan.demo.yizhu;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.evan.demo.yizhu.yushi_fragment.yushi_dengju;
import com.evan.demo.yizhu.yushi_fragment.yushi_paifengshan;
import com.evan.demo.yizhu.yushi_fragment.yushi_tizhongcheng;

import java.util.ArrayList;


public class WodeFragment extends Fragment {
    private View rootView3;
    private ImageView wode;

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
    }


    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView3 = inflater.inflate(R.layout.fragment_wode,container,false);
        initUi();
        return rootView3;
    }

    private void initUi(){
        //这里写加载布局的代码
        wode = (ImageView)rootView3.findViewById(R.id.wode);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        //这里写逻辑代码
        wode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),com.evan.demo.yizhu.wode.wode_shimingrenzheng1.class);
                startActivity(i);
            }
        });


    }
}

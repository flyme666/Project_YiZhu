package com.evan.demo.yizhu.yushi_fragment;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.evan.demo.yizhu.R;


public class yushi_tizhongcheng extends Fragment {
    private View rootView;
    private TextView tizhong;
    private TextView kg;
    private Typeface mFace;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }


    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_yushi_tizhongcheng, container, false);
        initUi();
        return rootView;
    }

    private void initUi() {
        //这里写加载布局的代码
        kg = (TextView)rootView.findViewById(R.id.kg);
        tizhong = (TextView)rootView.findViewById(R.id.tizhong);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //这里写逻辑代码
        mFace = Typeface.createFromAsset(rootView.getContext().getAssets(), "fonts/sitka.ttc");
        tizhong.setTypeface(mFace);
        kg.setTypeface(mFace);
    }
}

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
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.evan.demo.yizhu.yushi_fragment.yushi_dengju;
import com.evan.demo.yizhu.yushi_fragment.yushi_paifengshan;
import com.evan.demo.yizhu.yushi_fragment.yushi_tizhongcheng;

import java.util.ArrayList;


public class ShouyeFragment extends Fragment {
    private View rootView;
    private TextView shuaxing;
    private ImageButton xiyi;
    private ImageButton jiucan;
    private ImageButton jianshen;
    private ImageButton huiyi;
    private ImageButton maoyan;
    private ImageButton daohang;
    private ImageButton fangke;
    private ImageButton fuwu;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_shouye,container,false);
        initUi();
        return rootView;
    }


    @Override
    public void onAttach(Context context){
        super.onAttach(context);
    }


    private void initUi(){
        //这里写加载布局的代码
        shuaxing = (TextView)rootView.findViewById(R.id.shouye_shuaxing);
        xiyi = (ImageButton) rootView.findViewById(R.id.shouye_zhihuixiyi);
        jiucan = (ImageButton) rootView.findViewById(R.id.shouye_jiucan);
        jianshen = (ImageButton) rootView.findViewById(R.id.shouye_jianshenfang);
        huiyi = (ImageButton) rootView.findViewById(R.id.shouye_huiyishi);
        maoyan = (ImageButton) rootView.findViewById(R.id.shouye_zhihuimaoyan);
        daohang = (ImageButton) rootView.findViewById(R.id.shouye_ardaohang);
        fangke = (ImageButton) rootView.findViewById(R.id.shouye_fangkejilu);
        fuwu = (ImageButton) rootView.findViewById(R.id.shouye_jiudianfuwu);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        //这里写逻辑代码
        createLink();
        xiyi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),com.evan.demo.yizhu.shouye.shouye_zhihuixiyi.class);
                startActivity(i);
            }
        });
        jiucan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),com.evan.demo.yizhu.shouye.shouye_jiucan.class);
                startActivity(i);
            }
        });
        jianshen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),com.evan.demo.yizhu.shouye.shouye_jianshen.class);
                startActivity(i);
            }
        });
        huiyi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),com.evan.demo.yizhu.shouye.shouye_huiyi.class);
                startActivity(i);
            }
        });
        maoyan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),com.evan.demo.yizhu.shouye.shouye_maoyan.class);
                startActivity(i);
            }
        });
        daohang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),com.evan.demo.yizhu.shouye.shouye_daohang.class);
                startActivity(i);
            }
        });
        fangke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),com.evan.demo.yizhu.shouye.shouye_fangke.class);
                startActivity(i);
            }
        });
        fuwu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),com.evan.demo.yizhu.shouye.shouye_fuwu.class);
                startActivity(i);
            }
        });

    }
    private void createLink() {
        // 创建一个 SpannableString对象
        SpannableString sp = new SpannableString("点击刷新");
        // 设置超链接
        sp.setSpan(new URLSpan("http://www.baidu.com"), 0, 4,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        shuaxing.setText(sp);
        shuaxing.setMovementMethod(LinkMovementMethod.getInstance());
    }

}
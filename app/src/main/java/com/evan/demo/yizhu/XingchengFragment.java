package com.evan.demo.yizhu;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class XingchengFragment extends Fragment{
    private View rootView;
    private Button dache;
    private Button ruzhu;
    private Button suixingrenyuan;
    private Button xuzhu;
    private Button yanchituifang;
    private Button zizhutuifang;
    private Button how1;
    private Button how2;
    private Button wancheng;
    private Button xuanfang;
    private Button querenxuanfang;
    private Button zaixiangxiang;
    private Button next;
    private Button zizhutuifang_tuifang;
    private Button zizhuxuzhu_xuzhu;
    private Button xingzhong_renyuan;
    private EditText name;
    private EditText phone;
    private EditText shenfenzhenghao;
    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private TextView renyuan;
    private TextView renyuan2;
    private TextView dengjirenlian;
    private ImageView tianjia;
    private LinearLayout xingqian;
    private LinearLayout xingzhong;
    private LinearLayout xinghou;
    private LinearLayout zizhuruzhu;
    private LinearLayout xuanfang_linearlayout;
    private LinearLayout ruzhuqueren;
    private LinearLayout renyuandengji;
    private LinearLayout zizhutuifang_linearlayout;
    private LinearLayout zizhuxuzhu_linearlayout;

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
    }


    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.fragment_xingcheng,container,false);
        initUi();
        return rootView;
    }

    private void initUi(){
        //这里写加载布局的代码
        dache = (Button)rootView.findViewById(R.id.xingcheng_dache);
        ruzhu = (Button)rootView.findViewById(R.id.xingcheng_dengjiruzhu);
        suixingrenyuan = (Button)rootView.findViewById(R.id.xingcheng_zhuce);
        xuzhu = (Button)rootView.findViewById(R.id.xingcheng_xuzhu);
        yanchituifang = (Button)rootView.findViewById(R.id.xingcheng_yanchituifang);
        zizhutuifang = (Button)rootView.findViewById(R.id.xingcheng_zizhutuifang);
        how1 = (Button)rootView.findViewById(R.id.how1);
        how2 = (Button)rootView.findViewById(R.id.how2);
        xingqian = (LinearLayout)rootView.findViewById(R.id.xingqian);
        xingzhong = (LinearLayout)rootView.findViewById(R.id.xingzhong);
        xinghou = (LinearLayout)rootView.findViewById(R.id.xinghou);
        zizhuruzhu = (LinearLayout)rootView.findViewById(R.id.zizhuruzhu);
        img1 = (ImageView)rootView.findViewById(R.id.name_img);
        img2 = (ImageView)rootView.findViewById(R.id.phone_img);
        img3 = (ImageView)rootView.findViewById(R.id.shenfenzhenghao_img);
        name = (EditText)rootView.findViewById(R.id.ruzhu_name);
        phone = (EditText)rootView.findViewById(R.id.ruzhu_phone);
        shenfenzhenghao = (EditText)rootView.findViewById(R.id.ruzhu_shenfenzheng);
        renyuan = (TextView)rootView.findViewById(R.id.ruzhu_suixingrenyuan);
        renyuan2 = (TextView)rootView.findViewById(R.id.ruzhu_suixingrenyuan2);
        wancheng = (Button)rootView.findViewById(R.id.wanchengruzhu);
        xuanfang = (Button)rootView.findViewById(R.id.xuanfang);
        querenxuanfang = (Button)rootView.findViewById(R.id.querenxuanfang);
        zaixiangxiang = (Button)rootView.findViewById(R.id.zaixiangxiang);
        xuanfang_linearlayout = (LinearLayout)rootView.findViewById(R.id.xuanfang_linearlayout);
        next = (Button)rootView.findViewById(R.id.ruzhu_next);
        ruzhuqueren = (LinearLayout)rootView.findViewById(R.id.ruzhuqueren);
        tianjia = (ImageView)rootView.findViewById(R.id.renyuan_tianjia);
        renyuandengji = (LinearLayout)rootView.findViewById(R.id.renyuandengji);
        zizhutuifang_linearlayout = (LinearLayout)rootView.findViewById(R.id.zizhutuifang);
        zizhutuifang_tuifang = (Button)rootView.findViewById(R.id.tuifang);
        zizhuxuzhu_xuzhu = (Button)rootView.findViewById(R.id.xuzhu);
        zizhuxuzhu_linearlayout = (LinearLayout)rootView.findViewById(R.id.zizhuxuzhu);
        xingzhong_renyuan = (Button)rootView.findViewById(R.id.xingzhong_renyuan);
        dengjirenlian = (TextView)rootView.findViewById(R.id.dengjirenlian);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        //这里写逻辑代码
        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img1.setVisibility(View.VISIBLE);
            }
        });
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img2.setVisibility(View.VISIBLE);
            }
        });
        shenfenzhenghao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img3.setVisibility(View.VISIBLE);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zizhuruzhu.setVisibility(View.GONE);
                ruzhuqueren.setVisibility(View.VISIBLE);
            }
        });

        querenxuanfang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"入住成功！",Toast.LENGTH_SHORT).show();
                xuanfang_linearlayout.setVisibility(View.GONE);
                xingzhong.setVisibility(View.VISIBLE);
            }
        });

        zaixiangxiang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuanfang_linearlayout.setVisibility(View.GONE);
                xingqian.setVisibility(View.VISIBLE);
            }
        });

        renyuan.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        renyuan2.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        renyuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zizhuruzhu.setVisibility(View.GONE);
                renyuandengji.setVisibility(View.VISIBLE);
            }
        });
        renyuan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ruzhuqueren.setVisibility(View.GONE);
                renyuandengji.setVisibility(View.VISIBLE);
            }
        });

        dengjirenlian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                renyuandengji.setVisibility(View.GONE);
                xingqian.setVisibility(View.VISIBLE);
            }
        });

        zizhutuifang_tuifang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zizhutuifang_linearlayout.setVisibility(View.GONE);
                xinghou.setVisibility(View.VISIBLE);
            }
        });

        zizhuxuzhu_xuzhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zizhuxuzhu_linearlayout.setVisibility(View.GONE);
                xingzhong.setVisibility(View.VISIBLE);
                Toast.makeText(getActivity(),"续住成功！",Toast.LENGTH_SHORT).show();
            }
        });

        wancheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"入住成功！",Toast.LENGTH_SHORT).show();
                ruzhuqueren.setVisibility(View.GONE);
                xingzhong.setVisibility(View.VISIBLE);
            }
        });

        tianjia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zizhuruzhu.setVisibility(View.VISIBLE);
                renyuandengji.setVisibility(View.GONE);
            }
        });

        xuanfang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ruzhuqueren.setVisibility(View.GONE);
                xuanfang_linearlayout.setVisibility(View.VISIBLE);
            }
        });

        dache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                xingqian.setVisibility(View.GONE);
//                xinghou.setVisibility(View.GONE);
//                xingzhong.setVisibility(View.VISIBLE);
//                zizhuruzhu.setVisibility(View.GONE);
            }
        });
        ruzhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xingqian.setVisibility(View.GONE);
                xinghou.setVisibility(View.GONE);
                zizhuruzhu.setVisibility(View.VISIBLE);
                xingzhong.setVisibility(View.GONE);
            }
        });
        suixingrenyuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xingqian.setVisibility(View.GONE);
                xinghou.setVisibility(View.GONE);
                zizhuruzhu.setVisibility(View.GONE);
                xingzhong.setVisibility(View.GONE);
                renyuandengji.setVisibility(View.VISIBLE);
            }
        });
        xuzhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xingqian.setVisibility(View.GONE);
                xingzhong.setVisibility(View.GONE);
                zizhuruzhu.setVisibility(View.GONE);
                xinghou.setVisibility(View.GONE);
                zizhuxuzhu_linearlayout.setVisibility(View.VISIBLE);
            }
        });
        yanchituifang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xingqian.setVisibility(View.GONE);
                xingzhong.setVisibility(View.GONE);
                zizhuruzhu.setVisibility(View.GONE);
                xinghou.setVisibility(View.VISIBLE);
            }
        });
        xingzhong_renyuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xingqian.setVisibility(View.GONE);
                xingzhong.setVisibility(View.GONE);
                zizhuruzhu.setVisibility(View.GONE);
                xinghou.setVisibility(View.GONE);
                renyuandengji.setVisibility(View.VISIBLE);
            }
        });
        zizhutuifang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xingqian.setVisibility(View.GONE);
                xingzhong.setVisibility(View.GONE);
                zizhuruzhu.setVisibility(View.GONE);
                xinghou.setVisibility(View.GONE);
                zizhutuifang_linearlayout.setVisibility(View.VISIBLE);
            }
        });
        how1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xingqian.setVisibility(View.VISIBLE);
                xingzhong.setVisibility(View.GONE);
                zizhuruzhu.setVisibility(View.GONE);
                xinghou.setVisibility(View.GONE);
            }
        });
        how2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xingqian.setVisibility(View.VISIBLE);
                xingzhong.setVisibility(View.GONE);
                zizhuruzhu.setVisibility(View.GONE);
                xinghou.setVisibility(View.GONE);
            }
        });

    }

}

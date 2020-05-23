package com.evan.demo.yizhu;

import android.content.Context;
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

import java.util.ArrayList;


public class YaokongqiFragment extends Fragment {
    private View rootView;

    private TabLayout mytab;
    private ViewPager myViewPager;
    private ImageView bg;
    private TextView t1;
    private TextView t2;
    private TextView t3;
    private TextView t4;


    private ArrayList<String> TitleList = new ArrayList<>();  //页卡标题集合
    private ArrayList<Fragment> ViewList = new ArrayList<>();   //页卡视图集合


    @Override
    public void onAttach(Context context){
        super.onAttach(context);
    }


    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.fragment_yaokongqi,container,false);
        initUi();
        return rootView;
    }

    private void initUi(){
        //这里写加载布局的代码
        mytab = (TabLayout) rootView.findViewById(R.id.mytab);
        myViewPager = (ViewPager) rootView.findViewById(R.id.myViewPager);
        t1 = (TextView)rootView.findViewById(R.id.textView1);
        t2 = (TextView)rootView.findViewById(R.id.textView_wendu);
        t3 = (TextView)rootView.findViewById(R.id.textView3);
        t4 = (TextView)rootView.findViewById(R.id.textView_shidu);

        bg = (ImageView) rootView.findViewById(R.id.bg);
        ViewList.add(new woshi());
        ViewList.add(new yushi());
        ViewList.add(new keting());
        TitleList.add("卧室");
        TitleList.add("浴室");
        TitleList.add("客厅");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        //这里写逻辑代码

//        mytab.setTabMode(TabLayout.MODE_FIXED);
        mytab.addTab(mytab.newTab().setText(TitleList.get(0)));
        mytab.addTab(mytab.newTab().setText(TitleList.get(1)));
        mytab.addTab(mytab.newTab().setText(TitleList.get(2)));
        //设置adapter
        myViewPager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()){
            //获取每个页卡
            @Override
            public Fragment getItem(int position){
                return ViewList.get(position);
            }
            //获取页卡数
            @Override
            public int getCount(){
                return  TitleList.size();
            }
            //获取页卡标题
            @Override
            public CharSequence getPageTitle(int position){
                return TitleList.get(position);
            }
        });
        //tab与viewpager绑定
        mytab.setupWithViewPager(myViewPager);
        myViewPager.setOffscreenPageLimit(2);
        bg.setBackgroundResource(R.drawable.room1);

        mytab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                switch (mytab.getSelectedTabPosition()){
                    case 0:
                        t1.setVisibility(View.VISIBLE);
                        t2.setVisibility(View.VISIBLE);
                        t3.setVisibility(View.VISIBLE);
                        t4.setVisibility(View.VISIBLE);
                        bg.setBackgroundResource(R.drawable.room1);
                        break;
                    case 1:
                        t1.setVisibility(View.INVISIBLE);
                        t2.setVisibility(View.INVISIBLE);
                        t3.setVisibility(View.INVISIBLE);
                        t4.setVisibility(View.INVISIBLE);
                        bg.setBackgroundResource(R.drawable.room4);
                        break;
                    case 2:
                        t1.setVisibility(View.INVISIBLE);
                        t2.setVisibility(View.INVISIBLE);
                        t3.setVisibility(View.INVISIBLE);
                        t4.setVisibility(View.INVISIBLE);
                        bg.setBackgroundResource(R.drawable.room2);
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.setCustomView(null);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

}

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
import android.widget.Toast;

import com.evan.demo.yizhu.woshi_fragment.woshi_chuanglian;
import com.evan.demo.yizhu.woshi_fragment.woshi_dengju;
import com.evan.demo.yizhu.woshi_fragment.woshi_dianshi;
import com.evan.demo.yizhu.woshi_fragment.woshi_kongtiao;

import java.util.ArrayList;


public class woshi extends Fragment {
    private View rootView1;

    private TabLayout mytab_woshi;
    private ViewPager myViewPager_woshi;

    private ArrayList<String> TitleList1 = new ArrayList<>();  //页卡标题集合
    private ArrayList<Fragment> ViewList1 = new ArrayList<>();   //页卡视图集合


    @Override
    public void onAttach(Context context){
        super.onAttach(context);
    }


    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView1 = inflater.inflate(R.layout.fragment_woshi,container,false);
        initUi();
        return rootView1;
    }

    private void initUi(){
        //这里写加载布局的代码
        mytab_woshi = (TabLayout) rootView1.findViewById(R.id.mytab_woshi);
        myViewPager_woshi = (ViewPager) rootView1.findViewById(R.id.myViewPager_woshi);
        ViewList1.add(new woshi_dengju());
        ViewList1.add(new woshi_chuanglian());
        ViewList1.add(new woshi_kongtiao());
        ViewList1.add(new woshi_dianshi());
        TitleList1.add("灯具");
        TitleList1.add("窗帘");
        TitleList1.add("空调");
        TitleList1.add("电视");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        //这里写逻辑代码

//        mytab_woshi.setTabMode(TabLayout.MODE_FIXED);
        myViewPager_woshi.setOffscreenPageLimit(2);
        mytab_woshi.addTab(mytab_woshi.newTab().setText(TitleList1.get(0)));
        mytab_woshi.addTab(mytab_woshi.newTab().setText(TitleList1.get(1)));
        mytab_woshi.addTab(mytab_woshi.newTab().setText(TitleList1.get(2)));
        mytab_woshi.addTab(mytab_woshi.newTab().setText(TitleList1.get(3)));
        //设置adapter
        myViewPager_woshi.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()){
            //获取每个页卡
            @Override
            public Fragment getItem(int position){
                return ViewList1.get(position);
            }
            //获取页卡数
            @Override
            public int getCount(){
                return  TitleList1.size();
            }
            //获取页卡标题
            @Override
            public CharSequence getPageTitle(int position){
                return TitleList1.get(position);
            }
        });
        //tab与viewpager绑定
        mytab_woshi.setupWithViewPager(myViewPager_woshi);
        mytab_woshi.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
//                Toast.makeText(getActivity(),"this is item"+ (mytab_woshi.getSelectedTabPosition()), Toast.LENGTH_SHORT).show();
                switch (mytab_woshi.getSelectedTabPosition()){
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
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

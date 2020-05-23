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

import com.evan.demo.yizhu.keting_fragment.keting_chuanglian;
import com.evan.demo.yizhu.keting_fragment.keting_dengju;
import com.evan.demo.yizhu.keting_fragment.keting_dianshi;
import com.evan.demo.yizhu.keting_fragment.keting_kongtiao;

import java.util.ArrayList;


public class keting extends Fragment {
    private View rootView2;

    private TabLayout mytab_keting;
    private ViewPager myViewPager_keting;

    private ArrayList<String> TitleList1 = new ArrayList<>();  //页卡标题集合
    private ArrayList<Fragment> ViewList1 = new ArrayList<>();   //页卡视图集合


    @Override
    public void onAttach(Context context){
        super.onAttach(context);
    }


    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView2 = inflater.inflate(R.layout.fragment_keting,container,false);
        initUi();
        return rootView2;
    }

    private void initUi(){
        //这里写加载布局的代码
        mytab_keting = (TabLayout) rootView2.findViewById(R.id.mytab_keting);
        myViewPager_keting = (ViewPager) rootView2.findViewById(R.id.myViewPager_keting);
        ViewList1.add(new keting_dengju());
        ViewList1.add(new keting_chuanglian());
        ViewList1.add(new keting_kongtiao());
        ViewList1.add(new keting_dianshi());
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
        myViewPager_keting.setOffscreenPageLimit(1);
        mytab_keting.addTab(mytab_keting.newTab().setText(TitleList1.get(0)));
        mytab_keting.addTab(mytab_keting.newTab().setText(TitleList1.get(1)));
        mytab_keting.addTab(mytab_keting.newTab().setText(TitleList1.get(2)));
        mytab_keting.addTab(mytab_keting.newTab().setText(TitleList1.get(3)));
        //设置adapter
        myViewPager_keting.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()){
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
        mytab_keting.setupWithViewPager(myViewPager_keting);
        mytab_keting.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
//                Toast.makeText(getActivity(),"this is item"+ (mytab_keting.getSelectedTabPosition()), Toast.LENGTH_SHORT).show();
                switch (mytab_keting.getSelectedTabPosition()){
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

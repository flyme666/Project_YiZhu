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

import com.evan.demo.yizhu.yushi_fragment.yushi_dengju;
import com.evan.demo.yizhu.yushi_fragment.yushi_paifengshan;
import com.evan.demo.yizhu.yushi_fragment.yushi_tizhongcheng;

import java.util.ArrayList;


public class yushi extends Fragment {
    private View rootView3;

    private TabLayout mytab_yushi;
    private ViewPager myViewPager_yushi;

    private ArrayList<String> TitleList1 = new ArrayList<>();  //页卡标题集合
    private ArrayList<Fragment> ViewList1 = new ArrayList<>();   //页卡视图集合


    @Override
    public void onAttach(Context context){
        super.onAttach(context);
    }


    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView3 = inflater.inflate(R.layout.fragment_yushi,container,false);
        initUi();
        return rootView3;
    }

    private void initUi(){
        //这里写加载布局的代码
        mytab_yushi = (TabLayout) rootView3.findViewById(R.id.mytab_yushi);
        myViewPager_yushi = (ViewPager) rootView3.findViewById(R.id.myViewPager_yushi);
        ViewList1.add(new yushi_dengju());
        ViewList1.add(new yushi_paifengshan());
        ViewList1.add(new yushi_tizhongcheng());
        TitleList1.add("灯具");
        TitleList1.add("排风扇");
        TitleList1.add("体重秤");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        //这里写逻辑代码

//        mytab_woshi.setTabMode(TabLayout.MODE_FIXED);
        myViewPager_yushi.setOffscreenPageLimit(2);
        mytab_yushi.addTab(mytab_yushi.newTab().setText(TitleList1.get(0)));
        mytab_yushi.addTab(mytab_yushi.newTab().setText(TitleList1.get(1)));
        mytab_yushi.addTab(mytab_yushi.newTab().setText(TitleList1.get(2)));
        //设置adapter
        myViewPager_yushi.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()){
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
        mytab_yushi.setupWithViewPager(myViewPager_yushi);
        mytab_yushi.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
//                Toast.makeText(getActivity(),"this is item"+ (mytab_yushi.getSelectedTabPosition()), Toast.LENGTH_SHORT).show();
                switch (mytab_yushi.getSelectedTabPosition()){
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
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

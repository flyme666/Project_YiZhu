package com.evan.demo.yizhu.shouye;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.evan.demo.yizhu.R;

import java.util.ArrayList;

public class shouye_maoyan extends AppCompatActivity {
    private TabLayout mytab_maoyan;
    private ViewPager myViewPager_maoyan;
    private Button button_maoyao;
    private ImageView maoyan;
    private RelativeLayout.LayoutParams params;
    private LinearLayout searchViewContainer;
    private int flag1 = 0;

    private ArrayList<String> TitleList = new ArrayList<>();  //页卡标题集合
    private ArrayList<Fragment> ViewList = new ArrayList<>();   //页卡视图集合


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shouye_maoyan);
        mytab_maoyan = (TabLayout)findViewById(R.id.mytab_maoyan);
        myViewPager_maoyan = (ViewPager)findViewById(R.id.myViewPager_maoyan);
        button_maoyao = (Button)findViewById(R.id.button_maoyan);
        maoyan = (ImageView)findViewById(R.id.maoyan);

        ImageButton back = (ImageButton)findViewById(R.id.maoyan_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shouye_maoyan.this.finish();
            }
        });
        params= new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        searchViewContainer = (LinearLayout)findViewById(R.id.maoyan_linearLayout);
        params = (RelativeLayout.LayoutParams)searchViewContainer.getLayoutParams();



        if(flag1 == 0){
            button_maoyao.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_off));
            button_maoyao.setTextColor(Color.rgb(64,147,74));
        }else {
            button_maoyao.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_on));
            button_maoyao.setTextColor(Color.rgb(255,255,255));
        }
        button_maoyao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag1 == 1){
                    button_maoyao.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_off));
                    button_maoyao.setTextColor(Color.rgb(64,147,74));
                    maoyan.setImageResource(R.drawable.zhihuimaoyan);
                    button_maoyao.setText("开启猫眼");
                    params.setMargins(0, 600, 0, 0);
                    searchViewContainer.setLayoutParams(params);
                    flag1 = 0;
                }else {
                    button_maoyao.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_green_on));
                    button_maoyao.setTextColor(Color.rgb(255,255,255));
                    maoyan.setImageResource(R.drawable.zhihuimaoyan_on);
                    button_maoyao.setText("关闭猫眼");
                    params.setMargins(0, 1200, 0, 0);
                    searchViewContainer.setLayoutParams(params);
                    flag1 = 1;
                }
            }
        });

        ViewList.add(new maoyan_shuren());
        ViewList.add(new maoyan_jiudianrenyuan());
        ViewList.add(new maoyan_moshenren());
        TitleList.add("熟人");
        TitleList.add("酒店人员");
        TitleList.add("陌生人");
        mytab_maoyan.addTab(mytab_maoyan.newTab().setText(TitleList.get(0)));
        mytab_maoyan.addTab(mytab_maoyan.newTab().setText(TitleList.get(1)));
        mytab_maoyan.addTab(mytab_maoyan.newTab().setText(TitleList.get(2)));

        myViewPager_maoyan.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()){
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
        mytab_maoyan.setupWithViewPager(myViewPager_maoyan);
        myViewPager_maoyan.setOffscreenPageLimit(2);


    }
}

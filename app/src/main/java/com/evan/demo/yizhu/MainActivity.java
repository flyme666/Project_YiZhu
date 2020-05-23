package com.evan.demo.yizhu;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.evan.demo.yizhu.utils.BottomNavigationViewHelper;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {


    private BottomNavigationView mBottomNavigationView;

    private int lastIndex;
    List<Fragment> mFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initBottomNavigation();
        initData();
        adjustNavigationIcoSize(mBottomNavigationView);

    }

    public void initView() {
//        mToolbar = findViewById(R.id.toolbar);

    }

    public void initData() {
//        setSupportActionBar(mToolbar);
        mFragments = new ArrayList<>();
        mFragments.add(new YudingFragment());
        mFragments.add(new XingchengFragment());
        mFragments.add(new ShouyeFragment());
        mFragments.add(new YaokongqiFragment());
        mFragments.add(new WodeFragment());
        setFragmentPosition(0);
    }

    public void initBottomNavigation() {
        mBottomNavigationView = findViewById(R.id.bv_bottomNavigation);
        BottomNavigationViewHelper.disableShiftMode(mBottomNavigationView);
        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_yuding:
                        setFragmentPosition(0);
                        break;
                    case R.id.menu_xingcheng:
                        setFragmentPosition(1);
                        break;
                    case R.id.menu_shouye:
                        setFragmentPosition(2);
                        break;
                    case R.id.menu_yaokongqi:
                        setFragmentPosition(3);
                        break;
                    case R.id.menu_wode:
                        setFragmentPosition(4);
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
    }


    private void setFragmentPosition(int position) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Fragment currentFragment = mFragments.get(position);
        Fragment lastFragment = mFragments.get(lastIndex);
        lastIndex = position;
        ft.hide(lastFragment);
        if (!currentFragment.isAdded()) {
            getSupportFragmentManager().beginTransaction().remove(currentFragment).commit();
            ft.add(R.id.ll_frameLayout, currentFragment);
        }
        ft.show(currentFragment);
        ft.commitAllowingStateLoss();
    }

    private void adjustNavigationIcoSize(BottomNavigationView navigation){
        BottomNavigationMenuView menuView = (BottomNavigationMenuView) navigation.getChildAt(0);
        for (int i = 0; i < menuView.getChildCount(); i++) {
            final View iconView = menuView.getChildAt(i).findViewById(android.support.design.R.id.icon);
            final ViewGroup.LayoutParams layoutParams = iconView.getLayoutParams();
            final DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            layoutParams.height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 25, displayMetrics);
            layoutParams.width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 25, displayMetrics);
            iconView.setLayoutParams(layoutParams);
        }
        final View iconView = menuView.getChildAt(2).findViewById(android.support.design.R.id.icon);
        final ViewGroup.LayoutParams layoutParams = iconView.getLayoutParams();
        final DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        layoutParams.height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 35, displayMetrics);
        layoutParams.width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 35, displayMetrics);
        iconView.setLayoutParams(layoutParams);
    }

}

package com.example.user.viewpagertest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = (ViewPager) findViewById(R.id.my_pager);

        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public int getCount() {
                //提供頁面數量
                return 3;
            }
            @Override
            public Fragment getItem(int position) {
                //這裡為了產生滑動效果我提供3個Fragment，其方法跟上面所說的一樣
                switch (position) {
                    case 0:
                        return new FragmentOne();
                    case 1:
                        return new FragmentTwo();
                    case 2:
                        return new FragmentThree();
                    default:  return null;
                }
            }
        });


    }
}

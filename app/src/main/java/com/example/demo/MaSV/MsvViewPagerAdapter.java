package com.example.demo.MaSV;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.demo.fragment.AddressFragment;
import com.example.demo.fragment.MsvFragment;
import com.example.demo.fragment.NewsFragment;

public class MsvViewPagerAdapter extends FragmentStatePagerAdapter {
    public MsvViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Tab1Fragment();
            case 1:
                return new Tab2Fragment();
            case 2:
                return new Tab3Fragment();
            default:
                return new Tab1Fragment();
        }
    }

    @Override
    public int getCount() {

        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Tên";
            case 1:
                return "Lớp học phần ";
            case 2:
                return "Lớp sinh hoạt";
            default:
                return "Tên";
        }
    }
}

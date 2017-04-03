package com.mentalmachines.mvptemplate.views.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mentalmachines.mvptemplate.R;
import com.mentalmachines.mvptemplate.di.component.FragmentComponent;
import com.mentalmachines.mvptemplate.views.base.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by jkim11 on 4/3/17.
 */

public class ViewPagerFragment extends BaseFragment {
    @BindView(R.id.viewPager) ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        viewPagerAdapter = new ViewPagerAdapter(getActivity().getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.view_pager_fragment, container);
        ButterKnife.bind(this, container);
        return view;
    }

    @Override
    public int getLayout() {
        // return R.layout.view_pager_fragment;
        return 0;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public FragmentComponent fragmentComponent() {
        return super.fragmentComponent();
    }

    public static class ViewPagerAdapter extends FragmentPagerAdapter {
        private static int NUM_ITEMS = 3;

        public ViewPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        // Returns total number of pages
        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        // Returns the fragment to display for that page
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0: // Fragment # 0 - This will show FirstFragment
                    return TabFragment.newInstance();

                default:
                    return null;
            }
        }

        // Returns the page title for the top indicator
        @Override
        public CharSequence getPageTitle(int position) {
            return "Page " + position;
        }
    }

    public static class TabFragment extends BaseFragment{
        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        }

        public static TabFragment newInstance(Bundle bundle) {
            TabFragment myFragment = new TabFragment();
            myFragment.setArguments(bundle);
            return myFragment;
        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            return super.onCreateView(inflater, container, savedInstanceState);
        }

        @Override
        public int getLayout() {
            return 0;
        }

        @Override
        public void onSaveInstanceState(Bundle outState) {
            super.onSaveInstanceState(outState);
        }

        @Override
        public void onDestroy() {
            super.onDestroy();
        }

        @Override
        public FragmentComponent fragmentComponent() {
            return super.fragmentComponent();
        }
    }
}

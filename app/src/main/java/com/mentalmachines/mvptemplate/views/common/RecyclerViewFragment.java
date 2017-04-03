package com.mentalmachines.mvptemplate.views.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mentalmachines.mvptemplate.R;
import com.mentalmachines.mvptemplate.di.component.FragmentComponent;
import com.mentalmachines.mvptemplate.views.base.BaseFragment;

import butterknife.BindView;

/**
 * Created by jkim11 on 4/3/17.
 */

public class RecyclerViewFragment extends BaseFragment {
    @BindView(R.id.recycler) RecyclerView recycler;
    @BindView(R.id.swipe_refresh_layout) SwipeRefreshLayout swipeRefreshLayout;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public int getLayout() {
        // return R.layout.recycler_view_fragment
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

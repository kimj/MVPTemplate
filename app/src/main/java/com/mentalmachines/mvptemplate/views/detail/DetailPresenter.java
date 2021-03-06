package com.mentalmachines.mvptemplate.views.detail;

import com.mentalmachines.mvptemplate.di.ConfigPersistent;
import com.mentalmachines.mvptemplate.model.DataManager;
import com.mentalmachines.mvptemplate.views.base.BasePresenter;

import javax.inject.Inject;

/**
 * Created by jkim11 on 3/2/17.
 */

@ConfigPersistent
public class DetailPresenter extends BasePresenter<DetailView> {

    private final DataManager mDataManager;

    @Inject
    public DetailPresenter(DataManager dataManager) {
        mDataManager = dataManager;
    }

    @Override
    public void attachView(DetailView mvpView) {
        super.attachView(mvpView);
    }
}
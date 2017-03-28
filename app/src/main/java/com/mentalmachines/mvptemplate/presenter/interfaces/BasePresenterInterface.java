package com.mentalmachines.mvptemplate.presenter.interfaces;

/**
 * Created by CaptofOuterSpace on 8/25/2016.
 */
public interface BasePresenterInterface {
    void attachView(T mvpView);
    void detachView();
}

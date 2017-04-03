package com.mentalmachines.mvptemplate.views.base;

/**
 * Created by jkim11 on 4/3/17.
 */

public interface BaseContract<T> {
    interface Presenter<T> {
        void attachView(T mvpView);
        void detachView();
    }

    interface View {

    }
}

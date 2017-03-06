package com.mentalmachines.mvptemplate.views.detail;

import com.mentalmachines.mvptemplate.views.base.BaseView;

/**
 * Created by jinn on 2/27/17.
 */
public interface DetailView extends BaseView {

    void showProgress(boolean show);

    void showError(Throwable error);

}

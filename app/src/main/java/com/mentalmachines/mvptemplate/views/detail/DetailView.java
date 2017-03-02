package com.mentalmachines.mvptemplate.views.detail;

/**
 * Created by jinn on 2/27/17.
 */
public interface DetailView extends View {

    void showProgress(boolean show);

    void showError(Throwable error);

}

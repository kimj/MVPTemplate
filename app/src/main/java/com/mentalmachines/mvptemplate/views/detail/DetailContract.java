package com.mentalmachines.mvptemplate.views.detail;

import com.mentalmachines.mvptemplate.views.base.BaseContract;

/**
 * Created by jkim11 on 4/3/17.
 */

public interface DetailContract extends BaseContract {
    interface Presenter {
    }

    interface View {
        void showProgress(boolean show);
        void showError(Throwable error);
    }
}

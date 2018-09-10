package com.example.linhnb.androidcore.screen.main;

import com.example.linhnb.androidcore.screen.base.BasePresenter;
import com.example.linhnb.androidcore.screen.base.BaseView;

public interface MainContract {

    interface View extends BaseView<Presenter> {
        void showSplashScreen();

        void showDialog();

        void hideDialog();
    }

    interface Presenter extends BasePresenter {
        void startPlashScreen();
    }
}
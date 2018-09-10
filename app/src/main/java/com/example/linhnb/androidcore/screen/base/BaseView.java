package com.example.linhnb.androidcore.screen.base;

import com.example.linhnb.androidcore.screen.base.BasePresenter;

public interface BaseView<T extends BasePresenter> {

    void setPresenter(T presenter);
}

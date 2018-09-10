package com.example.linhnb.androidcore.screen.base.listeners;

public interface DataCallBack<T> {

    void onDataSuccess(T data);

    void onDataFailed(String msg);
}

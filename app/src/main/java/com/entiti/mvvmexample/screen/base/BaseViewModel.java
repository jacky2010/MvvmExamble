package com.entiti.mvvmexample.screen.base;

/**
 * Created by THANH TUAN on 5/3/2017.
 */

public interface BaseViewModel<T extends BasePresenter> {

  void onStart();

  void onStop();

  void setPresenter(T presenter);
}

package com.entiti.mvvmexample.data.source.local.realm;

/**
 * Created by THANH TUAN on 5/3/2017.
 */

public interface BaseLocalDataSource {

  void openTransaction();

  void closeTransaction();
}

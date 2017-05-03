package com.entiti.mvvmexample.data.source.local.sharedprefs;

/**
 * Created by THANH TUAN on 5/3/2017.
 */

public interface SharedPrefsApi {

  <T> T get(String key, Class<T> clazz);

  <T> void put(String key, T data);

  void clear();
}

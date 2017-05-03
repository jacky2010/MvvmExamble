package com.entiti.mvvmexample.data.model;

import com.google.gson.Gson;

/**
 * Created by THANH TUAN on 5/3/2017.
 */

public abstract class BaseModel implements Cloneable {

  public BaseModel clone() throws CloneNotSupportedException {
    Gson gson = new Gson();
    return gson.fromJson(gson.toJson(this), this.getClass());
  }
}

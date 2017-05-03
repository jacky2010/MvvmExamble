package com.entiti.mvvmexample.screen.base;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

/**
 * Created by THANH TUAN on 5/3/2017.
 */

public abstract class BaseRecyclerViewAdapter<V extends RecyclerView.ViewHolder> extends
    RecyclerView.Adapter<V> {

  private final Context mContext;

  protected BaseRecyclerViewAdapter(@NonNull Context context) {
    mContext = context;
  }

  protected Context getContext() {
    return mContext;
  }

  public interface OnRecyclerViewItemClickListener<T> {

    void onItemRecyclerViewClick(T item);
  }
}

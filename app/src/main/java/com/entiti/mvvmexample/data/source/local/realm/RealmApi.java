package com.entiti.mvvmexample.data.source.local.realm;

import io.reactivex.Observable;
import io.realm.Realm;
import rx.Subscriber;
import rx.functions.Action2;

/**
 * Created by THANH TUAN on 5/3/2017.
 */

public class RealmApi {

  private Realm mRealm;

  public RealmApi() {
    mRealm = Realm.getDefaultInstance();
  }

  public <T> Observable<T> realmTransactionAsync(
      final Action2<Subscriber<? super T>, Realm> action) {
    return null;
  }

  public <T> Observable<T> realmGet(final Action2<Subscriber<? super T>, Realm> action) {
    return null;
  }

  public void closeRealmOnMainThread() {
    if (mRealm != null && !mRealm.isClosed()) {
      mRealm.close();
      mRealm = null;
    }
  }
}

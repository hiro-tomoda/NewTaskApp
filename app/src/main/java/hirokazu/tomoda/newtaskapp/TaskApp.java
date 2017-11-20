package hirokazu.tomoda.newtaskapp;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by ecodev10 on 2017/11/20.
 */

public class TaskApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}

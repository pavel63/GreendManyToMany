package com.pavelwinter.greendmamytom;

import android.app.Application;

import org.greenrobot.greendao.database.Database;

/**
 * Created by newuser on 19.03.2017.
 */

public class App extends Application {

    DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();

        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "notes-db2");
        Database db = helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }

    public DaoSession getDaoSession(){
        return daoSession;
    }

}

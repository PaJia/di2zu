package app.jiyun.com.my_text.Application;

import android.app.Application;

import app.jiyun.com.android_greendao_demo.DaoMaster;
import app.jiyun.com.android_greendao_demo.DaoSession;

/**
 * Created by lvxinxin on 2017/10/27.
 */

public class application extends Application {
    public static application application;
    private DaoSession daoSession;

    private static application application() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        DaoMaster.DevOpenHelper mast = new DaoMaster.DevOpenHelper(this, "stu.db");
     hajksdfiaisdkfkkasdfs
        daoSession = daoMaster.newSession();
    }

    public DaoSession getdaoSession() {

        return daoSession;
    }

}

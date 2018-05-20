package cool.monkey.android.smartclothes.base;

import android.app.Application;

import com.blankj.utilcode.util.Utils;

import interfaces.heweather.com.interfacesmodule.view.HeConfig;

public class CCApplication extends Application {

    private static CCApplication INSTANCE;

    public static CCApplication getInstance() {
        return INSTANCE;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
        Utils.init(getApplicationContext());
        HeConfig.init("HE1805182157491763", "bbc081f799e44f158fef95e90a511f85");
    }


}

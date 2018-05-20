package cool.monkey.android.smartclothes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

import cool.monkey.android.smartclothes.utils.GsonConverter;
import interfaces.heweather.com.interfacesmodule.view.HeConfig;
import interfaces.heweather.com.interfacesmodule.view.HeWeather;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HeConfig.switchToFreeServerNode();
        HeConfig.init("HE1805182157491763", "bbc081f799e44f158fef95e90a511f85");
        HeConfig.switchToFreeServerNode();
        getPermission();
    }

    public void getPermission() {
        PermissionUtils.permission(PermissionConstants.STORAGE, PermissionConstants.LOCATION, PermissionConstants.PHONE)
                .rationale(new PermissionUtils.OnRationaleListener() {
                    @Override
                    public void rationale(final ShouldRequest shouldRequest) {
                        shouldRequest.again(true);
                    }
                })
                .callback(new PermissionUtils.FullCallback() {
                    @Override
                    public void onGranted(List<String> permissionsGranted) {

                        HeWeather.getWeatherNow(MainActivity.this, "北京",
                                new HeWeather.OnResultWeatherNowBeanListener() {
                                    @Override
                                    public void onError(Throwable e) {
                                        Log.i("Log", "onError: ", e);

                                        LogUtils.e("MainActivity onError  getWeatherNow = "+e);
                                    }

                                    @Override
                                    public void onSuccess(List dataObject) {
                                        LogUtils.e("MainActivity onSuccess  getWeatherNow = "+ new Gson().toJson(dataObject));
                                        Log.i("Log", "onSuccess: " + new Gson().toJson(dataObject));
                                        Log.i("Log", "onSuccess: " + new Gson().toJson(dataObject));

                                        String json = GsonConverter.toJson(dataObject);

                                        Log.i("Log", "onSuccess: " + new Gson().toJson(dataObject));
//
//                                        bean myBean = GsonConverter.fromJson(json,bean.class);

                                        LogUtils.e("MainActivity onSuccess 0000 json = "+json);

                                        if (GsonConverter.isValidityJson(json)){


//                                            bean myBean = GsonConverter.fromJson(json,bean.class);

//                                            List<bean> beans = GsonConverter.jsonToList(json,bean.class);


                                            List<Weather> stus = new Gson().fromJson(json, new TypeToken<List<Weather>>() {}.getType());

                                            LogUtils.e("MainActivity onSuccess 0000 json = "+json);
                                            LogUtils.e("MainActivity onSuccess 1111 stus = "+stus);
                                            LogUtils.e("MainActivity onSuccess 2222 stus = "+stus.get(0).getNow().getTmp());
                                            LogUtils.e("MainActivity onSuccess 3334 stus = "+stus.get(0).getNow().getCond_txt());



                                        }

//                                        Weather weather2 = GsonConverter.fromJson(new Gson().toJson(dataObject),Weather.class);

//                                        LogUtils.e("MainActivity onSuccess 222 weather2 = "+weather2);
                                        LogUtils.e("MainActivity onSuccess 333 dataObject = "+dataObject);

                                        LogUtils.e("MainActivity onSuccess 444 dataObject = "+dataObject.size());

                                        LogUtils.e("MainActivity onSuccess 555 dataObject = "+dataObject.toString());

                                        LogUtils.e("MainActivity onSuccess 666 dataObject = "+dataObject.get(0));
//                                        LogUtils.e("MainActivity onSuccess 666 dataObject = "+myBean.getStatus());

                                        LogUtils.e("MainActivity onSuccess 777 dataObject = "+dataObject.get(0).toString());


                                    }
                                });


                    }

                    @Override
                    public void onDenied(List<String> permissionsDeniedForever,
                                         List<String> permissionsDenied) {
                        if (!permissionsDeniedForever.isEmpty()) {
                            PermissionUtils.launchAppDetailsSettings();
                        }
                    }
                }).request();
    }


}

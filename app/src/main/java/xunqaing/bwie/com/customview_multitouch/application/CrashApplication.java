package xunqaing.bwie.com.customview_multitouch.application;

import android.app.Application;

import xunqaing.bwie.com.customview_multitouch.crash.CrashHandler;


public class CrashApplication extends Application {
    @Override  
    public void onCreate() {  
        super.onCreate();  
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());  
    }  
}  
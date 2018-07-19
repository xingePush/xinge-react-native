package com.xgreactnativeexample;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.tencent.android.tpush.XGPushConfig;

import java.util.HashMap;
import java.util.Map;

public class RN_XGPushConfig_Module extends ReactContextBaseJavaModule {

    public RN_XGPushConfig_Module(ReactApplicationContext reactContext){
        super(reactContext);
    }

    @Override
    public String getName(){
        return "RN_XGPushConfig_Module";
    }

    @Override
    public Map<String, Object> getConstants() {
        Map<String, Object> contants = new HashMap<>();


        return contants;
    }


    @ReactMethod
    public void enableDebug(boolean debugMode){
        XGPushConfig.enableDebug(getReactApplicationContext(),debugMode);
    }


    @ReactMethod
    public void setAccessId(long accessId){
       XGPushConfig.setAccessId(getReactApplicationContext(),accessId);
    }

    @ReactMethod
    public void setAccessKey(String accessKey){
        XGPushConfig.setAccessKey(getReactApplicationContext(),accessKey);
    }

    @ReactMethod
    public String getToken(){
       return XGPushConfig.getToken(getReactApplicationContext());
    }

    @ReactMethod
    public void setReportNotificationStatusEnable(boolean debugMode){
        XGPushConfig.setReportNotificationStatusEnable(getReactApplicationContext(),debugMode);
    }

    @ReactMethod
    public void setReportApplistEnable(boolean debugMode){
        XGPushConfig.setReportApplistEnable(getReactApplicationContext(),debugMode);
    }

    @ReactMethod
    public void enableOtherPush(boolean flag){
        XGPushConfig.enableOtherPush(getReactApplicationContext(),flag);
    }

    @ReactMethod
    public void setMiPushAppId(String appid){
        XGPushConfig.setMiPushAppId(getReactApplicationContext(),appid);
    }


    @ReactMethod
    public void setMiPushAppKey(String appkey){
        XGPushConfig.setMiPushAppKey(getReactApplicationContext(),appkey);
    }

    @ReactMethod
    public void setMzPushAppId(String appid){
        XGPushConfig.setMiPushAppId(getReactApplicationContext(),appid);
    }


    @ReactMethod
    public void setMzPushAppKey(String appkey){
        XGPushConfig.setMzPushAppKey(getReactApplicationContext(),appkey);
    }

    @ReactMethod
    public void setHuaweiDebug(boolean isHuaweiDebug){
        XGPushConfig.setHuaweiDebug(isHuaweiDebug);
    }

}

package com.xgreactnativeexample;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.tencent.android.tpush.XGPushManager;

import java.util.HashMap;
import java.util.Map;

public class RN_XGPushManager_Module extends ReactContextBaseJavaModule {


    public RN_XGPushManager_Module(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "RN_XGPushManager_Module";
    }


    @Override
    public Map<String, Object> getConstants() {
        Map<String, Object> contants = new HashMap<>();


        return contants;
    }


    @ReactMethod
    public void registerPush() {
        XGPushManager.registerPush(getReactApplicationContext());
    }


    @ReactMethod
    public void bindAccount(String account) {
        XGPushManager.bindAccount(getReactApplicationContext(), account);
    }


    @ReactMethod
    public void appendAccount(String account){
        XGPushManager.appendAccount(getReactApplicationContext(),account);
    }

    @ReactMethod
    public void delAccount(String account){
        XGPushManager.delAccount(getReactApplicationContext(),account);
    }

    @ReactMethod
    public void unRegisterPush(){
        XGPushManager.unregisterPush(getReactApplicationContext());
    }

    @ReactMethod
    public void setTag(String tagName){
        XGPushManager.setTag(getReactApplicationContext(),tagName);
    }

    @ReactMethod
    public void deleteTag(String tagName){
        XGPushManager.deleteTag(getReactApplicationContext(),tagName);
    }

    @ReactMethod
    public boolean isNotificationOpened(){
        return XGPushManager.isNotificationOpened(getReactApplicationContext());
    }


    @ReactMethod
    public void cancelNotification(int id){
        XGPushManager.cancelNotifaction(getReactApplicationContext(),id);
    }

    @ReactMethod
    public void cancelAllNotification(){
        XGPushManager.cancelAllNotifaction(getReactApplicationContext());
    }


}


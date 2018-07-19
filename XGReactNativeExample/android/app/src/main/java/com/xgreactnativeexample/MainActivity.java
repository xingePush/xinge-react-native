package com.xgreactnativeexample;

import android.os.Bundle;
import android.util.Log;

import com.facebook.react.ReactActivity;
import com.tencent.android.tpush.XGIOperateCallback;
import com.tencent.android.tpush.XGPushConfig;
import com.tencent.android.tpush.XGPushManager;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "xgreactnativeexample";
    }

    //原生调用方式
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        //开启debug日志数据
//        XGPushConfig.enableDebug(this,true);
//
//        //token注册
//        XGPushManager.registerPush(this, new XGIOperateCallback() {
//            @Override
//            public void onSuccess(Object data, int flag) {
////token在设备卸载重装的时候有可能会变
//                Log.d("TPush", "注册成功，设备token为：" + data);
//            }
//            @Override
//            public void onFail(Object data, int errCode, String msg) {
//                Log.d("TPush", "注册失败，错误码：" + errCode + ",错误信息：" + msg);
//            }
//        });
//
//        //设置账号
//        //注意在3.2.2 版本信鸽对账号绑定和解绑接口进行了升级具体详情请参考API文档。
////        XGPushManager.bindAccount(getApplicationContext(), "XINGE");
//
//
//        //设置标签
//        XGPushManager.setTag(this,"XINGE");
//
//    }
}

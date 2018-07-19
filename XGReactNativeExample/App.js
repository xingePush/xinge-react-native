/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, {Component} from 'react';
import {Platform, StyleSheet, Text, View, Alert,Button} from 'react-native';
import RN_XGPushConfig_Module from './RN_XGPushConfig_Module'
import RN_XGPushManager_Module from './RN_XGPushManager_Module'

// import {NativeModules} from 'react-native';
//
// var xg = NativeModules.XGModule;
// xg.startXGWithAppID(2200262432, "I89WTUY132GJ", (result, error) => {
//     Alert.alert(result);
// });

const instructions = Platform.select({
    ios: 'Press Cmd+R to reload,\n' + 'Cmd+D or shake for dev menu',
    android:
    'Double tap R on your keyboard to reload,\n' +
    'Shake or press menu button for dev menu',
});

type Props = {};
export default class App extends Component<Props> {
    render() {
        return (
            <View style={styles.container}>
                <Text style={styles.welcome}>信鸽Android React Native示例</Text>
                <Text style={styles.instructions}>step1.对应原生XGPushConfig类相关的调用</Text>
                <Button
                    onPress={() => {

                        //开启调试日志
                        RN_XGPushConfig_Module.enableDebug(true);

                        //设置上报通知栏是否打开 默认打开
                        RN_XGPushConfig_Module.setReportNotificationStatusEnable(true);

                        //设置上报APP 列表，用于智能推送 默认打开
                        RN_XGPushConfig_Module.setReportApplistEnable(true);

                        //设置支持第三方厂商推送, 如需开启(请参照文档配置)
                        RN_XGPushConfig_Module.enableOtherPush(false);

                        //设置小米推送的ID(如果已开启第三方推送的支持)
                        RN_XGPushConfig_Module.setMiPushAppId('');

                        //设置小米推送的APPKEY
                        RN_XGPushConfig_Module.setMiPushAppKey('');

                        //设置魅族推送APPID
                        RN_XGPushConfig_Module.setMzPushAppId('');

                        //设置魅族推送APPKEY
                        RN_XGPushConfig_Module.setMzPushAppKey('');

                        //开启华为推送的日志
                        RN_XGPushConfig_Module.setHuaweiDebug(false);

                        Alert.alert('初始化配置完毕');


                    }}
                    title="初始化配置"
                />
                <Text style={styles.instructions}>step2.对应原生XGPushManager类相关的调用</Text>
                <Button
                    onPress={() => {
                        //注册信鸽
                        RN_XGPushManager_Module.registerPush();

                        //启动并注册APP，同时绑定账号,推荐有帐号体系的APP使用
                        // （3.2.2以及3.2.2之后的版本使用，此接口会覆盖设备之前绑定过的账号，
                        // 仅当前注册的账号生效，无注册回调）
                        RN_XGPushManager_Module.bindAccount('');  //替换成要绑定的帐号

                        //增加更多绑定的帐号（3.2.2以及3.2.2之后的版本使用）
                        RN_XGPushManager_Module.appendAccount('');  //替换成要绑定的帐号

                        //解绑指定账号（3.2.2以及3.2.2之后的版本使用）
                        //RN_XGPushManager_Module.delAccount('');  //解绑指定帐号

                        //设置标签
                        RN_XGPushManager_Module.setTag('');  //替换成要设置的tagName

                        //删除设备绑定的指定标签
                        //RN_XGPushManager_Module.deleteTag(''); //替换成要删除的标签

                        //检测通知栏是否关闭
                        var isNotificationOpened = RN_XGPushManager_Module.isNotificationOpened();


                        //清除单个通知
                        //RN_XGPushManager_Module.cancelNotification(0); //替换成通知的id

                        //清除通知栏所有通知
                        //RN_XGPushManager_Module.cancelAllNotification();

                        //反注册，建议在不需要接收推送的时候调用
                        //RN_XGPushManager_Module.unregisterPush('');

                        //重点关注"XINGE"和"xg_service"字样的日志
                        Alert.alert('启动信鸽完毕，请通过Logcat查看相关日志');
                    }}
                    title="启动信鸽"
                />
                {/*<Text style={styles.instructions}>{instructions}</Text>*/}
            </View>
        );
    }
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: '#F5FCFF',
    },
    welcome: {
        fontSize: 20,
        textAlign: 'center',
        margin: 10,
    },
    instructions: {
        textAlign: 'center',
        color: '#333333',
        marginBottom: 5,
    },
});

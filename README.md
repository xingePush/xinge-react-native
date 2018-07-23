# 信鸽 SDK 的 React-Native 示例
不包含完整的功能，如果有需要官方协助增加功能，请提交[Issue](https://github.com/xingePush/xinge-react-native/issues)  

## Android接入说明 
官方文档地址:[点我](http://docs.developer.qq.com/xg/android_access.html)  
1. 核心js源码在App.js， 原生封装在android目录。
2. 通过react-native run-android，即可调起android示例。
3. 通过logcat可以查看相关的日志记录。

成功的话会有以下日志:
[XGPushManager] XG register push success with token
![成功的日志](https://github.com/xingePush/xinge-react-native/blob/master/doc/success.png)

失败相关日志:
XG register push failed

## iOS接入说明

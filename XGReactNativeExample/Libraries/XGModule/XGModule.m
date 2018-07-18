#import "XGModule.h"
#import <UIKit/UIKit.h>

#if __has_include(<React/RCTBridge.h>)
#import <React/RCTEventDispatcher.h>
#import <React/RCTRootView.h>
#import <React/RCTBridge.h>
#import <React/RCTLog.h>

#elif __has_include("RCTBridge.h")
#import "RCTEventDispatcher.h"
#import "RCTRootView.h"
#import "RCTBridge.h"
#import "RCTLog.h"
#elif __has_include("React/RCTBridge.h")
#import "React/RCTEventDispatcher.h"
#import "React/RCTRootView.h"
#import "React/RCTBridge.h"
#import "React/RCTLog.h"
#endif

@interface XGModule()<XGPushDelegate>
{
  RCTResponseSenderBlock xgDidFinishStartCallback;
  RCTResponseSenderBlock receivedRemoteNotificationCallback;
  RCTResponseSenderBlock clickedNotificationCallback;
}
@end

@implementation XGModule

RCT_EXPORT_MODULE()

- (dispatch_queue_t)methodQueue
{
  return dispatch_get_main_queue();
}

RCT_EXPORT_METHOD(startXGWithAppID:(NSInteger)appID appKey:(NSString *)appKey callback:(RCTResponseSenderBlock)callback)
{
  [[XGPush defaultManager] startXGWithAppID:(uint32_t)appID appKey:appKey delegate:self];
  xgDidFinishStartCallback = callback;
}

- (void)xgPushDidFinishStart:(BOOL)isSuccess error:(NSError *)error {
  xgDidFinishStartCallback(@[isSuccess ? @"true" : @"false", error ? error.localizedDescription : @""]);
}

@end

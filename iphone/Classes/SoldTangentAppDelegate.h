//
//  SoldTangentAppDelegate.h
//  SoldTangent
//
//  Created by Paul Hammant on 7/28/10.
//  Copyright (c) 2010 ThoughtWorks. All rights reserved.
//


#import <UIKit/UIKit.h>

@class MainViewController;

@interface SoldTangentAppDelegate : NSObject <UIApplicationDelegate> {

    UIWindow *window;

    MainViewController *mainViewController;
}

@property (nonatomic, retain) IBOutlet UIWindow *window;


@property (nonatomic, retain) IBOutlet MainViewController *mainViewController;

@end


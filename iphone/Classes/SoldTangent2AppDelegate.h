//
//  SoldTangent2AppDelegate.h
//  SoldTangent2
//
//  Created by Paul Hammant on 7/28/10.
//  Copyright (c) 2010 __MyCompanyName__. All rights reserved.
//


#import <UIKit/UIKit.h>

@class MainViewController;

@interface SoldTangent2AppDelegate : NSObject <UIApplicationDelegate> {

    UIWindow *window;

    MainViewController *mainViewController;
}

@property (nonatomic, retain) IBOutlet UIWindow *window;


@property (nonatomic, retain) IBOutlet MainViewController *mainViewController;

@end


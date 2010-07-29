//
//  SoldTangent2AppDelegate.m
//  SoldTangent2
//
//  Created by Paul Hammant on 7/28/10.
//  Copyright (c) 2010 __MyCompanyName__. All rights reserved.
//


#import "SoldTangent2AppDelegate.h"

#import "MainViewController.h"

@implementation SoldTangent2AppDelegate


@synthesize window;

@synthesize mainViewController;

- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions {

    // Override point for customization after application launch.
    // Add the main view controller's view to the window and display.
    [window addSubview:mainViewController.view];
    [window makeKeyAndVisible];
    return YES;
}

- (void)applicationWillTerminate:(UIApplication *)application {

    // Save data if appropriate.
}

- (void)dealloc {

    [window release];
    [mainViewController release];
    [super dealloc];
}

@end


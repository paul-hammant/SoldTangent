//
//  TangentViewController.h
//  SoldTangent
//
//  Created by Paul Hammant on 7/28/10.
//  Copyright (c) 2010 ThoughtWorks. All rights reserved.
//

#import <UIKit/UIKit.h>

@protocol TangentViewControllerDelegate;


@interface TangentViewController : UIViewController {
	id <TangentViewControllerDelegate> delegate;
}

@property (nonatomic, assign) id <TangentViewControllerDelegate> delegate;
- (IBAction)done:(id)sender;
@end


@protocol TangentViewControllerDelegate
- (void)tangentViewControllerDidFinish:(TangentViewController *)controller;
@end


package com.example.eugene.solid.dip;

public class DependencyInversionPrincipleTester {
    public static void main(String[] args) {
        final SlidingAnimation slidingAnimation = new SlidingAnimation();
        AnimationTester animationTester = new AnimationTester(slidingAnimation);
        animationTester.testAnimation();

        final HidingAnimation hidingAnimation = new HidingAnimation();
        animationTester = new AnimationTester(hidingAnimation);
        animationTester.testAnimation();
    }
}


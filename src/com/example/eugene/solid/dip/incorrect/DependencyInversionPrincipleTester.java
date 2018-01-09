package com.example.eugene.solid.dip.incorrect;

public class DependencyInversionPrincipleTester {
    public static void main(String[] args) {
        final SlidingAnimation slidingAnimation = new SlidingAnimation();
        final SlidingAnimationTester slidingAnimationTester = new SlidingAnimationTester(slidingAnimation);
        slidingAnimationTester.testAnimation();

        final HidingAnimation hidingAnimation = new HidingAnimation();
        final HidingAnimationTester hidingAnimationTester = new HidingAnimationTester(hidingAnimation);
        hidingAnimationTester.testAnimation();
    }
}

// incorrect - need to create separate classes for each specific type
// for sliding
class SlidingAnimationTester {
    // incorrect - dependency on a specific type
    private SlidingAnimation slidingAnimation;

    public SlidingAnimationTester(final SlidingAnimation slidingAnimation) {
        this.slidingAnimation = slidingAnimation;
    }
    public void testAnimation() {
        slidingAnimation.animate();
    }
}

// for hiding
class HidingAnimationTester {
    // dependency on a specific type
    private HidingAnimation hidingAnimation;

    public HidingAnimationTester(final HidingAnimation hidingAnimation) {
        this.hidingAnimation = hidingAnimation;
    }
    public void testAnimation() {
        hidingAnimation.animate();
    }
}

class SlidingAnimation implements Animation {
    @Override
    public void animate() {
        System.out.println("Sliding animation");
    }
}

class HidingAnimation implements Animation {
    @Override
    public void animate() {
        System.out.println("Hiding animation");
    }
}

interface Animation {
    void animate();
}


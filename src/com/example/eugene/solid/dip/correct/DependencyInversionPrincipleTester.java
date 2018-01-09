package com.example.eugene.solid.dip.correct;

// Dependency Inversion Principle (DIP):
// Create dependency on abstractions
// and not on a specific types.
public class DependencyInversionPrincipleTester {
    public static void main(String[] args) {
        final SlidingAnimation slidingAnimation = new SlidingAnimation();
        AnimationTester animationTester = new AnimationTester(slidingAnimation);
        animationTester.testAnimation();

        final HidingAnimation hidingAnimation = new HidingAnimation();
        // no error - works with all derived types of abstraction
        animationTester = new AnimationTester(hidingAnimation);
        animationTester.testAnimation();
    }
}

// correct - one class for different derived types
class AnimationTester {
    // correct - dependency on abstraction
    private Animation animation;

    public AnimationTester(final Animation animation) {
        this.animation = animation;
    }
    public void testAnimation() {
        animation.animate();
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

package com.example.eugene.solid.dip;

class AnimationTester {
    private Animation animation;

    public AnimationTester(final Animation animation) {
        this.animation = animation;
    }

    public void testAnimation() {
        animation.animate();
    }
}

package com.example.eugene.solid.dip;

class HidingAnimation implements Animation {
    @Override
    public void animate() {
        System.out.println("Hiding animation");
    }
}

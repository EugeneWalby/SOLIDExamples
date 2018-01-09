package com.example.eugene.solid.isp;

class MediaPlayer implements AudioFunctionality, VideoFunctionality {
    @Override
    public void playMusic() {
        System.out.println("MediaPlayer: music playing");
    }

    @Override
    public void playVideo() {
        System.out.println("MediaPlayer: video playing");
    }
}

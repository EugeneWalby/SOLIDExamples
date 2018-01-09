package com.example.eugene.solid.isp;

// Interface Segregation Principle (ISP):
// A lot of specifically targeted interfaces are better
// than one general-purpose interface.
public class InterfaceSegregationPrincipleTester {
    public static void main(String[] args) {
        final MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.playMusic();

        final MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.playMusic();
        mediaPlayer.playVideo();
    }
}


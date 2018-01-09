package com.example.eugene.solid.isp.incorrect;

public class InterfaceSegregationPrincipleTester {
    public static void main(String[] args) {
        final MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.playMusic();

        final MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.playMusic();
        mediaPlayer.playVideo();
    }
}

class MusicPlayer implements MediaFunctionality {
    @Override
    public void playMusic() {
        System.out.println("MusicPlayer: music playing");
    }

    @Override
    public void playVideo() {
        // incorrect - the method needs to be overridden but it's not used
    }
}

class MediaPlayer implements MediaFunctionality {
    @Override
    public void playMusic() {
        System.out.println("MediaPlayer: music playing");
    }

    @Override
    public void playVideo() {
        System.out.println("MediaPlayer: video playing");
    }
}

// incorrect - one general-purpose interface
interface MediaFunctionality {
    void playMusic();
    void playVideo();
}


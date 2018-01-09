package com.example.eugene.solid.isp.correct;

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

class MusicPlayer implements AudioFunctionality {
    // correct - just necessary methods implementation
    @Override
    public void playMusic() {
        System.out.println("MusicPlayer: music playing");
    }
}

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

// correct - each interface for a specific purpose
interface AudioFunctionality {
    void playMusic();
}

interface VideoFunctionality {
    void playVideo();
}



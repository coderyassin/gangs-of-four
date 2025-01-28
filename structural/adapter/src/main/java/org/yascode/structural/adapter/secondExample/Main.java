package org.yascode.structural.adapter.secondExample;

public class Main {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "chanson.mp3");
        audioPlayer.play("vlc", "film.vlc");
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.play("avi", "video.avi");
    }
}


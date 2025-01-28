package org.yascode.structural.adapter.secondExample;

public class MediaAdapter implements MediaPlayer {
    private AdvancedAudioPlayer advancedAudioPlayer;

    public MediaAdapter(String audioType) {
        switch (audioType) {
            case "mp3" -> advancedAudioPlayer = new Mp3Player();
            case "vlc" -> advancedAudioPlayer = new VlcPlayer();
            case "mp4" -> advancedAudioPlayer = new Mp4Player();
            default -> throw new IllegalArgumentException("Invalid media. " + audioType + " format not supported");
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        switch (audioType) {
            case "mp3" -> advancedAudioPlayer.playMp3(fileName);
            case "vlc" -> advancedAudioPlayer.playVlc(fileName);
            case "mp4" -> advancedAudioPlayer.playMp4(fileName);
            default -> throw new IllegalArgumentException("Invalid media. " + audioType + " format not supported");
        }
    }
}

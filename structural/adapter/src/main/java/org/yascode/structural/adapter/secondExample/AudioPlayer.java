package org.yascode.structural.adapter.secondExample;

public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        switch (audioType) {
            case "mp3", "vlc", "mp4" -> {
                mediaAdapter = new MediaAdapter(audioType);
                mediaAdapter.play(audioType, fileName);
            }
            default -> throw new IllegalArgumentException("Invalid media. " + audioType + " format not supported");
        }
    }
}

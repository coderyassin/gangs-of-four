package org.yascode.structural.adapter.secondExample;

public class Mp3Player implements AdvancedAudioPlayer {
    @Override
    public void playVlc(String fileName) {
        defaultPlayVlc(fileName);
    }

    @Override
    public void playMp3(String fileName) {
        System.out.println("Mp3 file playback:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        defaultPlayMp4(fileName);
    }
}

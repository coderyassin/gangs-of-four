package org.yascode.structural.adapter.secondExample;

public class Mp4Player implements AdvancedAudioPlayer {
    @Override
    public void playVlc(String fileName) {
        defaultPlayVlc(fileName);
    }

    @Override
    public void playMp3(String fileName) {
        defaultPlayVlc(fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Mp4 file playback:" + fileName);
    }
}

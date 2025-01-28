package org.yascode.structural.adapter.secondExample;

public class VlcPlayer implements AdvancedAudioPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("VLC file playback:" + fileName);
    }

    @Override
    public void playMp3(String fileName) {
        defaultPlayVlc(fileName);
    }

    @Override
    public void playMp4(String fileName) {
        defaultPlayMp4(fileName);
    }
}

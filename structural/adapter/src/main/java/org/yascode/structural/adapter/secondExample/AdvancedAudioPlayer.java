package org.yascode.structural.adapter.secondExample;

public interface AdvancedAudioPlayer {
    void playVlc(String fileName);

    void playMp3(String fileName);

    void playMp4(String fileName);

    default void defaultPlayVlc(String fileName) {
    }

    default void defaultPlayMp3(String fileName) {
    }

    default void defaultPlayMp4(String fileName) {
    }

}

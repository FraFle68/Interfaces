package org.example.task230831;

public class Main {
    public static void main(String[] args) {
        MediaController livingRoomSystem = new MediaController();

        MusicPlayer radio = new MusicPlayer();
        VideoPlayer blueray = new VideoPlayer();

        livingRoomSystem.playMedia(radio);
        livingRoomSystem.playMedia(blueray);
    }
}
